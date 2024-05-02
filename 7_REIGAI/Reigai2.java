import java.io.BufferedReader;//テキストファイルを読み込むクラス（1行単位）
import java.io.FileReader;//テキストファイルを読み込むクラス（1文字単位）
import java.io.FileWriter;//テキストファイルを書き込むクラス
import java.io.IOException;//入出力処理中の例外を管理するクラス
import java.io.PrintWriter;

public class Reigai2 {

    public static void main(String[] args) {
        String inputFile = "src/main/resources/file/input/Test.csv";
        String outputFile = System.getProperty("user.dir") + "/file/output/TestOutput.txt";

        try {
            // 入力ファイルを読み込む
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            int result = 0;
            boolean isFirst = true;

            // 全ての値を四則演算して計算結果を求める
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                int operand = Integer.parseInt(values[0]);
                char operator = values[1].charAt(0);

                switch (operator) {
                    case '+':
                        result += operand;
                        break;
                    case '-':
                        result -= operand;
                        break;
                    case '*':
                        result *= operand;
                        break;
                    case '/':
                        result /= operand;
                        break;
                    default:
                        System.out.println("無効な演算子です: " + operator);
                }

                if (isFirst) {
                    isFirst = false;
                } else {
                    System.out.println(result);
                }
            }
            reader.close();

            // 出力ファイルに計算結果を書き込む
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));
            writer.println(result);
            writer.close();

            System.out.println("出力ファイルを作成しました: " + outputFile);
        } catch (IOException e) {
            System.out.println("ファイルが見つかりません: " + e.getMessage());
        }
    }
}