

public class Fruit  {
    private float weight;

    Fruit(float weight){
        this.weight=weight;

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean compareTo(Fruit f) {
        if (weight>f.weight) return true;
        return false;
    }

}
