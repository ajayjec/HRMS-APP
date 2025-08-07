/* ******* Copyright 2025, Example Corp. All rights reserved. ******* */
// Start of section: Contains AI-generated edits.
package com.demo.hrms;

import com.example.hrmsapp.Employer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Employer POJO.
 */
public class EmployerTest {
    private Employer employer;

    @BeforeEach
    void setUp() {
        employer = new Employer();
    }

    @Test
    void testGettersAndSetters() {
        // Arrange
        Long expectedId = 1L;
        String expectedName = "Test Name";
        String expectedEmail = "test@example.com";
        // Act
        employer.setId(expectedId);
        employer.setName(expectedName);
        employer.setEmail(expectedEmail);
        // Assert
        assertEquals(expectedId, employer.getId(), "ID should be set and retrieved correctly");
        assertEquals(expectedName, employer.getName(), "Name should be set and retrieved correctly");
        assertEquals(expectedEmail, employer.getEmail(), "Email should be set and retrieved correctly");
    }

    @Test
    void testDefaultValues() {
        // Arrange & Act are handled by setUp
        // Assert
        assertNull(employer.getId(), "Default ID should be null");
        assertNull(employer.getName(), "Default name should be null");
        assertNull(employer.getEmail(), "Default email should be null");
    }
}
// End of section: Contains AI-generated edits.
