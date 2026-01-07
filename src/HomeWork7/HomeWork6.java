package HomeWork7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HomeWork6 {

	public static void main(String[] args) {
        File file = new File("C:\\data\\Object.ser");

        
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            System.out.println("開始讀取物件並執行 speak():");
            System.out.println("-------------------------");

            
            try {
                while (true) {
                    Object obj = ois.readObject();
                    if (obj instanceof Animal) {
                        Animal a = (Animal) obj;
                        a.speak(); 
                    }
                }
            } catch (EOFException e) {
                
                System.out.println("-------------------------");
                System.out.println("所有物件讀取完畢！");
            }

        } catch (ClassNotFoundException e) {
            System.err.println("找不到對應的類別：" + e.getMessage());
        } catch (IOException e) {
            System.err.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }
}
