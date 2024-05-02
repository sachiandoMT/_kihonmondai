// 抽象クラスを作成。後にサブクラスで継承する。
abstract class Face {
    // 抽象メソッドの作成
    public abstract void nose();
}
 
// 抽象クラスを継承したサブクラス
class NewFace extends Face {
    // nose メソッドの実装
    @Override
    public void nose() {
        System.out.println("鼻を持つ顔です。");
    }
}
 
// メインクラス
public class Interface1 {
    public static void main(String[] args) {
        // MyFace クラスのインスタンス化
        NewFace myFace = new NewFace();
       
        // nose メソッドの呼び出し
        myFace.nose();
    }
}