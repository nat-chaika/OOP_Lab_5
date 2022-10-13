package flower_store;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FlowerPack {
    private int price;


    public FlowerPack(Flower flower, int i) {
        this.setPrice(this.getPrice() + flower.getPrice() * i );
    }
}
