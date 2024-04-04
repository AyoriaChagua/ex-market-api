package com.market.ex.market.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.market.ex.market.domain.Client;
import com.market.ex.market.domain.service.ClientService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAll() {
        return new ResponseEntity<>(clientService.getAll(), HttpStatus.OK);
    }
    
}
