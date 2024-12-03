package com.example.invoicemanagement.items;

import com.example.invoicemanagement.invoice.Invoice;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String itemName;

    private Integer quantity;

    private Double amount;

    @ManyToMany(mappedBy = "invoice")
    private Set<Invoice> invoices = new HashSet<>();

}
