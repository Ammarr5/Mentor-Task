import java.util.HashSet;

public class MentorTask2 {
    public static int firstMissingPositive(int[] a) {
        int n = a.length;
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hash.add(a[i]);
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!hash.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{7,8,9,11,12}));
    }
}
