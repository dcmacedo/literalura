package br.com.dcmacedo.literalura.principal;

import br.com.dcmacedo.literalura.models.Autor;
import br.com.dcmacedo.literalura.models.LivroDados;
import br.com.dcmacedo.literalura.models.Livro;
import br.com.dcmacedo.literalura.repositories.LivroRepository;
import br.com.dcmacedo.literalura.services.ConsultaAPI;
import br.com.dcmacedo.literalura.services.ConverteDados;

import java.time.Year;
import java.util.DoubleSummaryStatistics;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private ConsultaAPI consultaAPI = new ConsultaAPI();
    private ConverteDados converteDados = new ConverteDados();
    private Scanner leitura = new Scanner(System.in);
    private LivroRepository repository;
    private String endereco = "https://gutendex.com/books/?search=";

    public Principal(LivroRepository repository) {
        this.repository = repository;
    }

    public void exibeMenu(){
        int opcao = -1;
        while (opcao != 0){
            String menu = """
                \n-------------------------------------------
                       *** Escolha uma das opções ***
                -------------------------------------------
                1 - Buscar livros por título
                2 - Listar livros cadastrados
                3 - Listar Autores cadastrados
                4 - Listar Autores vivos em determinado ano
                5 - Listar Livros em determinado idioma
                6 - Listar Livros em um determinado idioma
                7 - Listar Estatísticas dos livros
                
                0 - Sair
                -------------------------------------------
                """;
            try {
                System.out.println(menu);
                opcao = leitura.nextInt();
                leitura.nextLine();

                switch (opcao){
                    case 1:
                        buscarLivro();
                        break;
                    case 2:
                        listarLivros();
                        break;
                    case 3:
                        listarAutores();
                        break;
                    case 4:
                        listarAutoresVivosNoAno();
                        break;
                    case 5:
                        listarLivrosPorIdioma();
                        break;
                    case 6:
                        quantidadeLivrosPorIdioma();
                        break;
                    case 7:
                        estatisticasLivros();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                leitura.nextLine();
            }
        }
    }

    private void buscarLivro() {
        System.out.println("Digite o nome do livro que deseja buscar: ");
        var nomeLivro = leitura.nextLine();
        System.out.println("Buscando...");
        String enderecoBusca = endereco.concat(nomeLivro.replace(" ", "+").toLowerCase().trim());

        String json = consultaAPI.buscar(enderecoBusca);
        String jsonLivro = converteDados.extraiObjetoJson(json, "results");

        List<LivroDados> livrosDTO = converteDados.obterLista(jsonLivro, LivroDados.class);

        if (livrosDTO.size() > 0) {
            Livro livro = new Livro(livrosDTO.get(0));

            //Verifica se o Autor já está cadastrado
            Autor autor = repository.buscarAutorPeloNome(livro.getAutor().getAutor());
            if (autor != null) {
                livro.setAutor(null);
                repository.save(livro);
                livro.setAutor(autor);
            }
            livro = repository.save(livro);
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    private void listarLivros() {
        List<Livro> livros = repository.findAll();
        livros.forEach(System.out::println);
    }

    private void listarAutores() {
        List<Autor> autores = repository.buscarAutores();
        autores.forEach(System.out::println);
    }

    private void listarAutoresVivosNoAno() {
        try {
            System.out.println("Digite o ano:");
            int ano = leitura.nextInt();
            leitura.nextLine();

            List<Autor> autores = repository.buscarAutoresVivosNoAno(Year.of(ano));
            autores.forEach(System.out::println);
        }catch (InputMismatchException e){
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            leitura.nextLine();
        }
    }

    private void listarLivrosPorIdioma() {
        System.out.println("""
                Digite o idioma para busca
                es - espanhol
                en - inglês
                fr - francês
                pt - português
                """);
        String idioma = leitura.nextLine();
        List<Livro> livros = repository.findByIdioma(idioma);
        if (!livros.isEmpty()){
            livros.forEach(System.out::println);
        }else{
            System.out.println("Não exite livros nesse idioma cadastrado");
        }
    }

    private void quantidadeLivrosPorIdioma() {
        System.out.println("""
                Digite o idioma para busca
                es - espanhol
                en - inglês
                fr - francês
                pt - português
                """);
        String idioma = leitura.nextLine();
        Integer quantidadeIdioma = repository.countByIdioma(idioma);
        System.out.printf("O idioma %s tem %d livros cadastrado\n", idioma, quantidadeIdioma);
    }

    private void estatisticasLivros() {
        DoubleSummaryStatistics statistics = new DoubleSummaryStatistics();

        List<Double> dadosDaConsulta = repository.buscaNumeroDownload();
        for (Double valor : dadosDaConsulta){
            statistics.accept(valor);
        }

        System.out.println("Estatísticas de Downloads dos Livros:");
        System.out.println("Média: " + statistics.getAverage());
        System.out.println("Mínimo: " + statistics.getMin());
        System.out.println("Máximo: " + statistics.getMax());
        System.out.println("Soma: " + statistics.getSum());
        System.out.println("Contagem: " + statistics.getCount());
    }
}
