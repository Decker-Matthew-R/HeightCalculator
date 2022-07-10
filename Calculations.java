public class Calculations {

    public byte CalculateHeightInInches() {

        //Declare finalProduct Variable
        byte finalProduct;

        //Call Console Feature Method to obtain user input variable feet
        ConsoleFeature methodDriver1 = new ConsoleFeature();
        byte feet = methodDriver1.UserInputFeet();

        //Call Console Feature Method to obtain user input variable feet
        ConsoleFeature methodDriver2 = new ConsoleFeature();
        byte inches = methodDriver2.UserInputFeet();

        //Initialize finalProduct Variable
        finalProduct = (byte) ((12*feet) + inches);

        return finalProduct;
    }
    
}
