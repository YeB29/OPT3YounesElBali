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
    void getCountTest() {
        Product item1 = new Product(478, "Avocado",0,0.0, LocalDate.of(2021,6,30));

        assertEquals(1.0,item1.getCount(0.0),0.0001);
        assertEquals(1.0,item1.getCount(2.0),0.0001);
        assertEquals(1.0,item1.getCount(3.0),0.0001);
        assertEquals(2.0,item1.getCount(4.0),0.0001);
        assertEquals(2.0,item1.getCount(5.0),0.0001);
        assertEquals(2.0,item1.getCount(6.0),0.0001);
        assertEquals(3.0,item1.getCount(7.0),0.0001);
        assertEquals(3.0,item1.getCount(8.0),0.0001);
        assertEquals(3.0,item1.getCount(10.0),0.0001);


    }

    @Test
    void getProductWeightTest() {
    }

    @Test
    void getExpirationDateTest() {
    }
}