package SpringBoot.itiro.Beto.com.github.SpringBootCourse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    //@RequestMapping(method = RequestMethod.GET, path = "/ola")
    @GetMapping(path = {"ola", "saudacao"})
    //Não se pode ter uma url sendo mapeada para mais de um metodo
    //colocando a mesma url (saudacao), com os verbos http diferentes, não dara um erro

    public String ola(){
        return "Ola Spring Boot";
    }
}
