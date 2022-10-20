public class task1 {
    static int solve(int start, int end, int com1, int com2) {
        int[] ways = new int[end + 1];
        ways[start] = 1;

        for (int index = start + com1; index <= end; index++) {

            if (index % com2 == 0) {
                ways[index] = ways[index - com1] + ways[index / com2];
            } else {
                ways[index] = ways[index - com1];
            }
        }
        System.out.println(print(ways));

        if (ways[end] != 0) {
            int index = end;
            System.out.print(index + " ");
            while (index > start) {
                if (index % com2 == 0 & ways[index / com2] > 0) {
                    index = index / com2;
                    System.out.printf("%d*%d ",index, com2);                    

                } else if (ways[index - com1] != 0) {                    
                    index = index - com1;
                    System.out.printf("%d+%d ",index, com1);
                }
            }
        }

        System.out.println();      

        return ways[end];
    }

    static String print(int[] items) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            sb.append(String.format("(%d)%d ", i, items[i]));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve(1, 29, 2, 5));

    }

}