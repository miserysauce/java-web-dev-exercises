package exercises.technology;
//For a child class add at least 1 additional property and 1 additional method.
public class Laptop extends Computer {
    public double weight;

    public Laptop (String brand, int ram, int storage, double weight){
        super(brand, ram, storage);
        this.weight = weight;
    }
    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        }
        else {
            return false;
        }
    }

}
