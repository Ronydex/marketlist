package com.projects.marketlist.model;

import java.time.LocalDateTime;



public class PurchaseList {
    
    private int $id_list;

    private User $id_user;

    private String $list_name;

    private LocalDateTime $date_created;

    private boolean $is_active;

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
