import java.util.HashMap;
import java.util.Scanner;

public class Task {

    /**
     * Finds the index of the first unique character int the string
     * @param s string to operate on
     * @return index of first unique character, or -1 if all are repeating
     */
    public static int findIndexOfChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.containsKey(c) ? hm.get(c)+1 : 1);
        }
        for(int i=0; i<s.length(); i++) {
            if(hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s = in.nextLine();
        System.out.println("Index of first unique char is: " + findIndexOfChar(s));
    }
}
