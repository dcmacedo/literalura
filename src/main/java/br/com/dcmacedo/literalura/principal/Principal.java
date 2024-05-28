package br.com.dcmacedo.literalura.principal;

import br.com.dcmacedo.literalura.repositories.LivroRepository;
import br.com.dcmacedo.literalura.services.ConsumoApi;

public class Principal {

    private ConsumoApi consumo = new ConsumoApi();

    public Principal(LivroRepository repositorio) {
    }

    public void exibeMenu() {
    }
}
