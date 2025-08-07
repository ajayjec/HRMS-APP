//package com.example.hrmsapp;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@RestController
//@RequestMapping("/jobposts")
//public class JobPostController {
//    private Map<Long, JobPost> jobPostMap = new HashMap<>();
//    private long idCounter = 1;
//
//    @PostMapping
//    public ResponseEntity<JobPost> addJobPost(@RequestBody JobPost jobPost) {
//        jobPost.setId(idCounter++);
//        jobPostMap.put(jobPost.getId(), jobPost);
//        return new ResponseEntity<>(jobPost, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<JobPost> updateJobPost(@PathVariable Long id, @RequestBody JobPost jobPost) {
//        JobPost existing = jobPostMap.get(id);
//        if (existing == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        jobPost.setId(id);
//        jobPostMap.put(id, jobPost);
//        return new ResponseEntity<>(jobPost, HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<JobPost> getJobPost(@PathVariable Long id) {
//        JobPost jobPost = jobPostMap.get(id);
//        if (jobPost == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(jobPost, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteJobPost(@PathVariable Long id) {
//        JobPost removed = jobPostMap.remove(id);
//        if (removed == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<JobPost>> getAllJobPosts() {
//        return new ResponseEntity<>(new ArrayList<>(jobPostMap.values()), HttpStatus.OK);
//    }
//}
//
//
