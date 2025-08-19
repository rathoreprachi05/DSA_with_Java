import java.util.ArrayList;

class Q {
    public static ArrayList<Integer> plusone(ArrayList<Integer> digits) {
        int carry = 1;
        int sum;
        for (int i = digits.size() - 1; i >= 0; i--) {
            sum = digits.get(i) + carry;
            digits.set(i, sum % 10);
            carry = sum / 10;
        }
        if (carry == 1) {
            digits.add(0, 1);
        }
        return digits;
    }

    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();
        digits.add(1);
        digits.add(2);
        digits.add(3);

        ArrayList<Integer> result = plusone(digits);

        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
