public abstract class BaseCandy {

    public BaseCandy(int weight, int cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    private int weight;
    private int cost;
    private String color;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +" {" +
                "weight=" + weight +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
