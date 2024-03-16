package SpringBoot.itiro.Beto.com.github.SpringBootCourse.controller;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    //Usando parametros no web Srvice (passando parametros pela url)
    @GetMapping("/{id}")
    public  Cliente obterClientePor(@PathVariable  int id)//PathVariable atribui a uma variavel
    {
        return new Cliente(id, "Maira ", "987.654.321-00");
    }

}
