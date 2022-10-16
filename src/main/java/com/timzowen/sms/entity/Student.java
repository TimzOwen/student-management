package com.timzowen.sms.entity;


import ch.qos.logback.core.joran.conditional.ElseAction;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public Student(String firstName, String lastName, String email) {
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }
    public Student(){}
}

