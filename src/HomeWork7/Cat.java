package HomeWork7;



public class Cat extends Animal {
    private static final long serialVersionUID = 1L;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Meow!");
    }
}