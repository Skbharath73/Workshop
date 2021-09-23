package birds.sanctuary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Data Layer or Model Layer
public class BirdsRepo {
    //private List<Bird> birdList = new ArrayList<Bird>();
    Set<Bird> birdList = new HashSet<Bird>();

    public void add(Bird bird){

        birdList.add(bird);
    }

    public void remove(Bird bird){

        birdList.remove(bird);
    }

//    public HashSet getBirdList() {
//
//        return (HashSet) birdList;
//    }
    public Set<Bird> getBirdList() {
        return birdList;
    }
}
