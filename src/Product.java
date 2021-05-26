import java.time.LocalDate;

class Product {
    private int productID;
    private String productName;
    private int productQuantity;
    private Double productWeight;
    private LocalDate expirationDate;
    private Double count;

    public Product(int productID, String productName, int productQuantity, Double productWeight, LocalDate expirationDate){
        this.productID = productID;
        this.productName = productName;
        this.productQuantity = 0;
        this.productWeight = productWeight;
        this.expirationDate = expirationDate;
        this.count =0.0;

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

    public Double getCount(Double productWeight){
        if(productWeight > 0 && productWeight<0){
             return 1.0;
        }
        if(productWeight>=4 && productWeight<7){
           return 2.0;
            }

        if(productWeight>=7 && productWeight<10){
            return 3.0;
            }

            return 0.0;
    }



}

