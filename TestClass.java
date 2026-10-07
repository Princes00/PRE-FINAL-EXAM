/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestClass {
    public static void main(String[] args) {

        Fruit[] fruits = {
            new Fruit("F001", "Apple", 120.00),
            new Fruit("F002", "Orange", 100.00),
            new Fruit("F003", "Strawberry", 150.00),
            new Fruit("F004", "Banana", 80.00),
            new Fruit("F005", "Mango", 50.00),
            new Fruit("F006", "Grapes", 200.00),
            new Fruit("F007", "Kiwi", 110.00),
            new Fruit("F008", "Durian", 180.00)
        };
        System.out.println("FRUIT PRICE SORTER");

        System.out.println("\nOriginal List:");
        displayFruitList(fruits);

        // Sort using Merge Sort
        MergeSort.sort(fruits);

        System.out.println("\nSorted by Price - Lowest to Highest:");
        displayFruitList(fruits);

        System.out.println("\nTop 3 Cheapest:");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d. %s - P%.2f%n",
                    i + 1,
                    fruits[i].name,
                    fruits[i].price);
        }
    }

    public static void displayFruitList(Fruit[] fruits) {
        for (Fruit fruit : fruits) {
            System.out.printf("%s - %s - P%.2f%n",
                    fruit.fruitId,
                    fruit.name,
                    fruit.price);
        }
    }
}
    
