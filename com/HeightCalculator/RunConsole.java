package com.HeightCalculator;

import java.util.*;

public class RunConsole {

    //method to gather user input for feet
    public byte runConsoleFeet() {
      
        //Initialize Scanner
        Scanner myObj = new Scanner(System.in);
    
        //Prompt User to Enter Feet
        System.out.print("Please Enter Feet: ");
        //Read User Input
        Byte feet = myObj.nextByte();

        //return value of feet
        return feet;
    }

    //Method to gether user input for inches
    public byte runConsoleInches() {
      
        //Initialize Scanner
        Scanner myObj = new Scanner(System.in);
     
        //Prompt User to Enter Inches
        System.out.print("Please Enter Inches: ");
        Byte inches = myObj.nextByte();

        //return value of inches
        return inches;
    }
}