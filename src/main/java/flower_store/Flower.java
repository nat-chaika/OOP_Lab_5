package flower_store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
//    private FlowerType type;
    private int price;
    private FlowerColor color;


    public Flower() {
        this.price = 50;
        this.color = FlowerColor.RED;
    }

    public Flower(int i, FlowerColor color) {
        this.setPrice(i);
        this.setColor(color);
    }


    public String getColor() {
        return this.color.toString();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
