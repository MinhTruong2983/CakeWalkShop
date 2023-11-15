package com.CakeWalk.Entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "cakes")
public class Cakes {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cakeid")
    private int cakeid;

    @Column(name = "name")
    private String name;


    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "Img")
    private String image;

	
}
