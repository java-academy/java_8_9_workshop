package java8.stream.zadanie3.sinceJava8;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class SpanishDictionary
{
    private Map<String, String> dictionary = new TreeMap<>();

    {
        addTranslation("amigo", "friend");
        addTranslation("hombre", "man");
        addTranslation("siempre", "always");
    }


    public Optional<String> translate(String spanishWord)
    {
        return Optional.ofNullable(dictionary.get(spanishWord));
    }

    private void addTranslation(String spanishWord, String englishWord)
    {
        dictionary.put(spanishWord, englishWord);
    }

}
