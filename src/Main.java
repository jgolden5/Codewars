public class Main {
    public static void main(String[] args) {
        System.out.println(BitCounting.countBits(0) == 0 ? "✅" : "❌");
        System.out.println(BitCounting.countBits(1) == 1 ? "✅" : "❌");
        System.out.println(BitCounting.countBits(2) == 1 ? "✅" : "❌");
        System.out.println(BitCounting.countBits(3) == 2 ? "✅" : "❌");
        System.out.println(BitCounting.countBits(4) == 1 ? "✅" : "❌");
        System.out.println(BitCounting.countBits(5) == 2 ? "✅" : "❌");
        System.out.println(BitCounting.countBits(6) == 2 ? "✅" : "❌");
        System.out.println(BitCounting.countBits(7) == 3 ? "✅" : "❌");
        System.out.println(BitCounting.countBits(8) == 1 ? "✅" : "❌");
        System.out.println(BitCounting.countBits(15) == 4 ? "✅" : "❌");
    }
}

