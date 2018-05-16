package java8.stream.zadanie1;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class AliceInTheWonderland {
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

        listOfWords.removeIf(word -> word.contains("-")); // we don't care for compound words like wide-shouldered
        listOfWords.replaceAll(n -> n.replaceAll("[‘,”;:!.\"'“’]", "")); // we want to get rid of all kinds of punctuation marks

        //TODO: 1. What are the 20 longest words?   2. If you succeed, find 20 UNIQUE longest words     3. How many UNIQUE words does this book consist of?

    }
}

