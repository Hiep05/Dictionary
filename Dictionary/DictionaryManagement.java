import java.util.Scanner;

public class DictionaryManagement {
    public Dictionary dictionary = null;

    public DictionaryManagement (Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void insertFromCommandLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the amount of word: ");
        int wordAmount = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        for (int i = 1; i <= wordAmount; i++) {
            System.out.print("Insert " + i + " target: ");
            String target = scanner.nextLine();
            System.out.print("Insert " + i + " explain: ");
            String explain = scanner.nextLine();
            dictionary.addWord(target, explain);
        }
    }
}
