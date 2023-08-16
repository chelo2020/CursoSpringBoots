package com.tpfinal.TrabajoFinal.Service;

import com.tpfinal.TrabajoFinal.Model.Cliente;
import com.tpfinal.TrabajoFinal.Repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteRepository repoCliente;

    @Override
    public List<Cliente> getCliente() {

        List<Cliente> listaclientes=repoCliente.findAll();

        return listaclientes;

    }

    @Override
    public void saveCliente(Cliente cli) {
        repoCliente.save(cli);
    }

    @Override
    public void deleteCliente(Long id_cliente) {
        repoCliente.deleteById(id_cliente);
    }

    @Override
    public Cliente findCliente(Long id_cliente) {
        return repoCliente.findById(id_cliente).orElse(null);
    }

    @Override
    public void editCliente(Cliente cli) {
        this.saveCliente(cli);
    }
}
