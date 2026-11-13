package com.projects.marketlist.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projects.marketlist.model.Role;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRegisterDTO {
    @NotBlank(message = "The username cannot be empty.")
    @Size(max = 20, message = "The username cannot be more than 30 characters long.")
    private String username;

    @NotBlank(message = "The email_user cannot be empty")
    @Size(max = 50, message = "The email_user cannot be more than 50 characters long")
    private String email_user;

    @NotBlank(message = "The user needs a password")
    @Size(max = 15, message="The password cannot be more than 15 characters long")
    private String password;

    @NotNull(message = "The user needs a role")
    private Role user_role;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created_date;
    
    public String getUsername(){return username;}
    public void setUsername(String username){this.username = username;}

    public String getEmail_User(){return email_user;}
    public void setEmail_User(String email_user){this.email_user = email_user;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    public Role getUser_Role(){return user_role;}
    public void setUser_Role(Role user_role){this.user_role = user_role;}

    public LocalDateTime getCreated_Date(){return created_date;}
    public void setCreated_Date(LocalDateTime created_date){this.created_date = created_date;}

}
