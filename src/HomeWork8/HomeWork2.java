package HomeWork8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork2 {

	public static void main(String[] args) {
        
        Train[] trains = {
            new Train(202, "普悠瑪", "樹林", "花蓮", 400),
            new Train(1254, "區間", "屏東", "基隆", 700),
            new Train(118, "自強", "高雄", "台北", 500),
            new Train(1288, "區間", "新竹", "基隆", 400),
            new Train(122, "自強", "台中", "花蓮", 600),
            new Train(1222, "區間", "樹林", "七堵", 300),
            new Train(1254, "區間", "屏東", "基隆", 700) // 重複資料
        };

        
        System.out.println("--- 1. 不重複的火車資訊 ---");
        Set<Train> set = new HashSet<>();
        for (Train t : trains) set.add(t);
        for (Train t : set) System.out.println(t);

        
        System.out.println("\n--- 2. 班次由大到小排序 ---");
        List<Train> list = new ArrayList<>();
        for (Train t : trains) list.add(t);
        Collections.sort(list, (t1, t2) -> t2.getNumber() - t1.getNumber());
        for (Train t : list) System.out.println(t);

        
        System.out.println("\n--- 3. 不重複且班次由大到小排序 ---");
        
        Set<Train> treeSet = new TreeSet<>((t1, t2) -> t2.getNumber() - t1.getNumber());
        for (Train t : trains) treeSet.add(t);
        for (Train t : treeSet) System.out.println(t);
    }
}

