public class GenericMethodTest {
    public static <E> void printArray(E[] inputArray){
        for(E e:inputArray){
            System.out.println("%s"+e+"\n");
        }
    }
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        printArray(charArray);
    }
}
