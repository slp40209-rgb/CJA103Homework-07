package HomeWork7;



public class Dog extends Animal {
    private static final long serialVersionUID = 1L;

    public Dog(String name) {
        super(name); 
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}