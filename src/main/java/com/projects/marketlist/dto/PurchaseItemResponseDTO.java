package com.projects.marketlist.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseItemResponseDTO {

    private String purchase_name;

    private Double estimated_price;

    private Double real_price;

    private boolean is_checked;
    
    private int amount;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime purchase_date;
    
    public String getPurchase_Name(){return purchase_name;}
    public void setPurchase_Name(String purchase_name){this.purchase_name = purchase_name;}

    public Double getEstimated_Price(){return estimated_price;}
    public void setEstimated_Price(Double estimated_price){this.estimated_price = estimated_price;}

    public Double getReal_Price(){return real_price;}
    public void setReal_Price(Double real_price){this.real_price = real_price;}

    public boolean getIs_Checked(){return is_checked;}
    public void setIs_Checked(boolean is_checked){this.is_checked = is_checked;}

    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}

    public LocalDateTime getPurchase_Date(){return purchase_date;}
    public void setPurchase_Date(LocalDateTime purchase_date){this.purchase_date = purchase_date;}
}
