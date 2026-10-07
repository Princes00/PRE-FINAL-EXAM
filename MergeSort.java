/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MergeSort {
  
    public static void sort(Fruit[] fruits){
        if (fruits.length < 2) {
            return;
        }
    
    int mid = fruits.length / 2;    
        Fruit[] left = new Fruit[mid];
        Fruit[] right = new Fruit [fruits.length - mid];
    
        for (int i = 0; 1  < mid; i++) {
            left[i] = fruits[i];
        }
        
        for (int i = mid; i < fruits .length; i++) {
            right[i - mid] = fruits[i]; 
        }
        
        sort(left);
        sort(right);
        
        merge (fruits, left, right);
    }
    
    public static void merge(Fruit[] fruits, Fruit[] left, Fruit[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < left.length && j < right.length) {
            
            if (left[i].price <= right[j].price) {
               fruits[k] = left[i];
               i++;
            }
            
            k++;
        }
        
        while (i < left .length) {
            fruits[k] = left[i];
            i++;
            k++;
        }
        
        while (j < right.length) {
            fruits[k] = right[i];
            j++;
            k++;
        } 
    }
}
