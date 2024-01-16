package com.booleanuk;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentMembers {
    public String[] students;
    public Random randomizer;
    public String[] validInputs;

    public StudentMembers(){
        this.students = new String[]{"Kari", "Jonas", "Ola"};
        this.randomizer = new Random();
    }


    public String run(Scanner input){
        System.out.println("List of student: ");
        System.out.println(Arrays.toString(students));
        System.out.println("What do you need? ");
        System.out.println("A. Choose a random student");
        System.out.println("B. Make random pair groups");
        System.out.println("C. Make random groups of four");
        System.out.println("Q. Exit");

        String string = input.toString().toLowerCase();
        do {
            if (string.equals("a")){
                return randomStudent();
            }
            else if (string.equals("b")){
                break;
            }
            else if (string.equals("c")){
                break;
            }
            else if (string.equals("q")){
                System.out.println("Shutting down");
                return "Shutting down";
            }
            else {
                return "Please use valid syntax";
            }

        }while(true);
        return " ";
    }

    public String randomStudent(){
        return this.students[this.randomizer.nextInt(this.students.length)];
    }
}

/*

| Class          | Members              | Methods         | Scenarios                        | Results/Output       |
|----------------|----------------------|-----------------|----------------------------------|----------------------|
| StudentMembers | String[] studentList | run()           | Runs the program giving          | Outputs the list     |
|                | Scanner input        |                 | showing the list of students.    | of students, as      |
|                | Random randomizer    |                 | It will also give a prompt       | well as options.     |
|                |                      |                 | asking what the user want to do. |                      |
|                |                      | randomStudent() | When this option is selected,    | Outputs a random     |
|                |                      |                 | the program will select one      | student from the     |
|                |                      |                 | random student from the  list.   | list                 |
|                |                      |                 |                                  |                      |
|                |                      | randomPairs()   | Option that creates random       | Outputs a new list   |
|                |                      |                 | pairs with random students       | with random students |
|                |                      |                 |                                  | in random pairs      |
|                |                      |                 |                                  |                      |
|                |                      | randomGroups()  | Option that is able to create    | Outputs a new list   |
|                |                      |                 | groups of four with random       | containing random    |
|                |                      |                 | students.                        | groups of four       |
 */