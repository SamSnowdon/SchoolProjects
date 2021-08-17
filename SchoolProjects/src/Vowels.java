
public class Vowels
{
    public static void main(String[] args) {
        Vowels.CountVowels("String with some vowels");
    }
    
    public static void CountVowels(String s) {
        int vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i, i+1);
            if (temp.equalsIgnoreCase("a")) {
                vowels++;
            }
            if (temp.equalsIgnoreCase("e")) {
                vowels++;
            }
            if (temp.equalsIgnoreCase("i")) {
                vowels++;
            }
            if (temp.equalsIgnoreCase("o")) {
                vowels++;
            }
            if (temp.equalsIgnoreCase("u")) {
                vowels++;
            }
            if (temp.equalsIgnoreCase("y")) {
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
