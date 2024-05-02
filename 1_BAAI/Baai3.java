public class Baai3 {
    public class Question3 {
            public static void main(String[] args) {
               
                String s1 = "SeattleConsulting";
                String s2 = "SeattleConsulting";
                String s3 = "Seattle";                      
                String s4 = new String("SeattleConsulting");
                s3 = s3 + "Consulting";
               
                if(s1 == s2) {
                    System.out.println("s1とs2は等しいです。(==比較)");
                }
                if(s1 == s3) {
                    System.out.println("s1とs3は等しいです。(==比較)");
                }
                if(s1 == s4) {
                    System.out.println("s1とs4は等しいです。(==比較)");
                }
                if(s1.equals(s2)) {
                    System.out.println("s1とs2は等しいです。(.equals比較)");
                }
                if(s1.equals(s3)) {
                    System.out.println("s1とs3は等しいです。(.equals比較)");
                }
                if(s1.equals(s4)) {
                    System.out.println("s1とs4は等しいです。(.equals比較)");
                }
            }
        }
}
 
/**
 * 回答
* 1,同じ文字列であり、同様のオブジェクトを参照しているため。
* Javaでは、共通する文字列が書かれた際、同一のインスタンス共有する。
* そのため、両者のオブジェクトは等しくなり演算子＝＝ではTRUE。
* equal()では文字列の内容を比較しておりこちらもTRUEである。
 
* 2,equal()では文字列の内容を比較しているためTRUEである。
* しかしs3は文字列の結合である。そのため、参照しているオブジェクトが異なる。
* よって演算子＝＝ではFALSEとなる。
 
* 3,equal()では文字列の内容を比較しているためTRUEである。
* しかし、s4はnew String()で新しいオブジェクトを生成している。
* 結果、s1とs4は異なるオブジェクトを参照していることになり、演算子＝＝ではFALSEとなる。
 
*/