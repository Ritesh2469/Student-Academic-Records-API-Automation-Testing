package com.studentapi.repository;

import com.studentapi.model.Student;
import java.util.*;

public class StudentRepository {
    private Map<String, Student> studentMap = new HashMap<>();

    public StudentRepository() {
        // Sample data
        save(new Student("S1001", "John Doe", new double[]{85, 90, 92, 88}));
        save(new Student("S1002", "Jane Smith", new double[]{78, 82, 80, 85}));
    }

    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }

    public Student findById(String id) {
        return studentMap.get(id);
    }

    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }

    public void delete(String id) {
        studentMap.remove(id);
    }
}
