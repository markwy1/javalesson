package com.markwy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 0;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //Scanner s = new Scanner(System.in);
        System.out.println("InputStream created.");
        while ( x != 99 ) {
            try {
                System.out.print("Input a number: ");
                String str = br.readLine();
                //String str = s.next();
                x = Integer.parseInt(str);
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (x) {
                case 10:
                case 20:
                    System.out.println("input is: " + x);
                    break;
                case 30:
                case 40:
                    System.out.println("input is: " + x);
                    break;
                default:
                    System.out.println("Default is assigned");
            }
        }
        try {
            br.close();
            System.out.println("InputStream closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
