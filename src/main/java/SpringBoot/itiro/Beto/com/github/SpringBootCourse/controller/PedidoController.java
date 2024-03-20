package SpringBoot.itiro.Beto.com.github.SpringBootCourse.controller;


import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Pedido;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Peididos")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;


    //metodos

    //GET




    //POST
    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void criarPedido(@PathVariable Long clienteId, @RequestBody Pedido pedido) {
        pedidoService.criarPedido(clienteId, pedido);
    }


}
