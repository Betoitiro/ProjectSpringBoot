package SpringBoot.itiro.Beto.com.github.SpringBootCourse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Cliente {
    private int id;
    private String name;
    private String cpf;

    public Cliente (int id, String name, String cpf){
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }


}
