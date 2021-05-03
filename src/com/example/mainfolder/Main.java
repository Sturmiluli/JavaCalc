package com.example.mainfolder;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("By Noah Albrecht");
        System.out.println("Enter first Number:");
        Scanner userinput = new Scanner(System.in);
        Integer firstnum = Integer.parseInt(userinput.nextLine());
        System.out.println("Enter second Number:");
        Integer secondnum = Integer.parseInt(userinput.nextLine());

        System.out.println("Operator:");
        System.out.println("1:Plus");
        System.out.println("2:Minus");
        System.out.println("3:Multiplikation");
        System.out.println("4:Dividieren");
        System.out.println("5:*PI");
        Integer operatorChoice = Integer.parseInt(userinput.nextLine());

        switch (operatorChoice){
            case(1):
                System.out.println("Your Result is:" + CalcPlus(firstnum, secondnum));
                break;
            case(2):
                System.out.println("Your Result is:" + CalcMinus(firstnum, secondnum));
                break;
            case(3):
                System.out.println("Your Result is:" + CalcMal(firstnum, secondnum));
                break;
            case(4):
                System.out.println("Your Result is:" + CalcDivi(firstnum, secondnum));
                break;
            case(5):
                System.out.println("Answer with 1 or 2");
                System.out.println("First number * PI or Second Number * PI");
                Integer PIchoice = Integer.parseInt(userinput.nextLine());
                switch (PIchoice) {
                    case(1):
                        System.out.println("Your Result is:" + CalcPI(firstnum));
                        break;
                    case(2):
                        System.out.println("Your Result is:" + CalcPI(secondnum));
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }


    }
    public static int CalcPlus(int ersteZahl, int zweiteZahl) {
        Integer result = ersteZahl + zweiteZahl;
        return result;
    }
    public static int CalcMinus(int ersteZahl, int zweiteZahl) {
        Integer result = ersteZahl - zweiteZahl;
        return result;
    }
    public static int CalcMal(int ersteZahl, int zweiteZahl) {
        Integer result = ersteZahl * zweiteZahl;
        return result;
    }
    public static int CalcDivi(int ersteZahl, int zweiteZahl) {
        Integer result = ersteZahl * zweiteZahl;
        return result;
    }
    public static double CalcPI(int Zahl) {

        double result = Zahl * Math.PI;
        return result;
    }
}
