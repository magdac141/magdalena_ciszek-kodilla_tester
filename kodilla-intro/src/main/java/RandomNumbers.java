import java.util.Random;
public class RandomNumbers {
    int tmp;
    int min = 30;
    int max = 0;
    int limit = 1;

    public RandomNumbers(int limit) {
        this.limit = limit;
    }

    public int getCountOfRandomNumber(int limit) {
        Random random = new Random();
        int result = 0;
        int suma = 0;
        this.limit = limit;
        while (suma < limit) {
            tmp = random.nextInt(31);

            if(tmp < min) {
                min = tmp;
            }
            if(tmp > max) {
                max = tmp;
            }

            suma = suma + tmp;
            result++;
        }
        return result;
    }
    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }

    public static void main(String[] args) {

        RandomNumbers result = new RandomNumbers(5000);

        int rundy = result.getCountOfRandomNumber(5000);
        int minNumber = result.getMin();
        int maxNumber = result.getMax();
        System.out.println("Ilość losowań : " + rundy + " liczba MIN : " + minNumber + " liczba MAX : " + maxNumber);
    }
}