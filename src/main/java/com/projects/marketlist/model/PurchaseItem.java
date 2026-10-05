package com.projects.marketlist.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="purchase_name")
public class PurchaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase")
    private int $id_purchase;

    @Column(name = "id_list")
    private int $id_list;

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

    //Getters and Setters

    public int get$Id_Purchase(){return this.$id_purchase;}
    public void set$Id_Purchase(int $id_purchase){this.$id_purchase = $id_purchase;}

    public int get$Id_List(){return this.$id_list;}
    public void set$Id_List(int $id_list){this.$id_list = $id_list;}

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

}