import java.util.Scanner;

class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];
        // 要素3つの配列を用意

        for (int i = 0; i < array.length; i++) {
            // 配列の長さ分の入力を作る
            System.out.print((i + 1) + "番目の数字を入力してください ＞ ");
            // iは0から始まるので、表示用に＋1して、1~3番目の数字を入力する
            array[i] = sc.nextInt();
            // 入力から整数を読み取って、i番目に入れる
        }

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int doubleValue = value * 2;
            int remainderValue = value % 3;
            // 配列から値を出して計算する

            System.out.println(
                    (i + 1) + "番目の要素の値は " + value +
                            " で、2倍にすると " + doubleValue +
                            " になり、3で割ったあまりは " + remainderValue + " です");
        }
        sc.close();
    }
}