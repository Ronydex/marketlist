package com.projects.marketlist.model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name="purchase_name")
public class PurchaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase")
    private int id_purchase;

    @Column(name = "purchase_name", nullable = false, length = 100)
    private String purchase_name;

    @Column(name = "estimated_price", nullable = false)
    private Double estimated_price;

    @Column(name = "real_price", nullable = false)
    private Double real_price;

    @Column(name ="is_checked", nullable = false)
    private boolean is_checked;

    @Column(name="amount", nullable = false)
    private int amount;

    @Column(name = "purchase_date", nullable = false)
    private LocalDateTime purchase_date = LocalDateTime.now();

    //Getters and Setters

    public int getId_Purchase(){return this.id_purchase;}
    public void setId_Purchase(int id_purchase){this.id_purchase = id_purchase;}
 
    public String getPurchase_Name(){return this.purchase_name;}
    public void setPurchase_Name(String purchase_name){this.purchase_name = purchase_name;}

    public Double getEstimated_Price(){return this.estimated_price;}
    public void setEstimated_Price(Double estimated_price){this.estimated_price = estimated_price;}

    public Double getReal_Price(){return this.real_price;}
    public void setReal_Price(Double real_price){this.real_price = real_price;}

    public boolean getIs_Checked(){return this.is_checked;}
    public void setIs_Checked(boolean is_checked){this.is_checked = is_checked;}

    public int getAmount(){return this.amount;}
    public void setAmount(int amount){this.amount = amount;}

    public LocalDateTime getPurchase_Date(){return this.purchase_date;}
    public void setPurchase_Date(LocalDateTime purchase_date){this.purchase_date = purchase_date;}

}