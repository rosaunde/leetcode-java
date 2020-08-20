package medium;

import java.util.LinkedHashMap;

class IntegerToRoman {
    private LinkedHashMap<Integer, String> map = makeMap();
    public String intToRoman(int num) {
        String result = "";
        for(int key : map.keySet()){
            while(num >= key){
                num -= key;
                result += map.get(key);
            }
        }
        return result;
    }

    private LinkedHashMap<Integer, String> makeMap(){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        return map;
    }
}