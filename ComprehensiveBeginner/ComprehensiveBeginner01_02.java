import java.util.Random;

class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];
        // 生成された数値を10個まで保存する
        int count = 0;
        // 代入回数
        int sum = 0;
        // 合計

        for (int i = 0; i < 10; i++) {

            int value = random.nextInt(100) + 1;
            // 1~100
            numbers[i] = value;
            // 回数を記録
            sum += value;
            // 合計に足す
            count++;
            // カウントを増やす

            if (sum > 100) {
                break;
            }
        }

        System.out.println("合計値: " + sum);
        System.out.println("入力された数値: ");

        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i] + " ");
            // 実際に入れた数を表示する
        }
    }
}
