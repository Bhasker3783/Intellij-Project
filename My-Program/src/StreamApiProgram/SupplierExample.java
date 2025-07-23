package StreamApiProgram;

import java.util.function.Supplier;

public class SupplierExample {
    private String name;
    private int age;

    SupplierExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SupplierExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {


        Supplier<SupplierExample> supplier = () -> new SupplierExample("Bhasker", 18);
        System.out.println(supplier.get());
    }
}
