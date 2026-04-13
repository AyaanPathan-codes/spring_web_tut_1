package com.ayaan.expenseTrackerBasic.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Expense {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;
    private Double amount;
    private String description;
    @Enumerated(EnumType.STRING)
    private Category category;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;



}
