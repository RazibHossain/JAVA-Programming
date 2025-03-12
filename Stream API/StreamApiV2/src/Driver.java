import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

//    Intermediate Operations
//    filter                    Filters elements based on a condition.
//    map                       Transforms each element in the stream
//    flatMap                   Flattens nested structures
//    distinct()                Removes duplicate elements.
//    sorted()                  Sorts elements in natural order.
//    sorted(Comparator<T>)     Sorts elements using a custom comparator.
//    peek                      Performs an action without modifying elements
//    limit                     limit
//    skip                      Skips the first n elements.

//    Terminal Operations
//    collect(Collector)	    Converts stream into a collection or string
//    reduce(BinaryOperator)	Combines elements into a single value
//    count()	                Counts elements in the stream
//    min(Comparator)	        Finds the minimum element
//    max(Comparator)	        Finds the maximum element
//    forEach(Consumer)	        Iterates over elements
//    forEachOrdered(Consumer)	Iterates in order (for parallel streams)
//    anyMatch(Predicate)	    Checks if any element matches condition
//    allMatch(Predicate)	    Checks if all elements match condition
//    noneMatch(Predicate)	    Checks if no element matches condition
//    findFirst()	            Retrieves the first element
//    findAny()	                Retrieves any element (useful in parallel)

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11, 2, 39, 4, 35,11);
        List<Integer> numby = Arrays.asList(98, 5,9);
        List<List<Integer>> nestedNumberList = Arrays.asList(numbers,numby);
        List<String> names = Arrays.asList("Alice", "Bob","Aarman");
//        1. filter- Filters elements based on a condition.
        IM_Filter(numbers);
//        2. map- Transforms each element in the stream
        Im_Map(numbers);      /* filter stream theke condition check kore value remove kore output dei.
                                Jekhane map use kora hoi stream er upor kono operation chaliye transformed ekta stream return kore */
//        3. flatMap-Flattens nested structures. Nested collection k list of collection a convert kore.
        Im_FlatMap(nestedNumberList);
//        4. distinct()-Removes duplicate elements.
        Im_Distinct(numbers);
//        5. sorted()-Sorts elements in natural order.
        Im_Sort(numbers);
//        6. sorted(Comparator<T>)-Sorts elements using a custom comparator.
        Im_SortCustom(numbers);
//        7. peek-Performs an action without modifying elements. main vivionno operation chalanor por stram thik ache kina ta dekhar jonno use kori.
        Im_Peek(names);
//        8. limit
        Im_Limit(numbers);
//        9. skip                      Skips the first n elements.
        Im_Skip(numbers);
    }

    private static void Im_Skip(List<Integer> numbers) {
        System.out.println("9.Im_Skip");
        numbers.stream().skip(2).forEach(System.out::println);
    }

    private static void Im_Limit(List<Integer> numbers) {
        System.out.println("8.Im_Limit");
        numbers.stream().limit(2).forEach(System.out::println);
    }

    private static void Im_Peek(List<String> numbers) {
        System.out.println("7.Im_Peek");
        numbers.stream().filter(e -> e.length() > 4)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

    private static void Im_SortCustom(List<Integer> numbers) {
        System.out.println("6.Im_SortCustom");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void Im_Sort(List<Integer> numbers) {
        System.out.println("5.Im_Sort");
        numbers.stream().sorted().forEach(System.out::println);
    }

    private static void Im_Distinct(List<Integer> numbers) {
        System.out.println("4.Im_Distinct");
        numbers.stream().distinct().forEach(System.out::println);
    }

    private static void Im_FlatMap(List<List<Integer>> nestedNumberList) {
        System.out.println("3.IM_Flatmap");
        nestedNumberList.stream().flatMap(List::stream).forEach(System.out::println);
//        nestedNumberList.stream().flatMap(nestList->nestList.stream()).forEach(System.out::println);

//        list er string value er 2nd character niye stream banano
//        List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
//        list.stream()
//                .flatMap(str -> Stream.of(str.charAt(2)))
//                .forEach(System.out::println);
    }

    private static void Im_Map(List<Integer> numbers) {
        System.out.println("2.IM_Map");
        numbers.stream().map(e->e*2).forEach(System.out::println);
//        using method reference also can be write below
//        numbers.stream().map(e->e*2).forEach(e->System.out.println(e));
    }


    private static void IM_Filter(List<Integer> numbers) {
        System.out.println("1.IM_Filter");
        numbers.stream().filter((e)->e>4).forEach(System.out::println);
        //        using method reference also can be write below. Syntax- Object :: methodName
//        numbers.stream().filter((e)->e>4).forEach(e->System.out.println(e));
    }

//Metho Reference by lambda
//    public class Geeks
//    {
//        // Method
//        public static void print(String s) {
//            System.out.println(s);
//        }
//
//        public static void main(String[] args)
//        {
//            String[] names = {"Alice", "Bob", "Charlie"};
//
//            // Using method reference to print each name.Syntax- Object :: methodName
//            Arrays.stream(names).forEach(Geeks::print);
//        }
//    }

// Problem1
// Given a list of employee names with some duplicates, filter out names that are shorter than 4 characters,
// convert all names to uppercase, sort them in descending order, remove duplicates, skip the first two names,
// and limit the result to 3 names.


}
