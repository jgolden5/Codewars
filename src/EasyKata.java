public class EasyKata {
    public boolean checkThreeAndTwo(char[] chars) {
        String firstChar = "";
        String secondChar = "";
        for(int i = 0; i < chars.length; i++) {
            if (firstChar == "" && !(secondChar.equals(chars[i]))) {
                firstChar.equals(chars[i]);
            }
            if(firstChar.equals(chars[i])) {

            }
        }
        return false;
    }
}
