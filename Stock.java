import java.time.LocalDate;
import java.util.Scanner;

public class Stock extends Product{
    private int productQuantity;

    public Stock(int productID, String productName, Double productWeight, LocalDate expirationDate, int productQuantity){
        super(productID, productName, productWeight, expirationDate);
        this.productQuantity = 0;
    }

    public int addProductQuantity(int productQuantity){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vul de hoeveelheid in dat u wilt toevoegen: ");
        int input = scanner.nextInt();
        productQuantity += input;
        return productQuantity;
    }
    public int removeProductQuantity(int productQuantity){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vul de hoeveelheid in dat u wilt verwijderen: ");
        int input = scanner.nextInt();
        productQuantity -= input;
        return productQuantity;
    }
    public int totalProductQuantity(int productQuantity){
        return productQuantity;
    }
}
