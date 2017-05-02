package classManager;

import java.util.ArrayList;

public class InventoryManager {

    private ArrayList<Product> products;
    private double totalValue;

    public InventoryManager(ArrayList<Product> products) {
        this.products = products;
        this.totalValue = this.findTotalValue();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public void removeProduct(int id){

        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == id){
                products.remove(i);
                break;
            }
        }
    }

    public double findTotalValue(){
        double total = 0;
        for(int i = 0; i < products.size(); i++){
            total += products.get(i).getPrice() * products.get(i).getQuantity();
        }
        return total;
    }
}
