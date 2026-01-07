package HomeWork4;

public class HomeWork3 {

//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)(18個
	public static void main(String[] args) {
		String[] St = {
	            "mercury", "venus", "earth", "mars",
	            "jupiter", "saturn", "uranus", "neptune"
	        };
		String ae = "aeiou";
        int count = 0;
        for (String A : St) {
            
            for (char c : A.toCharArray()) {
                
                if (ae.contains(String.valueOf(c))) {
                    count++;
                }
            }
        } System.out.println("母音總數：" + count);
    }

}

