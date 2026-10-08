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
    private int $id_user;

    @Column(name = "username", nullable = false, length = 20)
    private String $username;

    @Column(name = "email_user", nullable = false, length =100)
    private String $email_user;

    @Column(name ="password", nullable = false, length = 255)
    private String $password;

    @Column(name = "user_role", nullable = false)
    private Role $user_role;

    @Column(name = "created_date", updatable = false)
    private LocalDateTime  $created_date = LocalDateTime.now();

    @OneToMany(mappedBy = "$id_user")
    private List<PurchaseList> $purchase_list;

    public User(){
        $purchase_list = new ArrayList<>();
    }

    public User(int $id_user,String $username,String $email_user,Role $user_role,LocalDateTime $created_date){
        this.$id_user = $id_user;
        this.$username = $username;
        this.$email_user = $email_user;
        this.$user_role = $user_role;
        this.$created_date = $created_date;
        $purchase_list = new ArrayList<>();
    }

    //Getters and Setters:

    public int get$Id_User(){return this.$id_user;} 
    public void set$Id_User(int $id_user){this.$id_user = $id_user;}

    public String get$Username(){return this.$username;}
    public void set$Username(String $username){this.$username = $username;}

    public String get$Email_User(){return this.$email_user;}
    public void set$Email_User(String $email_user){this.$email_user = $email_user;}

    public String get$Password(){return this.$password;}
    public void set$Password(String $password){this.$password = $password;}

    public Role get$User_Role(){return this.$user_role;}
    public void set$User_Role(Role $user_role){this.$user_role = $user_role;}

    public LocalDateTime get$Created_Date(){return this.$created_date;}
    public void set$Created_Date(LocalDateTime $created_date){this.$created_date = $created_date;}


}