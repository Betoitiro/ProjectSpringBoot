package SpringBoot.itiro.Beto.com.github.SpringBootCourse.controller;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Produto;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.repository.ProdutoRepository;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.Exception.ProdutoNotFoundException;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Produto produto){
        produtoService.createProduct(produto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody Produto produto, @PathVariable Long id){
            produtoService.produtoUpdated(id, produto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        try {
            produtoService.deleteProduct(id);
        } catch (ProdutoNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
