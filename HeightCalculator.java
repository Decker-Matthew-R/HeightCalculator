public class HeightCalculator {

    //Main Method / Main Driver
    public static void main (String [] args) {

        //Call ConsoleFeature Class and UserInputFeet method
        ConsoleFeature mainDriver1 = new ConsoleFeature();
        byte feet = mainDriver1.UserInputFeet();

        //Call Consule Feature Class and UserInputInches method
        ConsoleFeature mainDriver2 = new ConsoleFeature();
        byte inches = mainDriver2.UserInputInches();

        //Recap User Input
        System.out.println("The Height you Entered is: " + feet + " feet and " + inches + " inches.");

        //Produce Final result of height in inches
        Calculations mainDriver3 = new Calculations();
        byte finalProduct = mainDriver3.CalculateHeightInInches();

        System.out.println("The height in inches is = " + finalProduct);





    }
        
    
}