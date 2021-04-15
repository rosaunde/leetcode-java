import easy.*;

import java.util.*;

import static easy.TwoSum.twoSum;


public class TestMyCode{
    public static void main(String[] args){
      MyClass clazz = new MyClass();
      try{
          clazz.getValue("foo", 0);
      } catch(Exception e){

      }
        try{
            clazz.getValue("bar", 2);
        } catch(Exception e){

        }
        try{
            clazz.getValue("baz", 0);
        } catch(Exception e){

        }
        try{
            clazz.getValue("fubar", 1);
        } catch(Exception e){

        }

        System.out.println(clazz.count);
    }
}

class MyClass {
    Map<String,Integer> map;
    public int count = 0;

    public MyClass(){
        this.map = new HashMap<>();
        map.put("foo", 1);
        map.put("bar", 3);
    }

    public int getValue(String input, int retries) {
        count = count + 1;
        try{
            return map.get(input);
        } catch(Exception e){
            if(retries > 3){
                throw e;
            }
        }
        return getValue(input, retries + 1);
    }
}