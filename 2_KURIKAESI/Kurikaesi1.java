public class Kurikaesi1 {
 
    public static void main(String[] args) {
       
     
        // 引数を整数に変換
        int n = Integer.parseInt(args[0]);
        // 和を計算するための変数を初期化
        int total = 0;
 
        // 1からnまでの和を計算
        for (int i = 1; i <= n; i++) {
            total += i;
        }
 
        // 結果を出力
        System.out.println("1から" + n + "の和は、" + total + "です。");
    }
}