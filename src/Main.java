public class Main {
    public static void main(String[] args) {

//        String mr1 = "abcX"; //main road 1
//        String[] ss1 = new String[]{"AA", "", "BBB"}; //side street 1
//        String t1 = TrafficJam.trafficJam(mr1, ss1); //traffic 1
//        Boolean t1IsCorrect = t1.equals("aAbAcBX");
//
        String mr2 = "abcdefghijklmX";
        String[] ss2 = new String[]{"","","","BBBBBB","","","","","CCCCC"};
        String t2 = TrafficJam.trafficJam(mr2, ss2);
        Boolean t2IsCorrect = t2.equals("abcdBeBfBgBhBiBCjCkClCmCX");

//        if (t1IsCorrect) {
//            System.out.println("Answer is correct! ✅");
//        } else {
//            System.out.println("Answer is incorrect! ❌ Instead got: " + t1);
//        }

        if (t2IsCorrect) {
            System.out.println("Answer is correct! ✅");
        } else {
            System.out.println("Answer is incorrect! ❌ Instead got: " + t2);
        }

//        if (t3IsCorrect) {
//            System.out.println("Answer is correct! ✅");
//        } else {
//            System.out.println("Answer is incorrect! ❌ Instead got: " + a3);
//        }
//        if (t4IsCorrect) {
//            System.out.println("Answer is correct! ✅");
//        } else {
//            System.out.println("Answer is incorrect! ❌ Instead got: " + a4);
//        }
//        if (t5IsCorrect) {
//            System.out.println("Answer is correct! ✅");
//        } else {
//            System.out.println("Answer is incorrect! ❌ Instead got: " + a5);
//        }
    }
}