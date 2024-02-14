package com.example.es7;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false, unique = true)
    private String email;
}
