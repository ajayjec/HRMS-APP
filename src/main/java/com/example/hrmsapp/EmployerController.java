/* ******* Copyright 2025, Example Corp. All rights reserved. ******* */
// Contains AI-generated edits.
package com.example.hrmsapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employers")
public class EmployerController {
    private static final Logger logger = LoggerFactory.getLogger(EmployerController.class);

    @Autowired
    private EmployerRepository employerRepository;

    @PostMapping
    public ResponseEntity<EmployerDto> addEmployer(@RequestBody EmployerDto employerDto) {
        String threadId = String.valueOf(Thread.currentThread().getId());
        String transactionId = java.util.UUID.randomUUID().toString();
        String apiName = "addEmployer";
        logger.info("[ThreadID:{}][TransactionID:{}][API:{}] Adding new employer: {}", threadId, transactionId, apiName, employerDto);
        Employer employer = EmployerMapper.toEntity(employerDto);
        Employer savedEmployer = employerRepository.save(employer);
        logger.debug("[ThreadID:{}][TransactionID:{}][API:{}] Saved employer with ID: {}", threadId, transactionId, apiName, savedEmployer.getId());
        return new ResponseEntity<>(EmployerMapper.toDto(savedEmployer), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployerDto> updateEmployer(@PathVariable Long id, @RequestBody EmployerDto employerDto) {
        String threadId = String.valueOf(Thread.currentThread().getId());
        String transactionId = java.util.UUID.randomUUID().toString();
        String apiName = "updateEmployer";
        logger.info("[ThreadID:{}][TransactionID:{}][API:{}] Updating employer with ID: {}", threadId, transactionId, apiName, id);
        Optional<Employer> existing = employerRepository.findById(id);
        if (existing.isEmpty()) {
            logger.warn("[ThreadID:{}][TransactionID:{}][API:{}] Employer with ID {} not found for update", threadId, transactionId, apiName, id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Employer employer = EmployerMapper.toEntity(employerDto);
        employer.setId(id);
        Employer updatedEmployer = employerRepository.save(employer);
        logger.debug("[ThreadID:{}][TransactionID:{}][API:{}] Updated employer with ID: {}", threadId, transactionId, apiName, id);
        return new ResponseEntity<>(EmployerMapper.toDto(updatedEmployer), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployerDto> getEmployer(@PathVariable Long id) {
        String threadId = String.valueOf(Thread.currentThread().getId());
        String transactionId = java.util.UUID.randomUUID().toString();
        String apiName = "getEmployer";
        logger.info("[ThreadID:{}][TransactionID:{}][API:{}] Fetching employer with ID: {}", threadId, transactionId, apiName, id);
        Optional<Employer> employer = employerRepository.findById(id);
        if (employer.isEmpty()) {
            logger.warn("[ThreadID:{}][TransactionID:{}][API:{}] Employer with ID {} not found", threadId, transactionId, apiName, id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(EmployerMapper.toDto(employer.get()), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployer(@PathVariable Long id) {
        String threadId = String.valueOf(Thread.currentThread().getId());
        String transactionId = java.util.UUID.randomUUID().toString();
        String apiName = "deleteEmployer";
        logger.info("[ThreadID:{}][TransactionID:{}][API:{}] Deleting employer with ID: {}", threadId, transactionId, apiName, id);
        Optional<Employer> employer = employerRepository.findById(id);
        if (employer.isEmpty()) {
            logger.warn("[ThreadID:{}][TransactionID:{}][API:{}] Employer with ID {} not found for deletion", threadId, transactionId, apiName, id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        employerRepository.deleteById(id);
        logger.debug("[ThreadID:{}][TransactionID:{}][API:{}] Deleted employer with ID: {}", threadId, transactionId, apiName, id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<EmployerDto>> getAllEmployers() {
        String threadId = String.valueOf(Thread.currentThread().getId());
        String transactionId = java.util.UUID.randomUUID().toString();
        String apiName = "getAllEmployers";
        logger.info("[ThreadID:{}][TransactionID:{}][API:{}] Fetching all employers", threadId, transactionId, apiName);
        List<Employer> employers = employerRepository.findAll();
        List<EmployerDto> employerDtos = employers.stream().map(EmployerMapper::toDto).toList();
        return new ResponseEntity<>(employerDtos, HttpStatus.OK);
    }
}
// End of section: Contains AI-generated edits.
