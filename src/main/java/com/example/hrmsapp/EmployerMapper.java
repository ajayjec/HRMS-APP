/* ******* Copyright 2025, Example Corp. All rights reserved. ******* */
// Contains AI-generated edits.
package com.example.hrmsapp;

public class EmployerMapper {
    public static Employer toEntity(EmployerDto dto) {
        if (dto == null) return null;
        Employer employer = new Employer();
        employer.setId(dto.getId());
        employer.setName(dto.getName());
        employer.setEmail(dto.getEmail());
        return employer;
    }

    public static EmployerDto toDto(Employer entity) {
        if (entity == null) return null;
        EmployerDto dto = new EmployerDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        return dto;
    }
}
// End of section: Contains AI-generated edits.

