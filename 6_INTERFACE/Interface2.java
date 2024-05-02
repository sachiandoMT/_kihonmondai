interface Face2 {
    // 口を表すメソッド
    public String mouth();
   
    // 目を表すメソッド
    public int eye(int number);
   
    // 鼻を表すメソッド
    public void nose();
}
 
// Face インターフェースを実装した Human クラス
class Human implements Face2 {
    // 口を表すメソッドの実装
    public String mouth() {
        return "Human: mouth() メソッドが呼ばれました";
    }
   
    // 目を表すメソッドの実装
    public int eye(int number) {
        return number * 2; // 引数の値を2倍して返す
    }
   
    // 鼻を表すメソッドの実装
    public void nose() {
        System.out.println("Human: nose() メソッドが呼ばれました");
    }
}
 
// メインクラス
public class Interface2 {
    public static void main(String[] args) {
        // Human クラスのインスタンスを生成
        Human human = new Human();
       
        // 口を表すメソッドを呼び出し
        System.out.println(human.mouth());
       
        // 目を表すメソッドを呼び出し
        int result = human.eye(3); // 引数に3を渡す
        System.out.println("Human: eye() メソッドが呼ばれました。結果は " + result + " です");
       
        // 鼻を表すメソッドを呼び出し
        human.nose();
    }
}