
public class Apple {
    String color;
    int weight;

    public Apple(String name, int weight) {
        this.color = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{color='" + color + "', weight=" + weight + "}";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void add(Apple apple) {

    }
}