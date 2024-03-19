package SpringBoot.itiro.Beto.com.github.SpringBootCourse.controller;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Cliente;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create (@RequestBody Cliente cliente){
        clienteService.create(cliente);
    }

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Cliente> findByid(@PathVariable Long id){
        return clienteService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody Cliente cliente, @PathVariable Long id){
        clienteService.update(id, cliente);
    }
}
