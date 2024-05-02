class Employee {
    private String name;
 
    // 引数無しのコンストラクタ
    public Employee() {
        this.name = "匿名希望";
    }
 
    // 文字列を引数にもつコンストラクタ
    public Employee(String name) {
        // 文字列が11文字以上の場合は10文字までに切り捨てる
        if (name.length() > 10) {
            this.name = new StringBuilder(name.substring(0, 10)).toString();
        } else {
            this.name = name;
        }
    }
    // 名前を出力するメソッド
    public void printName() {
        System.out.println("私はシアトルコンサルティングの社員です。名前は" + this.name + "です。");
    }
}
public class Kinou2 {
    public static void main(String[] args) {
        // 引数無しのコンストラクタを使用してインスタンス化
        Employee employee1 = new Employee();
        // 名前を出力するメソッドを呼び出す
        employee1.printName();
 
        // 文字列を引数にもつコンストラクタを使用してインスタンス化
        Employee employee2 = new Employee("Pepper");
        // 名前を出力するメソッドを呼び出す
        employee2.printName();
    }
}