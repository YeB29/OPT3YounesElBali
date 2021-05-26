import java.time.LocalDate;

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
        return this.productName;
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



    public Boolean requirement(Boolean productID, Integer productQuantity, Double productWeight) {

        if( productID || ( productWeight <=0 && productWeight>=10 &&( productQuantity>=0|| productQuantity <=15 ))) {
            return true;
        }
        return false;
    }



}

