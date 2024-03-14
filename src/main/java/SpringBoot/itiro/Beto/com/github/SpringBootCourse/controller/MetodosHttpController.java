package SpringBoot.itiro.Beto.com.github.SpringBootCourse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("metodos")
public class MetodosHttpController {

    @GetMapping
    public String get(){
        return "requisicao GET";
    }

    @PostMapping
    public String post (){
        return "requisicao POST";
    }

    @PutMapping
    public String put(){
        return "Requisicao PUT";
    }

    @PatchMapping
    public String patch(){
        return "Requisicao PATCH";
    }

    @DeleteMapping
    public String delete(){
        return "requisicao DELETE";
    }
}
