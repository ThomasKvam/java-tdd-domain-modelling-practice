package com.booleanuk.core;

import com.booleanuk.StudentMembers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CoreTest {

    @Test
    public void testEmptyOrFalseInputs(){
        StudentMembers students = new StudentMembers();
        Scanner input = new Scanner(System.in);
        students.run();
        if (input.next().equals("")){
            Assertions.assertEquals("Please use valid syntax", students.run(input));
        }
    }

}
