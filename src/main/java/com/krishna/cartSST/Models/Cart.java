package com.krishna.cartSST.Models;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Cart {

    private int id;
    private int userId;
    private Date date;
    private Product[] products;

}
