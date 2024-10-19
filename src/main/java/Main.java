public class Main {
    public static void main(String[] args) {
        int[] number = {20, 15, 40, 60, 80};
        for (int i =0; i < number.length; i++) {
            if (number[i] == 15) {
                continue;
            }
            if (number[i] == 60) {
                continue;
            }

            System.out.println(number[i]);
        }
    }
}
