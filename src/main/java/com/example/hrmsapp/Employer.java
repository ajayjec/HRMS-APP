/* ******* Copyright 2025, Example Corp. All rights reserved. ******* */
// Contains AI-generated edits.
package com.example.hrmsapp;

import jakarta.persistence.*;

@Entity
@Table(name = "employers")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
// End of section: Contains AI-generated edits.

