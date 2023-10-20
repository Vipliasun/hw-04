public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 1;
        int d = 8;
        int sum1 = a + b;
        int sum2 = d + c;
        System.out.println("sum1 > sum2 - " + (sum1 > sum2));
        System.out.println("sum1 + 1 = " + (++sum1));
        System.out.println("sum2 + 2 = " + (sum2+=2));
        String result = sum1 > sum2 ? "true" : "false";
        System.out.println("sum1 > sum2 " + result);
        int e = sum1 % 2;
        int f = sum2 % 2;
        System.out.println((e==0)||(f==0));
    }
}