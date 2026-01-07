package HomeWork10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.println("請輸入日期 (年月日，例如: 20110131)：");
            input = sc.next();

            // 1. 正規表示法檢查：必須剛好 8 位數字
            if (!input.matches("\\d{8}")) {
                System.out.println("日期格式不正確，請再輸入一次！");
                continue;
            }

            // 2. 嘗試解析日期，並檢查日期合法性 (如：有沒有 13 月或 2 月 30 號)
            SimpleDateFormat sdfInput = new SimpleDateFormat("yyyyMMdd");
            sdfInput.setLenient(false); // 嚴謹模式：若日期不合理會拋出例外

            try {
                Date date = sdfInput.parse(input);

                // 3. 讓使用者選擇格式
                System.out.println("欲格式化成：");
                System.out.println("(1) 年/月/日 (2) 月/日/年 (3) 日/月/年");
                String choice = sc.next();
                
                SimpleDateFormat sdfOutput;
                switch (choice) {
                    case "1":
                        sdfOutput = new SimpleDateFormat("yyyy/MM/dd");
                        System.out.println("格式化結果：" + sdfOutput.format(date));
                        break;
                    case "2":
                        sdfOutput = new SimpleDateFormat("MM/dd/yyyy");
                        System.out.println("格式化結果：" + sdfOutput.format(date));
                        break;
                    case "3":
                        sdfOutput = new SimpleDateFormat("dd/MM/yyyy");
                        System.out.println("格式化結果：" + sdfOutput.format(date));
                        break;
                    default:
                        System.out.println("無此選項，請重新輸入日期與選擇！");
                        continue;
                }
                break; // 成功印出格式，跳出迴圈

            } catch (ParseException e) {
                System.out.println("無效的日期內容，請重新輸入！");
            }
        }
        sc.close();
    }
}
