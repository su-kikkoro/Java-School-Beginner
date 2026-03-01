import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("何段>");
        int inputNum = sc.nextInt();

        // 1〜5の範囲外が入力された場合の処理
        if (inputNum < 1 || inputNum > 5) {
            System.out.println("1 ~ 5 までの整数を入力してください");
            return;
        }

        // 入力された段数分、階段を1行ずつ作る処理
        for (int i = 1; i <= inputNum; i++) {

            // 右寄せにするためにスペースを入れる
            for (int j = 1; j <= inputNum - i; j++) {
                System.out.print(" ");
            }

            // 今の段数に応じた＊を出力
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
