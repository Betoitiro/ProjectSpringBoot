package SpringBoot.itiro.Beto.com.github.SpringBootCourse.controller;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Produto;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.service.EstoqueService;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    EstoqueService estoqueService;

    //Pegando todos os produtos do estoque
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> findAll(){
        return estoqueService.findAll();
    }

    //Pegando apenas um produto do estoque

    

}
