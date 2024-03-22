package SpringBoot.itiro.Beto.com.github.SpringBootCourse.service;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Produto;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstoqueService {

    @Autowired
    ProdutoRepository produtoRepository;

    //Get de produto

    //Buscando os produtos no estoque

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    //buscando produto por id
    public Optional<Produto> findById(Long id){
        return produtoRepository.findById(id);
    }
}
