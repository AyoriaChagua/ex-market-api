package com.market.ex.market.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.ex.market.domain.Client;
import com.market.ex.market.domain.repository.ClientRepository;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.getAll();
    }
    public void save(Client client) {
        clientRepository.save(client);
    }
    public Optional<Client> getClient(String clientId) {
        return clientRepository.getClient(clientId);
    }
}
