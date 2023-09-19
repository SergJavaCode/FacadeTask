public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Операнд а=1010, операнд б=110");
        System.out.println("Результат сложения операндов в двоичной системе исчисления: " + bins.sum("1010", "110"));
        System.out.println("Результат сложения операндов в десятичной системе исчисления: " + Integer.parseInt(bins.sum("1010", "110"), 2));
        System.out.println("Результат умножения операндов в двоичной системе исчисления: " + bins.mult("1010", "110"));
        System.out.println("Результат умножения операндов в десятичной системе исчисления: " + Integer.parseInt(bins.mult("1010", "110"), 2));
    }
}