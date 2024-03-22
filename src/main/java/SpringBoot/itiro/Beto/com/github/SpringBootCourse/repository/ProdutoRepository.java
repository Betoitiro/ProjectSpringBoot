package SpringBoot.itiro.Beto.com.github.SpringBootCourse.repository;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
