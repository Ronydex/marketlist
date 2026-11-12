package com.projects.marketlist.dto;


import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class PurchaseItemRequestDTO {
    
    @NotBlank(message="Every item needs a name")
    @Size(max = 100, message="The name of the item it could not more of 100 char")
    private String purchase_name;

    @NotNull(message ="Every item had a price")
    @Positive(message = "The item price its positive")
    private Double estimated_price;

    @NotNull(message="Every item had a price")
    @Positive(message = "The item price its positive")
    private Double real_price;


    private boolean is_checked;

    @NotNull(message = "Every item had an amount")
    @Positive(message = "The item it could not negative")
    private int amount;

    private LocalDateTime purchase_date;

    public PurchaseItemRequestDTO(){}

    public PurchaseItemRequestDTO(String purchase_name,Double estimated_price, Double real_price, boolean is_checked, int amount,LocalDateTime purchase_date){
        this.purchase_name = purchase_name;
        this.estimated_price = estimated_price;
        this.real_price = real_price;
        this.is_checked = is_checked;
    }
    public String getPurchaseName() {return purchase_name;}
    public void setPurchaseName(String purchase_name){this.purchase_name = purchase_name;}

    public Double getEstimatedPrice(){return estimated_price;}
    public void setEstimated_Price(Double estimated_price){this.estimated_price = estimated_price;}

    public Double getRealPrice(){return real_price;}
    public void setReal_Price(Double real_price){this.real_price = real_price;}

    public boolean getIs_Checked(){return is_checked;}
    public void setIs_Checked(boolean is_checked){this.is_checked = is_checked;}

    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}

    public LocalDateTime getPurchase_Date(){return purchase_date; }
    public void setPurchase_Date(LocalDateTime purchase_date){this.purchase_date = purchase_date;}
}
