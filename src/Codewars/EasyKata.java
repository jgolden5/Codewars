package Codewars;

public class EasyKata {

    public static long findNb(long m) {
        double s = Math.sqrt(m);
        if(s == Math.floor(s)) {
            return (long)s;
        } else {
            return -1;
        }
    }

}
