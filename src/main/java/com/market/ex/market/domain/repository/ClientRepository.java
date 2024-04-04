package com.market.ex.market.domain.repository;

import java.util.List;
import java.util.Optional;

import com.market.ex.market.domain.Client;

public interface ClientRepository {
    List<Client> getAll();
    Optional<Client> getClient(String id);
    Client save(Client client);
}
