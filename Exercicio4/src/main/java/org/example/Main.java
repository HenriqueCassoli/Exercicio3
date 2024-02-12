package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int x =0;
        x = scr.nextInt();

        for(int i =1; i<= x;i++){
            if (i % 2 !=0){
                System.out.println(i);
            }
        }
    }
}