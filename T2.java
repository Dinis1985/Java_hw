//Вывести все простые числа от 1 до 1000

public class T2 {
    public static void main(String[] args) {
        int number = 1;
        int count = 0;

        for (int j = 0; j < 1000; j++) {
            number++;
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    count++;
            }
            if (count < 2)
                System.out.printf("%d ", number);
            count = 0;
        }
    }

}