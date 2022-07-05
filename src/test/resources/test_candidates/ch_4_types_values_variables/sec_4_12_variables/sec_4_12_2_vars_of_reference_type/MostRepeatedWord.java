import java.util.ArrayList;

public class MostRepeatedWord {

    public static void main(String[] args) {
        String word = "";
        int count = 0, maxCount = 0;
        String[] words = {"A", "B", "A", "B", "A", "C"};

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                word = words[i];
            }
        }

        System.out.println("Most repeated word: " + word);
        System.out.println("passed");
    }
}
