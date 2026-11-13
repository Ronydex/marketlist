package com.projects.marketlist.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projects.marketlist.model.Role;

public class UserResponseDTO {


    private String username;

    private String email_user;

    private Role user_role;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created_date;

    public String getUsername(){return username;}
    public void setUsername(String username){this.username = username;}

    public String getEmail_User(){return email_user;}
    public void setEmail_User(String email_user){this.email_user = email_user;}

    public Role getUser_Role(){return user_role;}
    public void setUser_Role(Role user_role){this.user_role = user_role;}

    public LocalDateTime getCreated_Date(){return created_date;}
    public void setCreated_Date(LocalDateTime created_date){this.created_date = created_date;}
}
