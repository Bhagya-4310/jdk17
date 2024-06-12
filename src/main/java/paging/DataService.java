package paging;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    public List<String> getName() {
        List<String> nameList = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            nameList.add(String.valueOf(i));
        }
        return nameList;
    }
}