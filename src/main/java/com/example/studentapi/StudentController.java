package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();

    // Rest end point
    //create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){

        repository.save(student);

    }

    //retrieving student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){

        return repository.get(id);

    }

    //delete student
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable String id){

        repository.delete(id);

    }

    //update student
    @PostMapping("/student/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable String id){

        repository.update(id, student);

    }
}




