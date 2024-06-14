package less3;

import java.util.Collections;
import java.util.List;

public class StreamService {

        public void sort(List<Stream> arrayList){
        Collections.sort(arrayList, new StreamComparator());
    }
    
}
