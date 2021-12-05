package example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public String inString = "aaaaddwwwcrrryu";

    boolean testPassword(String pass) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(pass);
        return matcher.matches();
    }

    void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    String countSomeLetter(String in) {
        if (in == null || in.length() == 0) return "";
        StringBuffer sb = new StringBuffer();
        int counter = 0;
        Character[] split = ArrayUtils.toObject(in.toCharArray());
        Character prev = null;
        for (int i = 0; i <= split.length - 1; i++) {
            Character current = split[i];
            if (prev == null) {
                counter++;
                prev = current;
                continue;
            }
            if (prev == current) {
                counter++;
                continue;
            } else {
                sb.append(prev);
                sb.append(counter);
                prev = current;
                counter = 1;
            }
        }
        sb.append(prev);
        sb.append(counter);

//        sb.append(split[0]);
        return sb.toString();
    }

    public static void main(String[] args) {
    }

}
