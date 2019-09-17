package com.assignment3;
import java.util.*;
import java.io.*;

public class MazeTester {
    public static void main(String[] args) throws FileNotFoundException {
       // Scanner scan = new Scanner(System.in);
        //System.out.print("Enter the name of the file containing the maze: ");
        //String filename = scan.nextLine();

        Maze labyrinth = new Maze( "src/com/assignment3/test" );

        System.out.println(labyrinth);
        MazeSolver solver = new MazeSolver(labyrinth);

        if (solver.traverse()){
            System.out.print("The maze was successfully traversed");

        }
        else{
            System.out.print("There is no possible path");
        }
        System.out.print(labyrinth);

    }
}
