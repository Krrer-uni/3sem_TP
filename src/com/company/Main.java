package com.company;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int money = 10;
        int hs = 0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        while(money > 0){
            if(hs < money) hs = money;
            System.out.println("You have " + money + " dragon coins");
            System.out.println("How many do you want to gamble?");
            int gamble = scan.nextInt();
            while(gamble > money) {
                System.out.println("You dont have that many coins, pick less");
                gamble = scan.nextInt();
            }
            if(rand.nextInt()%2 == 0) money += gamble;
            else money -= gamble;
        }
        System.out.println("You lost.");
        System.out.println("Your highscore is " + hs);
    }
}
