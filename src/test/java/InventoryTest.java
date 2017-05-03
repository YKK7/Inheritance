import classManager.InventoryManager;
import classManager.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InventoryTest {

    @Test
    public void AddProductTest(){

        //: Given
        InventoryManager test = new InventoryManager();
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
        InventoryManager test = new InventoryManager();
        test.addProduct(new Product("Candy", 0.15, 3, 100));

        //When
        test.removeProduct(3);

        //Then
        assertTrue(test.getProducts().size() == 0);

    }

    @Test
    public void FindTotalValueTest(){

        //Given
        InventoryManager test = new InventoryManager();
        test.addProduct(new Product("Candy", 0.15, 3, 100));
        test.addProduct(new Product("Chocolate", 0.25, 4, 100));

        //When
        double result = test.findTotalValue();

        //Then
        assertEquals("Total should be 40.0", 40.0, result, 0.);

    }

    @Test
    public void Test(){

        //: Given

        //: When

        //: Then

    }

}
