package com.booleanuk.core;

import com.booleanuk.StudentMembers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class CoreTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testEmptyOrFalseInputs() throws UnsupportedEncodingException {
        StudentMembers students = new StudentMembers();
        Scanner input = new Scanner(" ");
        Assertions.assertEquals("Please use valid syntax",students.run(input));
    }

    @Test
    public void testListOfStudents(){

    }

}
