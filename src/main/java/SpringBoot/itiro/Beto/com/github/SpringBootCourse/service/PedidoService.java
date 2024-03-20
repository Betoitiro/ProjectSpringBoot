package SpringBoot.itiro.Beto.com.github.SpringBootCourse.service;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Cliente;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Pedido;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.repository.ClienteRepository;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    public void criarPedido(Long id, Pedido pedido) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado");
        }

        Cliente cliente = clienteOptional.get();
        pedido.setCliente(cliente);

        pedidoRepository.save(pedido);
    }



}
