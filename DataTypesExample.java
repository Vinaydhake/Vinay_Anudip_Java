public class DataTypesExample {
    public static void main(String[] args) {

        // boolean: 1 bit (but JVM uses 1 byte for practical reasons)
        boolean isJavaFun = true;
        System.out.println("Boolean value: " + isJavaFun);

        // char: 2 bytes (16 bits), Unicode character
        char letter = 'A';
        System.out.println("Char value: " + letter);

        // byte: 1 byte (8 bits), range: -128 to 127
        byte smallNumber = 100;
        System.out.println("Byte value: " + smallNumber);

        // short: 2 bytes (16 bits), range: -32,768 to 32,767
        short shortNumber = 32000;
        System.out.println("Short value: " + shortNumber);

        // int: 4 bytes (32 bits), range: -2^31 to 2^31-1
        int number = 100000;
        System.out.println("Int value: " + number);

        // long: 8 bytes (64 bits), range: -2^63 to 2^63-1
        long bigNumber = 10000000000L;
        System.out.println("Long value: " + bigNumber);

        // float: 4 bytes (32 bits), single-precision 32-bit IEEE 754
        float pi = 3.14f;
        System.out.println("Float value: " + pi);

        // double: 8 bytes (64 bits), double-precision 64-bit IEEE 754
        double largeDecimal = 12345.6789;
        System.out.println("Double value: " + largeDecimal);
    }
}
