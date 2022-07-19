public class gcd {

    //Нахождение НОД с помощью алгоритма Евклида:
    private void run(long firstNumber, long secondNumber) {
        while (true) {
            if (firstNumber == 0 || secondNumber == 0) {
                System.out.println(Math.max(firstNumber, secondNumber));
                break;
            } else {
                if (firstNumber > secondNumber) firstNumber %= secondNumber;
                else secondNumber %= firstNumber;
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new gcd().run(0, 1); //запуск вычисления НОД
        long finishTime = System.currentTimeMillis();
        System.out.println("\ntime: " + (finishTime - startTime) + " ms"); //затраченное на выполнение время.
    }
}
