
public class Calculator {
    //zad1
    public static int add_numbers(int a, int b) {
            return a+b;
    }

//zad2
public static boolean is_even(int n) {
    return n % 2 == 0;
}

//zad3
public static double celsius_to_fahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
}

//zad4
public static long factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Silnia z liczby ujemnej nie istnieje");
    }
    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

//zad5
public static boolean is_prime(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
}