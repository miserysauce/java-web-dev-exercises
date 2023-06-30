package exercises.technology;
//For a parent class add 3 properties, 2 methods, and a constructor.
public class Computer extends AbstractEntity {
private String brand;
private int ram;
private int storage;

    public Computer (String brand, int ram, int storage){
        this.brand = brand;
        this.ram = ram;
        this.storage =  storage;
    }

    public void increaseRam(int n){
        this.ram += this.ram + n;
    }

    public void increaseStorage(int x){
        this.storage += this.storage + x;
    }
}
