package HomeWork7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HomeWork5 {

//	請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
	
	public static void main(String[] args) {
   
        File dir = new File("C:\\data");
        File file = new File(dir, "Object.ser");

       
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("資料夾 C:\\data 建立成功");
            } else {
                System.err.println("資料夾建立失敗，請檢查權限");
                return;
            }
        }

        
        Dog dog1 = new Dog("小黑");
        Dog dog2 = new Dog("小白");
        Cat cat1 = new Cat("咪咪");
        Cat cat2 = new Cat("大橘");

        
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(dog1);
            oos.writeObject(dog2);
            oos.writeObject(cat1);
            oos.writeObject(cat2);

            System.out.println("物件已成功寫入至 " + file.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("寫入物件時發生錯誤：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
