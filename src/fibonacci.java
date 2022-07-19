
public class fibonacci {

    private void run(int length) {
        long[] row = new long[length];
        row[0] = 0;
        row[1] = 1;

        for (int i = 2; i < length; i++) row[i] = row[i - 1] + row[i - 2];
        for (int i = 0; i < length; i++) System.out.print(row[i] + " ");

    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new fibonacci().run(1000); //запуск вычисления ряда
        long finishTime = System.currentTimeMillis();
        System.out.println("\ntime: " + (finishTime - startTime) + " ms"); //затраченное на выполнение время.
    }
}
