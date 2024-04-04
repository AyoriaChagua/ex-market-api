package com.market.ex.market.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.market.ex.market.domain.Client;
import com.market.ex.market.domain.repository.ClientRepository;
import com.market.ex.market.persistence.crud.ClientCrudRepository;
import com.market.ex.market.persistence.entity.Cliente;
import com.market.ex.market.persistence.mapper.ClientMapper;

@Repository
public class ClienteRepository implements ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    @Autowired
    private ClientMapper mapper;

    @Override
    public List<Client> getAll() {
        return  mapper.toClients((List<Cliente>) clientCrudRepository.findAll());
    }

    @Override
    public Optional<Client> getClient(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClient'");
    }

    @Override
    public Client save(Client client) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
