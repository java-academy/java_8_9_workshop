package java8.stream.zadanie3.beforeJava8;

public class Main
{
    private static String capitalize(String string)
    {
        return string.substring(0, 1).toUpperCase() + string.substring(1, string.length());
    }

    public static void main(String[] args)
    {
        SpanishDictionary dict = new SpanishDictionary();

        System.out.println(capitalize(dict.translate("amigo")) + " is somebody I trust.");
        System.out.println(capitalize(dict.translate("siempre")) + " look on the bright side of life.");
//        System.out.println(capitalize(dict.translate("девушка")) + " on the train"); // oops, NPE

        if(dict.translate("девушка") != null)
        {
            System.out.println(capitalize(dict.translate("девушка")) + " on the train");
        }
        else
        {
            System.out.println("Ekhm, there's no such a word in the spanish language");
        }
    }
}
