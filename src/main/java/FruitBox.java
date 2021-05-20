

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FruitBox<T extends Fruit> {
    private ArrayList<T> list;

    public FruitBox(){
        list = new ArrayList<T>();
    }

    public FruitBox(ArrayList<T> list) {
        this.list = list;
    }

    public void add(T fruit){
        list.add(fruit);
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    public float getWeight () {
        float result = 0;

        for (int i = 0; i <list.size() ; i++) {
            result+=list.get(i).getWeight();
        }
        return result;
    }

    public boolean  compare(FruitBox anotherFruitBox){
        if (this.getWeight()==anotherFruitBox.getWeight()) return true;
        return false;
    }

    public   void putToAnotherFruitBox (FruitBox<T> toBox){
       // if(toBox.getList().get(0) instanceof Orange )
        for (int i = 0; i <this.getList().size() ; i++) {
            toBox.add( getList().get(i));
        }
        getList().removeAll(getList());

    }

}
