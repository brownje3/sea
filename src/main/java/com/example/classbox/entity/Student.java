package com.example.classbox.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
public class Student {

    @Id
    final int id;

    @NonNull
    String name;

    int age;

    @NonNull
    String grade;
}
