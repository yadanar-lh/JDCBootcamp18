package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionTraverse {
    static void main() {
        List<Integer> iList = new ArrayList<>();
        Collections.addAll(iList, 1,2,3,4,5,6);

        for(Integer num:iList){
            if(num == 3){
                iList.remove(3);
            }
            System.out.println(num);
        }
    }


}
