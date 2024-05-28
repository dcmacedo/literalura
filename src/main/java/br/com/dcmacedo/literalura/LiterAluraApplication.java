package br.com.dcmacedo.literalura;

import br.com.dcmacedo.literalura.repositories.LivroRepository;
import br.com.dcmacedo.literalura.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	private final LivroRepository repositorio;

    public LiterAluraApplication(LivroRepository repositorio) {
        this.repositorio = repositorio;
    }

    public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
