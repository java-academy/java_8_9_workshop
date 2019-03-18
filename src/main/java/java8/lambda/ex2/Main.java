package ex2;

public class Main {

    public static void main(String[] args) {
        StringComparator stringComparator = new StringComparator();
        BetterString betterString1 = (s1,s2) -> {
            if(s1.length()>s2.length()){
                return s1;
            }
            return s2;
        };

        BetterString betterString2 = (s1,s2) -> {
            if(s1.length()<s2.length()){
                return s1;
            }
            return s2;
        };

        System.out.println(stringComparator.getBetterString((s1,s2)->s1,"dada","tata"));

        BetterString betterString3 = (s1,s2) -> {
            String[] firstStringWords = s1.split(" ");
            String[] secondStringWords = s2.split(" ");

            if(firstStringWords.length > secondStringWords.length){
                return s1;
            }
            return s2;
        };

        BetterString betterString4 = (s1,s2) -> {
            if(s1.charAt(0)<s2.charAt(0)){
                return s1;
            }
            return s2;
        };

        System.out.println(stringComparator.getBetterString(betterString1, "Siema", "pa"));
        System.out.println(stringComparator.getBetterString(betterString2, "Siema", "pa"));
        System.out.println(stringComparator.getBetterString(betterString3, "siema siema siema", "pa pa"));
        System.out.println(stringComparator.getBetterString(betterString4, "Abecadło", "Bartek"));

    }
}
