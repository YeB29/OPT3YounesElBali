import java.time.LocalDate;
import java.util.Scanner;

class Product {
    private int productID;
    private String productName;
    private int productQuantity;
    private Double productWeight;
    private LocalDate expirationDate;

    public Product(int productID, String productName, int productQuantity, Double productWeight, LocalDate expirationDate ){
        this.productID = productID;
        this.productName = productName;
        this.productQuantity = 0;
        this.productWeight = productWeight;
        this.expirationDate = expirationDate;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public Double getProductWeight() {
        return productWeight;
    }

    public Boolean getExpirationDate(LocalDate expirationDate) {
        if(expirationDate.equals(LocalDate.of(2021,6,30))) {
            return true;
        }
        return false;
    }

    public Boolean requirement(int productID , Integer productQuantity, LocalDate expirationDate) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        if(productID == input || ( getExpirationDate(expirationDate) && ( productQuantity>=0|| productQuantity <=15 ))){
            return true;
        }
        return false;
    }
}

