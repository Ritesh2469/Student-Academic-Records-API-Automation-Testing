package com.studentapi.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class StudentControllerTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }

    @Test
    public void testGetAllStudents() {
        when().get("/api/students")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

    @Test
    public void testGetStudentById() {
        when().get("/api/students/S1001")
                .then()
                .statusCode(200)
                .body("id", equalTo("S1001"));
    }

    @Test
    public void testInvalidStudentIdPattern() {
        when().get("/api/students/1234")
                .then()
                .statusCode(404); // Not found
    }
}
