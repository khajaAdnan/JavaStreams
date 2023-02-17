import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // creating list
        List<Integer> list = List.of(2, 58, 6, 5, 8, 5, 58, 45, 4, 48, 59, 86, 45, 45, 91, 8);
        System.out.println(list);

        // without using streams
        for (Integer i : list){
            if(i%2==0){
                System.out.println(i);
            }
        }

        // creating array list
        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(25);
        list2.add(84);
        list2.add(2);
        list2.add(4);
        list2.add(7);
        list2.add(9);
        System.out.println(list2);


        // without using streams
        List<Integer> evenlist = new ArrayList<>();
        for(Integer k : list2){
            if (k%2==0){
                evenlist.add(k);
            }
        }
        System.out.println(evenlist);

        // Stream (filter method)
        List<Integer> evenList2 = list2.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList2);

        // Stream (filter method)
        List<Integer> oddlist = list.stream().filter(k -> k % 2 != 0).collect(Collectors.toList());
        System.out.println(oddlist);


        // creating string list
        String names [] = {"khaja" , "chaitanya" , "class" , "kite" , "chai"};
        List<String> startingWith = Arrays.stream(names).filter(e -> e.startsWith("c")).collect(Collectors.toList());
        System.out.println(startingWith);

        List<String> endingWith = Arrays.stream(names).filter(e -> e.endsWith("a")).collect(Collectors.toList());
        System.out.println(endingWith);

        // using forEach and lambda
        Stream<Integer> forEach = list2.stream();
        list2.forEach(e -> {
            System.out.println(e);
        });


        evenlist.forEach(System.out::println);

        list.stream().sorted().forEach(System.out::println);



        //count method
        long counts = list.stream().count();
        System.out.println("total count =" + counts);

        // using map method to calculate the min and max
        Integer min = list.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min of list = "+ min);

        Integer max = list.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("max of list = " + max);


    }
}