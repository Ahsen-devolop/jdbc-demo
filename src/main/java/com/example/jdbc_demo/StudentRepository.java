package com.example.jdbc_demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
        String sql = "INSERT INTO students (firstname, lastname, studentid) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,
                student.getFirstname(),
                student.getLastname(),
                student.getStudentid());
    }
}
