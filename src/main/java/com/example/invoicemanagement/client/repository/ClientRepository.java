package com.example.invoicemanagement.client.repository;

import com.example.invoicemanagement.client.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
