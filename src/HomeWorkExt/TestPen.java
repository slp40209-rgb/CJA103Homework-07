package HomeWorkExt;

public class TestPen {

	public static void main(String[] args) {
		Pen p1 = new Pencil ("SKU", 50);
		Pen p2 = new InkBrush("喵喵牌", 120);
		
		System.out.println(p1.getBrand() + " 售價：" + p1.getPrice());
        p1.write();

        System.out.println(p2.getBrand() + " 售價：" + p2.getPrice());
        p2.write();
	}
}
