public class Reigai1 {

    public static void main(String args[]) {
        try {
            if (args.length != 2) {
                System.out.println("引数は2つ設定してください");
                return;
            }

            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            //  文字列から整数値に変換（0は1つ目の、1は2つ目の数字）

            if (j == 0) {
                throw new DivideByZeroException();
            }

            System.out.println("正常");
            System.out.println(i / j);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください");
        } catch (DivideByZeroException e) {
            System.out.println("予期しない例外が発生しました");
        } catch (Exception e) {
            System.out.println("予期しない例外が発生しました");
        } finally {
            System.out.println("終了");
        }
    }

    // ゼロで割る例外クラス
    static class DivideByZeroException extends Exception {
        DivideByZeroException() {
            super();
        }
    }
}