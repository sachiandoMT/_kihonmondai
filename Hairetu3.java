import java.util.ArrayList;

public class Hairetu3 {
    public static void main(String[] args) {
        // ArrayListにチーム24の名前を追加
        ArrayList<String> team21 = new ArrayList<>();
        team21.add("内定者1");
        team21.add("内定者2");
        team21.add("内定者3");
        team21.add("内定者4");
        // 必要に応じて名前を追加

        // 名前を出力
        System.out.println("チーム24のメンバーを紹介します。");
        for (String member : team21) {
            System.out.println(member);
        }

        // 人数を出力
        System.out.println("以上" + team21.size() + "名。よろしくお願い致します。");
    }
}