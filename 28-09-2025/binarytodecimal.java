class Main {
    public static void main(String[] args) {
        String bin = "1011";
        int dec = Integer.parseInt(bin, 2);
        System.out.println("Binary " + bin + " = Decimal " + dec);

        int x = 13;
        System.out.println("Decimal " + x + " = Binary " + Integer.toBinaryString(x));
    }
}
