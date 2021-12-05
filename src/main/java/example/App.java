package example;

import org.apache.commons.lang3.ArrayUtils;

public class App {
    public String inString = "aaaaddwwwcrrryu";

    void testPassword(String pass) {

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
