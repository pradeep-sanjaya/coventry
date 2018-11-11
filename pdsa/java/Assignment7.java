public class Assignment7 {
    public static void main(String[] args) {

        int a1[][] = {{1, 3, 4}, {4, 5, 6}};
        int a2[][] = {{1, 3, 4}, {4, 5, 6}};
        int sum[][] = {{1, 3, 4}, {4, 5, 6}};

        for (int i = 0; i < 2 ; i++ ) {
            for (int j = 0 ; j < 3 ; j++) {
                sum[i][j] = a1[i][j] + a2[i][j];
                System.out.print(sum[i][j] + " ");
            }

            System.out.println("");
        }

    }
}
