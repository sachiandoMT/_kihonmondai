import java.util.Scanner;
 
public class Kurikaesi2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int number;
        do {
            System.out.println("1～100の整数を入力してください");
            number = scanner.nextInt();
        } while (number < 1 || number > 100); // 1〜100の範囲外の値が入力された場合は再入力
 
        while (true) {
            if (number % 7 == 0) {
                System.out.println("入力された値は7の倍数です。処理を終了します。");
                break;
            } else {
                System.out.println("1～100の整数を入力してください");
                number = scanner.nextInt();
            }
        }
 
        scanner.close();
    }
}