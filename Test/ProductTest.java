//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDate;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ProductTest {
//
//    @Test
//        void requirementTest() {
//            Product item1 = new Product(478, "Avocado",0,0.0, LocalDate.of(2021,6,30));
//            assertFalse(item1.requirement(false, 12.0,false));
//            assertFalse(item1.requirement(false, 7.0, false));
//            assertTrue(item1.requirement(true, 11.0, true));
//            assertTrue(item1.requirement(true, 1.0, false));
//            assertTrue(item1.requirement(true, 14.0, false));
//
//
//        }
//
//    @Test
//    void getProductNameTest() {
//            Product item1 = new Product(478, "Avocado",0,0.0, LocalDate.of(2021,6,30));
//
//
//        }
//
//
//    @Test
//    void getCountTest() {
//        Product item1 = new Product(478, "Avocado",0,0.0, LocalDate.of(2021,6,30));
//
//        assertEquals(1,item1.getCount(0.0),0.0001);
//        assertEquals(1,item1.getCount(2.5),0.0001);
//        assertEquals(1,item1.getCount(3.0),0.0001);
//        assertEquals(2,item1.getCount(4.5),0.0001);
//        assertEquals(2,item1.getCount(5.0),0.0001);
//        assertEquals(2,item1.getCount(6.5),0.0001);
//        assertEquals(3,item1.getCount(7.0),0.0001);
//        assertEquals(3,item1.getCount(8.5),0.0001);
//        assertEquals(3,item1.getCount(10.0),0.0001);
//
//
//    }
//
//    @Test
//    void berekenBestelbedragTest() {
//        Product item1 = new Product(478, "Avocado",0,0.0, LocalDate.of(2021,6,30));
//
//        assertEquals(100,item1.berekenBestelbedrag(1.5,true,true, 75.00));
//        assertEquals(50,item1.berekenBestelbedrag(2.5, false, false, 40.00));
//        assertEquals(75,item1.berekenBestelbedrag(5.5, true, false, .00));
//        assertEquals(30,item1.berekenBestelbedrag(6.5, false, false,40.00 ));
//        assertEquals(50,item1.berekenBestelbedrag(7.0, true, true,40.00));
//        assertEquals(20,item1.berekenBestelbedrag(8.0, false, false, 40.00));
//    }
//
//    @Test
//    void getExpirationDateTest() {
//    }
//}