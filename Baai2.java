public class Baai2 {
    public static void main(String[] args) {
        /*if (args.length == 0) {
            System.out.println("整数値を実行時引数として指定してください。");
            return;
        }*/

        int value = Integer.parseInt(args[0]);
        //[]が0だと1番初めの配列を指定していますよ
        //[]が1だと2番目配列を指定していますよ

        switch (value) {
            case 1:
                System.out.println("もっとがんばりましょう");
                break;
            case 2:
                System.out.println("もう少し頑張りましょう");
                break;
            case 3:
                System.out.println("さらに上を目指しましょう");
                break;
            case 4:
                System.out.println("大変よくできました");
                break;
            case 5:
                System.out.println("大変優秀です");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("あきらめたらそこで試合終了ですよ");
                break;
            default:
                System.out.println("1から10の整数値を指定してください。");
        }
    }
}