public class Baai1 {
   
    public static void main(String[] args) {
        System.out.print("1~10の整数を入力してください。");
 
        int value = new java.util.Scanner(System.in).nextInt();
        if (value < 5) {
            System.out.println("5未満の整数" + value + "が入力されました。");
        } else if (value == 5) {
            System.out.println("5が入力されました。");
        } else {
            System.out.println("6以上の整数" + value + "が入力されました。");
        }
    }
}