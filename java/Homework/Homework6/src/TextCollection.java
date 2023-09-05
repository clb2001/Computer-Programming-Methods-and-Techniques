import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TextCollection {
    private void processF(Map<String, Integer> words, String line) {
        for (int i = 0; i < line.length(); i++){
            String a = "";
            while (i < line.length() && line.charAt(i) != ' '){
                a += line.charAt(i);
                i++;
            }
            
            if (a != ""){
                if (words.containsKey(a.toLowerCase())){
                    int num = words.get(a.toLowerCase());
                    words.put(a.toLowerCase(), num + 1);
                }
                else{
                    words.put(a.toLowerCase(), 1);
                }
            }
        }
    }

    private void processJ(Set<String> words, String line) {
        for (int i = 0; i < line.length(); i++){
            String a = "";
            while (i < line.length() && line.charAt(i) != ' '){
                a += line.charAt(i);
                i++;
            }
            System.out.println("result: " + a);
            if (a != ""){
                words.add(a.toLowerCase());
            }
        }
    }

    private void processJaccard(Set<String> words, String text) {
        try {
            String pathname = text;
            File filename = new File(pathname);
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            line = br.readLine();
            while (line != null) {
                if (line == ""){
                    continue;
                }
                processJ(words, line);
                line = br.readLine(); // 一次读入一行数据
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void wordFrequency(String text) {
        Map<String, Integer> words = new HashMap<String, Integer>();
        try {
            String pathname = text;
            File filename = new File(pathname);
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            line = br.readLine();
            while (line != null) {
                if (line == ""){
                    continue;
                }
                processF(words, line);
                line = br.readLine(); // 一次读入一行数据
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // test
        for (Map.Entry<String, Integer> entry : words.entrySet()){
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
    }

    public double jaccardDistance(String text1, String text2) {
        Set<String> words1 = new HashSet<String>();
        Set<String> words2 = new HashSet<String>();
        processJaccard(words1, text1);
        processJaccard(words2, text1);

        // intersection
        Set<String> result1 = new HashSet<String>();
        result1.addAll(words1);
        result1.retainAll(words2);
        int intersection = result1.size();

        // union
        Set<String> result2 = new HashSet<String>();
        result2.addAll(words1);
        result2.removeAll(words2);
        int union = result2.size();

        double J = 1 - (double)(intersection / union);
        return J;
    }

    public static void main(String[] args) {
        // java TextCollection.java text1.txt text2.txt
        TextCollection A = new TextCollection();
        A.wordFrequency(args[0]);
        A.jaccardDistance(args[0], args[1]);
    }
}