package com.example.invoicemanagement.client.models;

import com.example.invoicemanagement.invoice.Invoice;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String clientName;

    private String address;

    private String country;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

}
