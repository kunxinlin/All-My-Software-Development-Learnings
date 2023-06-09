public class JavaMathExample {
    public static void main(String[] args) {
        System.out.println("Absolute value, power, square root");
        System.out.println(Math.abs(-100.00));;  //absolute value of a number
        System.out.println(Math.pow(2, 3));; //base, exponent ->8
        System.out.println(Math.sqrt(25));

        System.out.println("\nLogarithmic");
        //Math.log is natural log, base e
        System.out.println(Math.log10(100)); //base 10, ->2
        //logb(n) = loge(n) / loge(b) log identity n is the number and b is the base
        System.out.println(Math.log(8) / Math.log(2)); //  -> 3

        System.out.println("\nFloor, Ceiling, Rounding");
        System.out.println(Math.floor(45.6)); //return the closest integer value that is less than or equal to the passed argument -> 45
        System.out.println(Math.ceil(45.2));
        System.out.println(Math.round(45.49)); //->45
        System.out.println(Math.round(45.5)); //->46

        System.out.println("\nMax, min");
        System.out.println(Math.max(45, 66));
        System.out.println(Math.max(45, -66));
        System.out.println(Math.min(45, 66));

        System.out.println("\nHypotenuse");
        System.out.println(Math.hypot(3, 4)); //hypotenuse




    }
}
