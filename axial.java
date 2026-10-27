public class axial{
    public static void main(String[] args) {
        int[][] l = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int a = l.length;
        int b = l[0].length;

        
        System.out.println("--- Row Sums ---");
        for (int i = 0; i < a; i++) {
            int rowSum = 0; 
            for (int j = 0; j < b; j++) {
                rowSum += l[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        
        System.out.println("\n--- Column Sums ---");
        for (int j = 0; j < b; j++) {
            int z = 0; 
            for (int i = 0; i < a; i++) {
                z += l[i][j]; 
            }
            System.out.println("Sum of column " + (j + 1) + ": " + z);
        }
    }
}

