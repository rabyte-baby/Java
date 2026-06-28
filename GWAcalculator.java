public class GWAcalculator {
    public static void main (String[] args) {
        
        double GWA = 1.67;
        
        if (GWA >= 1.0 && GWA <= 1.45) {
            System.out.print("President lister.");
        } else if (GWA >= 1.46 && GWA <= 1.75) {
            System.out.print("Dean lister.");
        } else if (GWA <= 3.0) {
            System.out.print("Pasado.");
        } else {
            System.out.print("Bagsak!");
        }
    }
}