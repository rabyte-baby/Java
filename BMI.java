public class BMI {
    public static void main (String[] args) {
        
        double pounds = 123.459d;
        double inches = 62.59843d;
        double InchesTimes = inches * inches;
        double PoundsDivide = pounds / InchesTimes;
        double BMI = PoundsDivide * 703;
        
        System.out.print(BMI);
    }
}
