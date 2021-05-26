import java.time.LocalDate;

class Product {
    private Integer productID;
    private String productName;
    private Integer productQuantity;
    private Double productWeight;
    private LocalDate expirationDate;

    public Product(Integer productID, String productName, Integer productQuantity, Double productWeight, LocalDate expirationDate ){
        this.productID = productID;
        this.productName = productName;
        this.productQuantity = 0;
        this.productWeight = productWeight;
        this.expirationDate = expirationDate;
    }

    public Integer getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public Double getProductWeight() {
        return productWeight;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
