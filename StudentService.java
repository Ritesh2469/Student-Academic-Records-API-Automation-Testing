package com.studentapi.service;

import com.studentapi.model.Student;
import com.studentapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository = new StudentRepository();

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(String id) {
        return repository.findById(id);
    }

    public void addStudent(Student student) {
        repository.save(student);
    }

    public void updateStudent(String id, Student student) {
        repository.save(student);
    }

    public void deleteStudent(String id) {
        repository.delete(id);
    }
}
