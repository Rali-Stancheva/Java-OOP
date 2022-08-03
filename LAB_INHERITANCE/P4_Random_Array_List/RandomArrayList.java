package OOP.LAB_INHERITANCE.P4_Random_Array_List;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {

    public Object getRandomElement(){
        int index = new Random().nextInt(super.size());
        return super.remove(index);
    }
}
