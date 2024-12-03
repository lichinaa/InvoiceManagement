package com.example.invoicemanagement.invoice;

import com.example.invoicemanagement.client.models.Client;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private Integer invoiceNumber;

    private Double totalAmount;

    private Date date;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Client> client = new ArrayList<>();

    /*@ManyToMany
    @JoinTable(name = "invoice_items",
              joinColumns = @JoinColumn(name = "inovice_id"),
              inverseJoinColumns = @JoinColumn(name = "item_id")
    )*/

}
