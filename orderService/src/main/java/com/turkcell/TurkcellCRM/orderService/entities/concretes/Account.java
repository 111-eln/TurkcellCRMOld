package com.turkcell.TurkcellCRM.orderService.entities.concretes;

import com.turkcell.TurkcellCRM.orderService.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "accountStatus")
    private String accountStatus;

    @Column(name = "accountNumber")
    private int accountNumber;

    @Column(name = "accountName")
    private String accountName;

    @ManyToOne
    @JoinColumn(name = "adress_id")
    private Address adresses;


}
