package com.projects.marketlist.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int id_user;

    @Column(name = "username", nullable = false, length = 20)
    private String username;

    @Column(name = "email_user", nullable = false, length =100)
    private String email_user;

    @Column(name ="password", nullable = false, length = 255)
    private String password;

    @Column(name = "user_role", nullable = false)
    private Role user_role;

    @Column(name = "created_date", updatable = false)
    private LocalDateTime  created_date = LocalDateTime.now();

    @OneToMany(mappedBy = "id_user")
    private List<PurchaseList> purchase_list;

    public User(){

    }

    public User(int id_user,String username,String email_user,Role user_role,LocalDateTime created_date){
        this.id_user = id_user;
        this.username = username;
        this.email_user = email_user;
        this.user_role = user_role;
        this.created_date = created_date;
        purchase_list = new ArrayList<>();
    }

    //Getters and Setters:

    public int getId_User(){return this.id_user;} 
    public void setId_User(int id_user){this.id_user = id_user;}

    public String getUsername(){return this.username;}
    public void setUsername(String username){this.username = username;}

    public String getEmail_User(){return this.email_user;}
    public void setEmail_User(String email_user){this.email_user = email_user;}

    public String getPassword(){return this.password;}
    public void setPassword(String password){this.password = password;}

    public Role getUser_Role(){return this.user_role;}
    public void setUser_Role(Role user_role){this.user_role = user_role;}

    public LocalDateTime getCreated_Date(){return this.created_date;}
    public void setCreated_Date(LocalDateTime created_date){this.created_date = created_date;}


}