public class answerchallenge {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortvalue = 20;
        int intvalue = 50;

        long longTotal = 5000L + 10L * (byteValue + shortvalue + intvalue);
        System.out.println(longTotal);

        short shortTotal = (short) ( 1000 + 10 *
                (byteValue + shortvalue + intvalue));
        System.out.println(shortTotal);

        byte byteTotal = (byte) ( 1000 + 10 *
                (byteValue + shortvalue + intvalue));
        System.out.println(byteTotal);
        ///since it is byte 1000 byte = 1 
    }
}
