package SpringBoot.itiro.Beto.com.github.SpringBootCourse.controller;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

}
