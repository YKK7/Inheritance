package classManager;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        InventoryManager manager = new InventoryManager();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Apples to add: ");
        manager.addProduct(new Product("Apple", 0.35, 1, sc.nextInt()));

        System.out.println("Enter number of Oranges to add: ");
        manager.addProduct(new Product("Orange", 0.40, 2, sc.nextInt()));

        System.out.println("There are now " + manager.getProduct("Orange").getQuantity() +  " oranges and " +
                manager.getProduct("Apple").getQuantity() + " apples in the inventory, for a total value of $" + manager.findTotalValue());


        System.out.print("Enter number of Apples to sell: ");
        manager.sellProduct(1, sc.nextInt());


        System.out.print("Enter number of Oranges to sell: ");
        manager.sellProduct(2, sc.nextInt());

        System.out.println("There are now " + manager.getProduct("Orange").getQuantity() +  " oranges and " +
                manager.getProduct("Apple").getQuantity() + " apples in the inventory, for a total value of " + manager.findTotalValue());



        System.out.print("Enter number of Apples to receive: ");
        manager.receiveShipment(1, sc.nextInt());


        System.out.print("Enter number of Oranges to receive: ");
        manager.receiveShipment(2, sc.nextInt());

        System.out.println("There are now " + manager.getProduct("Orange").getQuantity() +  " oranges and " +
                manager.getProduct("Apple").getQuantity() + " apples in the inventory, for a total value of " + manager.findTotalValue());

    }
}
