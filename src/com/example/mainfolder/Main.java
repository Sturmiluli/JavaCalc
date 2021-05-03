package com.example.mainfolder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter first Number:");
        Scanner userinput = new Scanner(System.in);
        Integer firstnum = Integer.parseInt(userinput.nextLine());
        System.out.println("Enter second Number:");
        Integer secondnum = Integer.parseInt(userinput.nextLine());

        Integer result = firstnum + secondnum;
        System.out.println("Dein Resultat ist:" + result);

    }
}
