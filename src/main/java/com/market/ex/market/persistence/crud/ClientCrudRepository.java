package com.market.ex.market.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.market.ex.market.persistence.entity.Cliente;

public interface ClientCrudRepository extends CrudRepository<Cliente, String> {

}
