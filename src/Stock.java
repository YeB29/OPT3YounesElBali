import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Stock extends Product implements Stockinterface{
    private int productQuantity;

    public Stock(int productID, String productName, Double productweight, LocalDate expirationDate){
        super(productID, productName, productweight, expirationDate);
        this.productQuantity = 0;
    }
    @Override
    public void addProductQuantity(int keuze){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vul de hoeveelheid in dat u wilt toevoegen: ");
        int input = scanner.nextInt();
        this.productQuantity += input;

    }
    @Override
    public void removeProductQuantity(int keuze){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vul de hoeveelheid in dat u wilt verwijderen: ");
        int input = scanner.nextInt();
        this.productQuantity -= input;

    }
    @Override
    public void totalProductQuantity(){
        System.out.println("U totale product hoeveelheid is:");
        System.out.println(productQuantity);
    }
}

