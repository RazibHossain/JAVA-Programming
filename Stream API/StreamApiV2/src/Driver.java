import java.util.*;
import java.util.function.Function;
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


//        Terminal Operation
//        1. collect(Collector)-Converts stream into a collection or string
        TM_Collection(names);
//        2. reduce(BinaryOperator)-Combines elements into a single value
        TM_Reduce(numbers,names);
//          3. count()-Counts elements in the stream
        TM_Count(names);
//          4. min(Comparator)- Finds the minimum element
        TM_Min(numbers);
//          5. max(Comparator)-Finds the maximum element
        TM_Max(numbers);
//          6. anyMatch(Predicate)	    Checks if any element matches condition
        TM_AnyMatch(names);
//          7. allMatch(Predicate)	    Checks if all elements match condition
        TM_AllMatch(names);
//          8. noneMatch(Predicate)	    Checks if no element matches condition
        TM_NoneMatch(names);
//          9. findFirst()	            Retrieves the first element
        TM_findFirst(names);
//          10. findAny()	                Retrieves any element (useful in parallel)
        TM_findAny(names);

//        groupby a argument to collect method not intermediate or terminal operation
        GroupByOperation();

//        Problem Solving
        SolveProblem1();
        FindDuplicatesItem();
        ConvertStringtoCharacterStream();
        StreamofWord();
        FilterCharacterFromString();
        ConvertStreamIntoString();
        SortingLetterInString();
        CharacterFrequencyFromGivenString();
        FindAverageofArray();
        SumofAllEvenNumbers();

    }

    private static void SortingLetterInString() {
    }

    private static void ConvertStreamIntoString() {
    }

    private static void FilterCharacterFromString() {
    }

    private static void StreamofWord() {
    }

    private static void ConvertStringtoCharacterStream() {
    }

    private static void GroupByOperation() {
        List<String> g = Arrays.asList("geeks", "for", "geeks");
//        kon word kotobar ache groupby kore tar count kora
        Map<String, Long> result = g.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        grouping by collect funtion er parameter. Function.identity() hocche stream er element itself.
         System.out.println();

        List<Person> people = Arrays.asList(
                new Person("Alice", "New York"),
                new Person("Bob", "Los Angeles"),
                new Person("Charlie", "New York"),
                new Person("David", "Los Angeles"),
                new Person("Eve", "Chicago")
        );
//        Kono city kk thake tar list
        Map<String,List<Person>> result2 = people.stream().collect(Collectors.groupingBy(e->e.city));
//        kon city te kotojon thake tar count
        Map<String,Long> result3 = people.stream().collect(Collectors.groupingBy(e->e.city,Collectors.counting()));

        System.out.println();
//        Nested Groupby
        Map<String, Map<Integer, List<Person>>> multiLevelGrouping = people.stream()
                .collect(Collectors.groupingBy(
                        person -> person.city,
                        Collectors.groupingBy(person -> person.name.length())
                ));
        System.out.println();

    }

    private static void SumofAllEvenNumbers() {
    }

    private static void FindAverageofArray() {
    }

    private static void CharacterFrequencyFromGivenString() {
//        take a string. convert it char array , ,make it stream then groupby and count
        String ss = "Hello Razib";

        Map<Character, Long> charCount = ss.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println();

    }

    private static void FindDuplicatesItem() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 3, 8, 9);
        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicateItem = numbers.stream().filter(e->!set.add(e)).collect(Collectors.toList());
        System.out.println("Duplicate Item: ");

        
    }


    private static void TM_findAny(List<String> names) {
        System.out.println("10.TM_findAny");
        boolean answer = names.stream().anyMatch(n
                -> (n.length()>1));
    }
    private static void TM_findFirst(List<String> names) {
        System.out.println("9.TM_findFirst");
        String firstName = names.stream().findFirst().orElse("No Name");
        System.out.println(firstName); // Output: Alice
    }
    private static void TM_NoneMatch(List<String> names) {
        System.out.println("8.TM_NoneMatch");
        boolean noNameWithZ = names.stream().noneMatch(name -> name.contains("Z"));
        System.out.println(noNameWithZ); // Output: true if no element doesn't match
    }
    private static void TM_AllMatch(List<String> names) {
        System.out.println("7.TM_AllMatch");
        boolean allStartWithA = names.stream().allMatch(name -> name.startsWith("A"));
        System.out.println(allStartWithA); // Output: false
    }
    private static void TM_AnyMatch(List<String> names) {
        System.out.println("6.TM_AnyMatch");
        boolean contains =  names.stream().anyMatch(str->str.length()>2);
    }
    private static void TM_Max(List<Integer> numbers) {
        System.out.println("5.TM_Max");
        Integer newNumber = numbers.stream().max(Integer::compareTo).orElse(-1);
        System.out.println(newNumber);
    }
    private static void TM_Min(List<Integer> numbers) {
        System.out.println("4.TM_Min");
        Integer min = numbers.stream().min(Integer::compareTo).orElse(-1); /* handling empty stream by orElse(-1) */
        System.out.println(min);
    }
    private static void TM_Count(List<String> names) {
        System.out.println("3.TM_Count");
        long count = names.stream().count();
    }

    private static void TM_Reduce(List<Integer> numbers, List<String> names) {
        System.out.println("2.TM_Reduce");
//        stream er upor agrregation operation chaliye single output dei. .reduce() Identity value hishebe
//        ekta parameter nei and its mandatory for handling starting point,empty stream, parallel stream
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum); // Output: 0+ arraysum
//
//        int sum = numbers.stream().reduce(10, Integer::sum);
//        System.out.println(sum); // Output: 10+ arraysum
    }

    private static void TM_Collection(List<String> names) {
        System.out.println("1.TM_Collection");
        List<String> newNumber = names.stream().map(String::toUpperCase).collect(Collectors.toList());
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

    private static void SolveProblem1(){
// Problem1
// Given a list of employee names with some duplicates, filter out names that are shorter than 4 characters,
// convert all names to uppercase, sort them in descending order, remove duplicates, skip the first two names,
// and limit the result to 3 names.

        List<String> empName = Arrays.asList("Razib","Sakib","Bob","Sakib","Niloy", "To","Hasnat","Esmay");

        List<String> result = empName.stream().filter(name->name.length()>4).map(String::toUpperCase).sorted(Comparator.reverseOrder()).distinct()
                .skip(2)
                .limit(2)
                .collect(Collectors.toList())
                ;

        System.out.println(result);

    }

    class person{
        String name;
        String city;
        person(String name, String city) {
            this.name = name;
            this.city = city;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}


