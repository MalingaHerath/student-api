package com.example.studentapi;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository{

    Map<String,Student> database = new HashMap<>();

    @Override
    public void save(Student student){
        database.put(student.id, student);
        System.out.println("Student Saved in the database");
    }

    @Override
    public Student get(String id) {
        return database.get(id);
    }

    @Override
    public void delete(String id){
        database.remove(id);
        System.out.println("Successfully deleted");
    }

    @Override
    public void update(String id, Student student) {
        database.put(student.id, student);
        System.out.println("Successfully Updated");
    }

}
