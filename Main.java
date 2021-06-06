import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        System.out.println("1. Non perishable");
        System.out.println("2. Perishable");


        Scanner input = new Scanner(System.in);
        System.out.println("Voeg een type product toe?");
        int keuze = input.nextInt();
        input.nextLine();

        Product product1;
        if ((keuze == 1)) {
            product1 = new NonPerishable (135,"Beans",2.5, LocalDate.now(),keuze);
        }
        else if((keuze == 2)){
            product1 = new Perishable(247,"Cucumber",3.0, LocalDate.now(),keuze);
        }


    }
}

