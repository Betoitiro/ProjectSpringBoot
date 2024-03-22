package SpringBoot.itiro.Beto.com.github.SpringBootCourse.service;


import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Produto;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public void createProduct(Produto produto){
        produtoRepository.save(produto);
    }

    public void produtoUpdated(Long id, Produto produto){
        Optional<Produto> produtoFromDb = produtoRepository.findById(id);

        if(produtoFromDb.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado");
        }

        Produto produtoUp = produtoFromDb.get();
        produtoUp.setName(produto.getName());
        produtoUp.setPreco(produto.getPreco());
        produtoUp.setQntd(produto.getQntd());
        produtoUp.setCategory(produto.getCategory());

        produtoRepository.save(produtoUp);
    }

    public void deleteProduct(Long id) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        produtoRepository.delete(produtoOptional.get());
    }
}


