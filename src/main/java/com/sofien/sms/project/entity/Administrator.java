package com.sofien.sms.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Administrator")
public class Administrator {
    @Id
    @GeneratedValue
    private int id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String role;
}
