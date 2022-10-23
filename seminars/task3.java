import java.util.Stack;

public class task3 {
    private static void hanoiTower(Stack<Integer> from, Stack<Integer> help, Stack<Integer> end, int count) {
        if (count > 0){
            hanoiTower(from,end,help,count-1);
            int biggest = from.pop();
            end.push(biggest);
            hanoiTower(help,from,end,count-1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Stack<Integer> from = new Stack<>();
        Stack<Integer> middle = new Stack<>();
        Stack<Integer> end = new Stack<>();

        for (int i = n; i > 0; i--) {
            from.push(i);
        }
        System.out.println(from);
        hanoiTower(from, middle, end, n);        
        System.out.println(end);
    }
}