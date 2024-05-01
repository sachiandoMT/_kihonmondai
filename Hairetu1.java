public class Hairetu1 {
    public static void main(String[] args) {
        // 点数を配列に格納
        int[] scores = {20, 30, 45, 35};
        
        // 社員の点数と過去問を解いた社員の人数を出力
        int numEmployees = scores.length;
        for (int i = 0; i < numEmployees; i++) {
            System.out.println((i + 1) + "番目の社員の点数は" + scores[i] + "です。");
        }
        {
        // 配列の要素数を取得し、社員の人数として出力
        System.out.println("過去問を解いた社員の人数は全部で" + numEmployees +"です。");
        
        }
    }
}