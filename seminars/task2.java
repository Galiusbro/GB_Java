import java.util.Scanner;

public class task2 {
    static int trangularNumber(int num) {
        int solve = 0;
        double check = Math.sqrt(8 * num + 1) % 1;
        if (check % 10 == 0) {
            solve = triangle(num);
        }
        else System.out.println("Число не является треугольным");
        return solve;
    }

    static int triangle(int num) {
        if (num == 1)
            return 1;
        else
            return (num + triangle(num - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.println(trangularNumber(num));
        scanner.close();
    }
}
