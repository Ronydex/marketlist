package com.projects.marketlist.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "purchase_list")
public class PurchaseList {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_list")
    private int $id_list;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User $id_user;

    @Column(name = "list_name",nullable = false, length = 70)
    private String $list_name;

    @Column(name = "date_created",updatable = false)
    private LocalDateTime $date_created;

    @Column(name = "is_active",nullable = false)
    private boolean $is_active;

    public PurchaseList(){

    }

    public PurchaseList(int $id_list, User $id_user, String $list_name, LocalDateTime $date_created, boolean $is_active){
        this.$id_list = $id_list;
        this.$id_user = $id_user;
        this.$list_name = $list_name;
        this.$date_created = $date_created;
        this.$is_active = $is_active;
    }
    
    public int get$Id_List(){return this.$id_list;}
    public void set$Id_List(int $id_list){this.$id_list = $id_list;}

    public User get$Id_User(){return this.$id_user;}
    public void set$Id_User(User $id_user){this.$id_user = $id_user;}

    public String get$List_Name(){return this.$list_name;}
    public void set$List_Name(String $list_name){this.$list_name = $list_name;}

    public LocalDateTime $getDate_Created(){return this.$date_created;}
    public void $setDate_Created(LocalDateTime $date_created){this.$date_created = $date_created;}

    public boolean $getIs_Active(){return this.$is_active;}
    public void $setIs_Active(boolean $is_active){this.$is_active = $is_active;}
}
