import java.util.*;

public class DictionaryCommandline {
    
    final int noSpace = 4;
    final int targetSpace = 25;

    public void showAllWords(Dictionary dictionary) {
        
        System.out.print("No");
        for (int i = 1; i <= noSpace - 2; i++) {
            System.out.print(" ");
        }
        System.out.print("|  English");
        for (int i = 1; i <= targetSpace - 9; i++) {
            System.out.print(" ");
        }
        System.out.println("|  Vietnamese");

        for (int i = 1; i <= dictionary.word.size(); i++) {
            String no = i + "";
            String target = ((Word)dictionary.word.get(i - 1)).word_target;
            String explain = ((Word)dictionary.word.get(i - 1)).word_explain;

            System.out.print(no);
            for (int j = 1; j <= noSpace - no.length(); j++) {
                System.out.print(" ");
            }
            System.out.print("|" + target);
            for (int j = 1; j <= targetSpace - target.length(); j++) {
                System.out.print(" ");
            }
            System.out.println("|" + explain);
        }
    }
}    