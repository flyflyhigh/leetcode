/*
170. Two Sum III - Data structure design
Design and implement a TwoSum class. It should support the following operations:add and find.
add - Add the number to an internal data structure. find - Find if there exists any pair of numbers which sum is equal to the value.
For example,
add(1); add(3); add(5);
find(4) -> true
find(7) -> false
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSumDesign {
    Map<Integer, Integer> map = new HashMap<>();
    public void add(int num){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    public boolean find(int target){
        for(int num : map.keySet()){
            int another = target - num;
            if((num == another && map.get(num) >= 2) || (num != another && map.containsKey(another))){
                return true;
            }
        }
        return false;
    }
}
