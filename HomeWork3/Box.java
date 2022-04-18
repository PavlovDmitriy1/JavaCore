package HomeWork3;

import java.util.ArrayList;

public class Box <F> {
    ArrayList<F> fruits = new ArrayList();
    private float weightFruit;


    public <F> Box(float weightFruit){
        this.weightFruit = weightFruit;
    }

    public float getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<Apple> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

}
