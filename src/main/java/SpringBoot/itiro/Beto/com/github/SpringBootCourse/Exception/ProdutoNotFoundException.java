package SpringBoot.itiro.Beto.com.github.SpringBootCourse.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ProdutoNotFoundException extends ResponseStatusException {
    public ProdutoNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
}
