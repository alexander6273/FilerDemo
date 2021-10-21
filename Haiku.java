package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Haiku {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("opret en fil eller skriv til en fil med navnet: ");
        String filname = scanner.nextLine();
        filname = filname.replaceAll(" ", "");
        File file = new File("data/" + filname + ".txt");
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            System.out.print("skriv dit digt på tre linjer: \n");
            String intput = scanner.nextLine();
            intput += "\n" + scanner.nextLine();
            intput += "\n" + scanner.nextLine();
            ps.println(intput);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
