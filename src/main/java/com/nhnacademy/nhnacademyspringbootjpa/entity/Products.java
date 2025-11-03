package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

/*
CREATE TABLE Products (
      ProductID	INT	auto_increment,
      CategoryID	INT,
      ModelNumber	nvarchar(10),
      ModelName	nvarchar(120),
      ProductImage	nvarchar(30),
      UnitCost	decimal(15),
      Description	text,

      CONSTRAINT pk_Products PRIMARY KEY(ProductID),
      CONSTRAINT fk_Products_Categories FOREIGN KEY(CategoryID) REFERENCES Categories(CategoryID)
);
 */

@Entity
@Table(name = "Products")
public class Products {

//    @Column(name = "ProductID");
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer ProductId;

    private Integer CategoryId;
    @Length(min=0, max=10)
    private String modelNumber;
    @Length(min=0, max=120)
    private String modelName;
    @Length(min=0, max=30)
    private String productImage;
    @Column(name = "UnitCost", precision = 15, scale = 0)
    private BigDecimal unitCost;
    private String description;
}
