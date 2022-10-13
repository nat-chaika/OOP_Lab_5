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

    }
    public Flower(int price, FlowerColor color) {
        super();
    }
    public String getColor() {
        return this.color.toString();
    }

}
