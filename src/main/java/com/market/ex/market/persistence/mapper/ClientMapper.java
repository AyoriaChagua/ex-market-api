package com.market.ex.market.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.market.ex.market.domain.Client;
import com.market.ex.market.persistence.entity.Cliente;


@Mapper(componentModel = "spring", uses = PurchaseMapper.class)
public interface ClientMapper {
    @Mappings({
        @Mapping(source = "idCliente", target = "clientId"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "apellidos", target = "lastname"),
        @Mapping(source = "celular", target = "phone"),
        @Mapping(source = "correoElectronico", target = "email"),
        @Mapping(source = "direccion", target = "address"),
        @Mapping(source = "compras", target = "purchases"),
    })
    Client toClient(Cliente cliente);
    List<Client> toClients (List<Cliente> clientes);

    @InheritInverseConfiguration
    Cliente toCliente(Client client);
}
