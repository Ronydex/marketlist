package com.projects.marketlist.model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="purchase_name")
public class PurchaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase")
    private int $id_purchase;

    @Column(name = "purchase_name", nullable = false, length = 100)
    private String $purchase_name;

    @Column(name = "estimated_price", nullable = false)
    private Double $estimated_price;

    @Column(name = "real_price", nullable = false)
    private Double $real_price;

    @Column(name ="is_checked", nullable = false)
    private boolean $is_checked;

    @Column(name="amount", nullable = false)
    private int $amount;

    @Column(name = "purchase_date", nullable = false)
    private LocalDateTime $purchase_date = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "purchase_list")
    private PurchaseList $purchase_list;

    //Getters and Setters

    public int get$Id_Purchase(){return this.$id_purchase;}
    public void set$Id_Purchase(int $id_purchase){this.$id_purchase = $id_purchase;}
 
    public String get$Purchase_Name(){return this.$purchase_name;}
    public void set$Purchase_Name(String $purchase_name){this.$purchase_name = $purchase_name;}

    public Double get$Estimated_Price(){return this.$estimated_price;}
    public void set$Estimated_Price(Double $estimated_price){this.$estimated_price = $estimated_price;}

    public Double get$Real_Price(){return this.$real_price;}
    public void set$Real_Price(Double $real_price){this.$real_price = $real_price;}

    public boolean get$Is_Checked(){return this.$is_checked;}
    public void set$Is_Checked(boolean $is_checked){this.$is_checked = $is_checked;}

    public int get$Amount(){return this.$amount;}
    public void set$Amount(int $amount){this.$amount = $amount;}

    public LocalDateTime get$Purchase_Date(){return this.$purchase_date;}
    public void set$Purchase_Date(LocalDateTime $purchase_date){this.$purchase_date = $purchase_date;}

    public PurchaseList get$PurchaseList(){return this.$purchase_list;}
    public void set$PurchaseList(PurchaseList $purchase_list){this.$purchase_list = $purchase_list;}
}