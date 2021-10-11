Generics:

---------------------Generic Method------------------------
If we want to do same same of work then we can generics. Its type independent.Like if we want
to sort an interger array we have to write function for that. For String array we need to 
write another function but the core functionality is same that it sorting an array.For that 
we don't write different different function. By generics we just write a generics/common method
which runs for all types.
  
public static < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

<E> -> E is parameter type.Means this method can deal generics type data. Runtime a initialize kore int/string
etc. jaja nite pare.
<E,T> -> It can receive multiple parameter type.

-> Method parater E[] Generics datatypes array