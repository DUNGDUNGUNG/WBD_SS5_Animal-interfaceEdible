package fruit;

import com.edible.Edible;

public abstract class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "ok";
    }
}
