package flower_store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket = new FlowerBucket();

    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower,10);
        flowerBucket.add(flowerPack);
    }

    @Test
    public void testPrice() {
//        System.out.println(flowerBucket.getPrice());
        flowerBucket.setPrice(0);
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower,10);
        flowerBucket.add(flowerPack);
        assertEquals(100, flowerBucket.getPrice());
    }

}
