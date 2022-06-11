package com.javatechie.jpa.repository;

import com.javatechie.jpa.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByid(Long id);
}
