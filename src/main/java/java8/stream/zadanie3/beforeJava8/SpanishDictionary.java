package java8.stream.zadanie3.beforeJava8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SpanishDictionary
{
    private Map<String, String> dictionary = new TreeMap<>();

    {
        addTranslation("amigo", "friend");
        addTranslation("hombre", "man");
        addTranslation("siempre", "always");
    }


    public String translate(String spanishWord)
    {
        return dictionary.get(spanishWord);
    }

    private void addTranslation(String spanishWord, String englishWord)
    {
        dictionary.put(spanishWord, englishWord);
    }

}
