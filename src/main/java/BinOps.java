public class BinOps {

    public String sum(String firstValue, String secondValue) {
        int sumValue = Integer.parseInt(firstValue, 2) +
                Integer.parseInt(secondValue, 2);

        return Integer.toBinaryString(sumValue);
    }

    public String mult(String firstValue, String secondValue) {
        int multValue = Integer.parseInt(firstValue, 2) +
                Integer.parseInt(secondValue, 2);

        return Integer.toBinaryString(multValue);
    }
}
