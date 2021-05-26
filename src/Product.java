import java.time.LocalDate;

class Product {
    private int productID;
    private String productName;
    private int productQuantity;
    private double productWeight;
    private LocalDate expirationDate;
    private int count;
    private double orderAmount;

    public Product(int productID, String productName, int productQuantity, double productWeight, LocalDate expirationDate) {
        this.productID = productID;
        this.productName = productName;
        this.productQuantity = 0;
        this.productWeight = productWeight;
        this.expirationDate = expirationDate;

    }


    public Boolean requirement(Boolean productID, double productWeight, Boolean productQuantity) {

        if (productID || (productWeight <= 0 && productWeight >= 10 && productQuantity)) {
            return true;
        }
        return false;
    }

    public int getCount(double productWeight) {
        if ( (productWeight >= 0.0) && (productWeight < 4.0)) {
            return count = 1;
        }
        if ((productWeight >= 4.0) && (productWeight < 7.0)) {
            return count = 2;
        }

        if ((productWeight >= 7.0) && (productWeight <= 10.0)) {
            return count = 3;
        }

        return 0;
    }

    // deze methode berekent het bedrag wat de gebruiker mag gebruiken om bestellingen bij leveranciers te plaatsten

    public double berekenBestelbedrag(double productWeight, Boolean productID, Boolean productQuantity, double orderAmount) {

        if ( (productWeight >= 0.0) && (productWeight < 4.0) || (orderAmount > 70.00)) {
            if (productID || productQuantity) {
                return 100.00;
            } else {
                return 50.00;
            }
        }

        if (( productWeight >= 4.0)  && ( productWeight < 7.0) || (orderAmount > 50.00)) {
            if (productID || productQuantity) {
                return 75.00;
            } else {
                return 30.00;
            }
        }

        if (( productWeight >= 7.0) && (productWeight < 10.0) || (orderAmount > 30.00)) {
            if (productID || productQuantity) {
                return 50.00;
            } else {
                return 20.00;
            }
        }

        return 0.0;
    }
}

