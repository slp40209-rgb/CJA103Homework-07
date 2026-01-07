package HomeWork8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork1 {

	public static void main(String[] args) {
        
        List<Object> list = new ArrayList<>();

        
        list.add(100);              
        list.add(3.14);             
        list.add(21L);              
        list.add(Short.valueOf("100")); 
        list.add(5.1);              
        list.add("Kitty");
        list.add(100);              
        list.add(new Object());     
        list.add("Snoopy");
        list.add(new BigInteger("1000")); 
        // ----------------------------------------------------
        
        // ----------------------------------------------------
        System.out.println("--- 移除前的所有元素 ---");

        
        System.out.print("Iterator: ");
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        
        System.out.print("傳統 for: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        
        System.out.print("foreach : ");
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println("\n");

        // ----------------------------------------------------
        
        // ----------------------------------------------------
        
        Iterator<Object> itRemover = list.iterator();
        while (itRemover.hasNext()) {
            Object obj = itRemover.next();
            
            if (!(obj instanceof Number)) {
                itRemover.remove();
            }
        }

        // ----------------------------------------------------
        
        // ----------------------------------------------------
        System.out.println("--- 移除非 Number 物件後的元素 ---");
        for (Object numObj : list) {
            System.out.println(numObj);
        }
    }
}
