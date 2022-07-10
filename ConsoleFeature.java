import java.util.*;

public class ConsoleFeature {
    
    byte feet;
    byte inches;
    
    //Method Creates User Input Option for Feet
    public byte UserInputFeet() {

        //Create Scanner Object
        Scanner myObj = new Scanner(System.in);
        //Prompt User to Enter Height in Feet
        System.out.print("Enter Feet: ");

        //Read User Input
        byte feet = myObj.nextByte();

        return feet;
    }

    //Method Creates User Input Option for Inches
    public byte UserInputInches() {

        //Create Scanner Object
        Scanner myObj = new Scanner(System.in);
        //Prompt User to Enter Height in Inches
        System.out.print("Enter Inches: ");

        //Read User Input
        byte inches = myObj.nextByte();
        
        return inches;
    }
}
