package classManager;

import java.util.ArrayList;

public class InventoryManager {

    private ArrayList<Product> products;

    public InventoryManager(){
        products = new ArrayList<Product>();
    }

    public InventoryManager(ArrayList<Product> products) {
        this.products = products;
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

    public void sellProduct(int id, int quantity){
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);
            if(p.getId() == id){
                p.setQuantity(p.getQuantity() - quantity);
            }
        }
    }

    public void receiveShipment(int id, int quantity){
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);
            if(p.getId() == id){
                p.setQuantity(p.getQuantity() + quantity);
            }
        }
    }

    public Product getProduct(String name) {
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
