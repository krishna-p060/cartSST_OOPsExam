package com.krishna.cartSST.dto;

import com.krishna.cartSST.Models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class HelperCart {

    private int userId;
    private Date date;
    private Product[] products;

}
