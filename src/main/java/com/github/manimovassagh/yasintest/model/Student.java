package com.github.manimovassagh.yasintest.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    private Integer id;
    private String name;
    private Integer grade;
}
