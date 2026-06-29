import java.util.Scanner;

public class PesoToDollarConverter {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter the peso amount: ");
        
        float Peso = scanner.nextFloat();
        
        float Dollar = 61.19f;
        
        float FinalAmount = Peso / Dollar;
        
        System.out.printf("Your money is worth %.2f dollars.", FinalAmount);
    }
}
