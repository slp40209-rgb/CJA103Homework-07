

	package HomeWork7;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class HomeWork4 {

//		請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案

	    public static void main(String[] args) {
	        
	        copyFile("Data.txt", "Data_Backup.txt");
	    }

	    
	    public static void copyFile(String source, String dest) {
	        File inputFile = new File(source);
	        File outputFile = new File(dest);

	        
	        try (FileInputStream fis = new FileInputStream(inputFile);
	             FileOutputStream fos = new FileOutputStream(outputFile)) {

	            System.out.println("正在複製檔案: " + source + " -> " + dest);

	            
	            byte[] buffer = new byte[1024];
	            int length;

	            
	            while ((length = fis.read(buffer)) != -1) {
	                
	                fos.write(buffer, 0, length);
	            }

	            System.out.println("檔案複製成功！");

	        } catch (IOException e) {
	            System.err.println("複製過程中發生錯誤：" + e.getMessage());
	        }
	    }
}
