package util;

public class Swapper {

    public static <T> void swapSimple(int firstElement, int secondElement, T[] array) {
        T temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }

    public static void swapInts(int firstElement, int secondElement, int[] array){
        array[firstElement] = array[firstElement]^array[secondElement];
        array[secondElement] = array[firstElement]^array[secondElement];
        array[firstElement] = array[firstElement]^array[secondElement];
    }

}
