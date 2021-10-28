import java.util.Vector;

public class Dictionary {
    Vector word = new Vector(10, 10);

    public void addWord(String target, String explain) {
        Word newWord = new Word(target, explain);
        word.addElement(newWord);
    }
}
