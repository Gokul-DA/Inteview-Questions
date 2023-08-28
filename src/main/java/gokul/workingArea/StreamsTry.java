package gokul.workingArea;

import gokul.workingArea.model.Person;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTry {

    public static void main(String[] args) {
        //Q1: Given a list of strings, find the count of strings that have a length greater than 5.
        //
        countOfString(Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry"));

        printSumOfAllStringLength(Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry"));

        toCollections(Arrays.asList(new Person("Gokul",123), new Person("Gokul",456), new Person("Deepan",789), new Person("Harish",963)));

        sumOfAllEvenNumberThan10(Arrays.asList(5, 12, 8, 18, 20, 6));

        averageLengthOfString(Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Grape", "Kiwi"));
    }

    static void countOfString(List<String> strings) {
        long result = strings.stream().filter(a-> a.length()>5).count();
        System.out.println("Count of string greater than 5 length is : "+result);
    }

    static void printSumOfAllStringLength(List<String> strings){
        System.out.println("Sum of Length of all the string in list: "+strings.stream().mapToInt(String::length).sum());
    }

    static void toCollections(List<Person> people){
        Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
        System.out.println("converted to Set: "+ set);

        String collect = people.stream().map(Person::getName).collect(Collectors.joining(", "));
        System.out.println("Joining by ', ' ==> "+collect);

        int sum = people.stream().mapToInt(Person::getSalary).sum();
        int sum2 = people.stream().collect(Collectors.summingInt(Person::getSalary));
        System.out.println("Sum of the salaries of all person: "+sum);
    }

    static void sumOfAllEvenNumberThan10(List<Integer> integers){
        Integer collect = integers.stream().filter(a -> (a) > 10 && a % 2 == 0).collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum Of All Even Number greater Than 10: " + collect);
    }

    static void averageLengthOfString(List<String> strings){
        OptionalDouble average = strings.stream().filter(a -> a.startsWith("A") || a.startsWith("a"))
                .mapToInt(String::length)
                .average();
        System.out.println("Average length of all the string with A: "+average.getAsDouble());
    }



}
