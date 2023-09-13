public class Main {
    public static void main(String[] args) {
        System.out.println("1. " + (DuplicateEncoder.encode("abcabcd").equals("))))))(") ? "✅" : "❌"));
        System.out.println("2. " + (DuplicateEncoder.encode("random matches").equals("()((()())(((((") ? "✅" : "❌"));
        System.out.println("3. " + (DuplicateEncoder.encode("AbCaBcD").equals("))))))(") ? "✅" : "❌"));
        System.out.println("4. " + (DuplicateEncoder.encode("Jonathan").equals("(())(())") ? "✅" : "❌"));
        System.out.println("5. " + (DuplicateEncoder.encode("satellite").equals("(())))())") ? "✅" : "❌"));
        System.out.println("6. " + (DuplicateEncoder.encode("        ?").equals("))))))))(") ? "✅" : "❌"));
        System.out.println("7. " + (DuplicateEncoder.encode("jjJj").equals("))))") ? "✅" : "❌"));
        System.out.println("8. " + (DuplicateEncoder.encode("golden gurr").equals(")(((((()())") ? "✅" : "❌"));
    }
}
