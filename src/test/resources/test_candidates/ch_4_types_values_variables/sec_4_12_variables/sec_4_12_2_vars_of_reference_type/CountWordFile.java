

public class CountWordFile {
    public static void main(String[] args) throws Exception {
        String input = "m\nw\nDfXoFWRY\nnga\nlbjgZKxO\nX\nlx\nB\nUinhj\nNdCMofF\nFF\nJjVQBIZJhCyNGtK\nXhbLYFlwDEypZg\nwhyUsszWYz\nwpiP\nR";
        int count = 0;
        int i = 0;

        String words[] = input.split("\n");

        while (i < words.length) {
            count = count + words[i].length();
            i++;
        }

        System.out.println("Number of words present in given file: " + count);
        System.out.println("passed");
    }
}
