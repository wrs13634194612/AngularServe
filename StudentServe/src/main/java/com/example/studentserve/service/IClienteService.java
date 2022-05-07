package com.example.studentserve.service;


import com.example.studentserve.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {

    public List<Cliente> finAll();

    public Page<Cliente> finAll(Pageable pageable);

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

}
