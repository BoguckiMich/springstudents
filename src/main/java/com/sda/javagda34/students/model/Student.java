package com.sda.javagda34.students.model;

import lombok.*;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@AllArgsConstructor
// POJO - Plain Old Java Object
//          - prywatne pola
//          - gettery settery
//          - pusty konstruktor (no args)
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    public Student() {
        this.firstName = "Pichael";
    }
    private String indexNumber; //unikalny
    private String firstName;
    private String lastName;
    @Formula(value = "(select avg(g.value) from grade g where g.student_id=id)")
    private Double average;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private boolean active;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    private Set<Grade> gradeSet = new HashSet<>();
}