import java.io.*;
import java.util.*;

class LengthComparator implements java.util.Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int j = Integer.parseInt(reader.readLine());

        String[] array = new String[j];

        for (int i = 0; i < j; i++) {
            array[i] = reader.readLine();
        }

        Arrays.sort(array, new LengthComparator());

        for (String s : array) {
            System.out.println(s);
        }
    }
}
