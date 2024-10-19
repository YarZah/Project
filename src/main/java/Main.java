public class Main {
    public static void main(String[] args) {
        int[] number = {20, 75, 40, 100, 80};
        for (int i =0; i < number.length; i++) {
            if (number[i] == 75) {
                continue;
            }
            if (number[i] == 100) {
                continue;
            }

            System.out.println(number[i]);
        }
    }
}
