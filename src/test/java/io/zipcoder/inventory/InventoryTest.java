package io.zipcoder.inventory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InventoryTest {

    InventoryManager test;

    @Before
    public void initialize() {
        test = new InventoryManager();
    }

    @Test
    public void AddProductTest(){

        //: Given
        Product prod = new Product("Candy", 0.15, 3, 100);

        //: When
        test.addProduct(prod);

        //: Then
//        assertTrue(test.getProducts().get(0).equals(prod));
        assertTrue(test.getProducts().size()==1);

    }


    @Test
    public void RemoveProductTest(){
        //Given
        test.addProduct(new Product("Candy", 0.15, 3, 100));

        //When
        test.removeProduct(3);

        //Then
        assertTrue(test.getProducts().size() == 0);

    }

    @Test
    public void FindTotalValueTest(){

        //Given
        test.addProduct(new Product("Candy", 0.15, 3, 100));
        test.addProduct(new Product("Chocolate", 0.25, 4, 100));

        //When
        double result = test.findTotalValue();

        //Then
        assertEquals("Total should be 40.0", 40.0, result, 0.);

    }

    @Test
    public void SellProductTest(){

        //: Given
        test.addProduct(new Product("Candy", 0.15, 3, 100));

        //: When
        test.sellProduct(3, 50);

        //: Then\
        assertEquals("There should be 50 left", 50, test.getProduct("Candy").getQuantity());

    }

    @Test
    public void ReceiveShipmentTest(){

        //: Given
        test.addProduct(new Product("Candy", 0.15, 3, 100));

        //: When
        test.receiveShipment(3, 50);

        //: Then\
        assertEquals("There should now be 150 candies", 150, test.getProduct("Candy").getQuantity());

    }

    @Test
    public void GetProductTest(){

        //: Given
        test.addProduct(new Product("Candy", 0.15, 3, 100));

        //: When
        Product result = test.getProduct("Candy");

        //: Then
        assertEquals(test.getProducts().get(0), result);

    }

}
