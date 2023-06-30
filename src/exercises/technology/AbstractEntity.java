package exercises.technology;

public abstract class AbstractEntity {
    private int id;
    private static int nextId = 1;

    public AbstractEntity() {
        id = nextId;
        nextId++;
    }
}
