import easy.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static easy.TwoSum.twoSum;


public class TestMyCode{
    public static void main(String[] args){
       int result = 0;
       for(int i = 1; i < 7; i++){
           result = result ^ i;
       }

       for(int i = 2; i < 7; i++){
           result = result ^ i;
       }
       System.out.println(3^3);
       System.out.println(result);
    }
}