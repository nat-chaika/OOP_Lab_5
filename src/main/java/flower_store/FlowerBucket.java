package flower_store;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class FlowerBucket {
    private int price;
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    public void add(FlowerPack pack) {
        this.flowerPacks.add(pack);
        this.setPrice(this.getPrice()+pack.getPrice());
    }

}
