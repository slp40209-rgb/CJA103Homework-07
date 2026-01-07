package HomeWork5;

public class HomeWork5 {

//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
	
	public static void main(String[] args) {
        
        String authCode = genAuthCode();
        System.out.println("本次生成的驗證碼為: " + authCode);
    }

    
    public static String genAuthCode() {
        
        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + 
                      "abcdefghijklmnopqrstuvwxyz" + 
                      "0123456789";                
        
        
        StringBuilder code = new StringBuilder();
        
        
        for (int i = 0; i < 8; i++) {
            
            int index = (int) (Math.random() * pool.length());
            
            
            code.append(pool.charAt(index));
        }
        
        
        return code.toString();
    }
}

