import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
        void requirementTest() {
            Product item1 = new Product(478, "Avocado",0,0.0, LocalDate.of(2021,6,30));
            assertFalse(item1.requirement(false, 12,17.0 ));
            assertFalse(item1.requirement(false, 7, -2.0));
            assertTrue(item1.requirement(true, 11, 7.0));
            assertTrue(item1.requirement(true, 1, 16.0));
            assertTrue(item1.requirement(true, 14, 16.0));


        }

    @Test
    void getProductNameTest() {
            Product item1 = new Product(478, "Avocado",0,0.0, LocalDate.of(2021,6,30));


        }



    @Test
    void getProductQuantityTest() {
    }

    @Test
    void getProductWeightTest() {
    }

    @Test
    void getExpirationDateTest() {
    }
}