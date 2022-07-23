package beatrizmioranza.linguagens.api;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class LinguagensApiApplication {

	private List<Linguagem> linguagens = 
	List.of(
		new Linguagem ("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),

		new Linguagem ("PHP","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 2)
	
	);

	public static void main(String[] args) {
		SpringApplication.run(LinguagensApiApplication.class, args);
	}

	@GetMapping("/linguagens")
	public List<Linguagem> ObterLinguagens(){ 
		return linguagens;
	}

}
