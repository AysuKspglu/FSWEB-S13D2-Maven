package org.example;

public class Main {

    public static void main(String[] args) {
        // İstersen kapatabilirsin; testler için gerekli değil.
        System.out.println(numberToWords(507));   // "Five Zero Seven"
        System.out.println(numberToWords(0));     // "Zero"
        System.out.println(numberToWords(-3));    // "Invalid Value"
    }

    // ---- D1/D2 görevlerinde sık kullanılan metodlar ----

    // Negatifleri de destekler; rakam dizisi palindrom mu?
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        StringBuilder rev = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) rev.append(digits[i]);
        return rev.toString().equals(String.valueOf(number));
    }

    // Mükemmel sayı kontrolü (kendisi hariç bölenler toplamı = sayının kendisi)
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // Sayıyı kelimelere çevirir
    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        if (number == 0) return "Zero";

        StringBuilder out = new StringBuilder();
        for (char d : String.valueOf(number).toCharArray()) {
            switch (d) {
                case '0': out.append("Zero ");  break;
                case '1': out.append("One ");   break;
                case '2': out.append("Two ");   break;
                case '3': out.append("Three "); break;
                case '4': out.append("Four ");  break;
                case '5': out.append("Five ");  break;
                case '6': out.append("Six ");   break;
                case '7': out.append("Seven "); break;
                case '8': out.append("Eight "); break;
                case '9': out.append("Nine ");  break;
            }
        }
        return out.toString().trim();
    }
}
