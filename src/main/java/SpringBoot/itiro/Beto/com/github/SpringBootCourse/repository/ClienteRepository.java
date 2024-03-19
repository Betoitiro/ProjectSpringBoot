package SpringBoot.itiro.Beto.com.github.SpringBootCourse.repository;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
