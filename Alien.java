
// Record class 
public record Alien(int id, String name) { // by default final and private

    // ? canonical constructor
    // public Alien(int id, String name) {
    // if (id <= 0) {
    // throw new IllegalArgumentException("Id cannot be Zero");
    // }

    // this.id = id;
    // this.name = name;
    // }

    // ? compact canonical constructor
    public Alien {
        if (id <= 0)
            throw new IllegalArgumentException("Id cannot be zero.");
    }

    public Alien() {
        this(55, "Abc");
    }
    // !Not recommended
}
