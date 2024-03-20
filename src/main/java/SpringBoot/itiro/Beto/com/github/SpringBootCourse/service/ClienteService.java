package SpringBoot.itiro.Beto.com.github.SpringBootCourse.service;

import SpringBoot.itiro.Beto.com.github.SpringBootCourse.model.Cliente;
import SpringBoot.itiro.Beto.com.github.SpringBootCourse.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service // Indica que esta classe atenderá os serviços do sistema
public class ClienteService {

    // Injeção do ClienteRepository
    @Autowired
    ClienteRepository clienteRepository;

    /*
     * O que é @Autowired?
     *
     * É uma anotação que injeta automaticamente as dependências em componentes gerenciados pelo contêiner de inversão de controle (IoC),
     * como o Spring Framework.
     *
     * Nesse caso, o @Autowired injeta automaticamente as instâncias de ClienteRepository em ClienteService.
     *
     */

    // Métodos


    //GET
    // Buscando todos os clientes
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    // Buscando cliente por ID
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    //Buscando produto



    // Criando um cliente
    public void create(Cliente cliente) {
        clienteRepository.save(cliente);
    }



    // Atualizando um cliente
    public void update(Long id, Cliente cliente) {
        Optional<Cliente> clienteFromDb = clienteRepository.findById(id);

        if (clienteFromDb.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado");
        }

        Cliente clienteUpdated = clienteFromDb.get();
        clienteUpdated.setName(cliente.getName());
        clienteUpdated.setCpf(cliente.getCpf());
        clienteUpdated.setEmail(cliente.getEmail());

        clienteRepository.save(clienteUpdated);
    }
}
