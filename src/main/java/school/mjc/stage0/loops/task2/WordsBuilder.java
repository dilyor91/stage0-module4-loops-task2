package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int n =  chars.length;
        int i = 0;
        StringBuilder s = new StringBuilder();
        while (i < n) {
            s.append(chars[i]);
            i++;
        }
        System.out.print(s.toString());
    }
}
