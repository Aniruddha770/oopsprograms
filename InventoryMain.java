/**
 * @author Aniruddha
 * @since 20Jun2021
 * Inventory Management System
 */
package InventoryController;
import InventoryModel.Inventory;
import java.util.ArrayList;
import java.util.Scanner;

public class InventoryMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Inventory Management System");
        ArrayList<Inventory> List = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 to Add Inventory");
            System.out.println("Enter 2 to View Inventory");
            System.out.println("Enter 3 to Edit Inventory");
            System.out.println("Enter 4 to Delete Inventory");
            System.out.println("Enter 5 to Exit");
            int choice= s.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Name of Inventory");  //Adding Inventory
                    String name= s.next();
                    System.out.println("Enter Price");
                    Double price= s.nextDouble();
                    System.out.println("Enter Weight");
                    Double weight= s.nextDouble();
                    Inventory inventory=new Inventory();
                    inventory.setName(name);
                    inventory.setPrice(price);
                    inventory.setWeight(weight);
                    List.add(inventory);
                    break;

                case 2:
                    // View Inventory
                    for (Inventory inventory1: List){
                        System.out.println(inventory1.getName()+" "+inventory1.getPrice()+" "+inventory1.getWeight());
                    }
                    break;

                case 3:
                      // Edit Inventory
                    System.out.println("Enter Inventory Name:");
                    String Name=s.next();
                    for(int i=0;i<List.size();i++){
                        if(List.get(i).getName().equals(Name)){
                            System.out.println("Enter Price");
                            Double newprice= s.nextDouble();
                            System.out.println("Enter Weight");
                            Double newweight= s.nextDouble();
                            List.get(i).setPrice(newprice);
                            List.get(i).setWeight(newweight);
                            break;
                        }
                    }
                    break;

                case 4:
                    // Deleting Inventory
                    System.out.println("Enter Inventory Name");
                    String delete= s.next();
                    for(int i=0; i<List.size();i++){
                        if(List.get(i).getName().equals(delete)){
                            List.remove(i);
                            break;
                        }
                    }
            }
            if(choice == 5){
                break;
            }
        }

    }
}
