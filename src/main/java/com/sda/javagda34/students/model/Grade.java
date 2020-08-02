package com.sda.javagda34.students.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double value; // wartość oceny
    @Enumerated(value = EnumType.STRING)
    private GradeSubject subject;

    // data wystawienia
    @CreationTimestamp
    private LocalDateTime dateAdded; // now

    @ManyToOne()
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Student student;
}