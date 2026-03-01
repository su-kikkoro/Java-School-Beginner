import java.util.Random;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {

        Random random = new Random();

        int man = random.nextInt(3) + 1;
        int woman = random.nextInt(3) + 1;
        int child = random.nextInt(3) + 1;

        if ((man == woman && man == child) || (man != woman && woman != child && man != child)) {
            System.out.println("あいこです");

        } else {

            // 【ネスト】どの2人が同じかで分岐する
            if (man == woman) {
                // man と woman が同じ手、child が違う手
                if (isWin(man, child)) {
                    System.out.println("man と woman が勝ちました");
                } else {
                    System.out.println("child が勝ちました");
                }

            } else if (man == child) {
                // man と child が同じ手、woman が違う手
                if (isWin(man, woman)) {
                    System.out.println("man と child が勝ちました");
                } else {
                    System.out.println("woman が勝ちました");
                }

            } else {
                // woman と child が同じ手、man が違う手
                if (isWin(woman, man)) {
                    System.out.println("woman と child が勝ちました");
                } else {
                    System.out.println("man が勝ちました");
                }
            }
        }
    }

    // a が b に勝つなら true
    // 3 は 2 に強い、2 は 1 に強い、1 は 3 に強い
    static boolean isWin(int a, int b) {
        return (a == 3 && b == 2) || (a == 2 && b == 1) || (a == 1 && b == 3);
    }
}