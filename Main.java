package com.company;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        /*File file = new File("data/tekst.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String tekst = sc.nextLine();
            String result = "";
            String[] ordListe = tekst.split(" ");
            for (int i = 0; i < ordListe.length; i++) {
                if (ordListe[i].length()>= 5){
                    result += ordListe[i].toUpperCase() + " ";
                } else {
                    result += ordListe[i] + " ";
                }
            }
            System.out.println(result);
        }*/


        File file = new File("Data/DMI.txt");
        Scanner sc = new Scanner(file);
        double data = 0;
        double result = 0;
        double count = 0;

        while (sc.hasNextLine()){
            String tekst = sc.nextLine();
            String[] ordListe = tekst.split(" ");
            for (int i = 0; i < ordListe.length; i++) {
                if (ordListe[i].length() <= 2){
                    int x =Integer.parseInt(ordListe[i]);
                    data += x;
                    count++;
                }
            }
        }
        result = data / count;
        result = (int) Math.round(result);
        System.out.println("Average: " + result);


        /*int number = ((int) (Math.random() * 5) + 1);
        int guess = 1;
        int i = 1;
        Scanner in = new Scanner(System.in);
        File file = new File("data/output.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file,true));

        System.out.println("Kom med et gæt");

        while(number != guess){
            guess = in.nextInt();

            if (number == guess) {
                System.out.println("Du gættede rigtigt!!!");
                ps.println("det rigtige gæt var : " + guess);

            }else {
                if (number > guess) {
                    System.out.println("Du gættede for lavt prøv igen :)");
                    ps.println("antal forsøg "+ i + ": " + guess);
                    i++;
                }
                else {
                    System.out.println("Du gættede for højt prøv igen :)");
                    ps.println("antal forsøg "+ i + ": " + guess);
                    i++;
                }
            }
        }*/

        /*Lommeregner lr = new Lommeregner();
        try {
            System.out.println(lr.add(1,4));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }*/

       /* File file = new File("data/tekst.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            System.out.println(line);
            line = scanner.nextLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("pause " + e.getMessage());
        }*/
    }
}
