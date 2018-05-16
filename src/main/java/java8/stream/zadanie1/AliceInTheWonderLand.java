package java8.stream.zadanie1;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("alice.txt");
        List<String> listOfWords = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
                listOfWords.add(scanner.next());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 1. jakie jest 20 unikalnych najdłuższych słów?
        // 2. ile jest unikalnych słów?

        listOfWords.removeIf(word -> word.contains("-")); // we don't care for compound words like wide-shouldered
        listOfWords.replaceAll(n -> n.replaceAll("[‘,”;:!.\"'“’]", "")); // we want to get rid of all kinds of punctuation marks

        listOfWords.stream().sorted((x, y) -> y.length() - x.length()).limit(20).forEach(System.out::println);
        System.out.println(listOfWords.stream().distinct().count());
    }
}

