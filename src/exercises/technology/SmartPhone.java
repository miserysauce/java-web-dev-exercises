package exercises.technology;
//For a child class add at least 1 additional property and 1 additional method.
public class SmartPhone extends Computer {
    public int numberOfPhotos;

    public SmartPhone (String brand, int ram, int storage, int numberOfPhotos){
        super(brand, ram, storage);
        this.numberOfPhotos = numberOfPhotos;
    }

    public void takePhoto(){
        this.numberOfPhotos = this.numberOfPhotos + 1;
    }

    public int getNumberOfPhotos() {
        return numberOfPhotos;
    }
}
