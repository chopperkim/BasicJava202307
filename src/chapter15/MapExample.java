package chapter15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        int size = map.size();
        System.out.println("총 entry 수: " + size);
        int value = map.get("홍길동");
        System.out.println("홍길동의 점수: " + value);

        // Map의 데이터를 가져오는 방법
        // 1. entry를 이용
        // 1-1. iterator를 이용
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        entrySet.iterator();

        // 1-2. foreach
        for (Map.Entry<String, Integer> entry : entrySet) {
            String v = entry.getKey() + entry.getValue();
        }

        // 2. key를 이용
        // 2-1. iterator
        Set<String> keySet = map.keySet();
        keySet.iterator();
        // 2-2. foreach
        for (String s : keySet) {
            map.get(s);
        }

        // 3. value를 이용 (foreach)
        Collection<Integer> values = map.values();
        for (Integer i : values) {
            System.out.println(i);
        }

    }
}
