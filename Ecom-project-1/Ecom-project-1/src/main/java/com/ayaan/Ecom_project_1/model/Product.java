package com.ayaan.Ecom_project_1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private String category;
    private boolean available;
    private int quantity;
    private String brand;

    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-MM  -yyyy")
    private Date releasedate;


    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
}
