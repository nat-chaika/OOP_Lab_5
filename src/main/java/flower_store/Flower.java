package flower_store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
//    private FlowerType type;
    private int price;
    private FlowerColor color;
    private double petal_length;


    public Flower() {
        this.price = 50;
        this.color = FlowerColor.RED;
        this.petal_length = 5.0;
    }

    public Flower(int i, FlowerColor color) {
        super();
    }

    public Flower(int i, FlowerColor color, double v) {
        super();
    }

    public String getColor() {
        return this.color.toString();
    }

}
