package num_guess;
import java.util.Scanner;

public class num_guesser {
    public static void main(String[] args) {
        final int ANSWER = 10 + (int)(Math.random() * 90); // 10〜99の乱数
        final int MAX_TRIES = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("数あてゲーム開始（2桁の正の整数を当ててください）");

        for (int i = 1; i <= MAX_TRIES; i++) {
            System.out.print(i + "回目の入力: ");
            int guess = scanner.nextInt();

            if (guess == ANSWER) {
                System.out.println("当たり！");
                scanner.close();
                return;
            } else {
                int diff = Math.abs(guess - ANSWER);
                if (diff >= 20) {
                    System.out.println("20以上差があります。");
                }
                if (guess < ANSWER) {
                    System.out.println("設定された数より小さいです。");
                } else {
                    System.out.println("設定された数より大きいです。");
                }
            }
        }
        System.out.println("残念！正解は " + ANSWER + " でした。");
        scanner.close();
    }
}