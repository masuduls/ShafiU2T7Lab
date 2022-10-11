import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();
        int len = str1.length();
        System.out.println("Length: " + len);

        int halfLen = len / 2;
        String half1 = str1.substring(0, halfLen);
        String half2 = str1.substring(halfLen);
        System.out.println("First half: " + half1);
        System.out.println("Second half: " + half2);

        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();
        int len2 = str2.length();
        if (len > len2) {
            System.out.println(str1 + " is longer");
        } else if (len2 > len) {
            System.out.println(str2 + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }

        if (str1.equals(str2)) {
            System.out.println("Both strings have the same characters");
        } else {
            int signVal = str1.compareTo(str2);
            if (signVal < 0) {
                System.out.println(str1 + " is first alphabetically");
            } else {
                System.out.println(str2 + " is first alphabetically");
            }
        }
        int indexStr2 = str1.indexOf(str2);
        if (indexStr2 != -1) {
            System.out.println(str2 + " is found in " + str1 + " at index " + indexStr2);
        } else {
            System.out.println(str2 + " is not found in " + str1);
        }
    }
}