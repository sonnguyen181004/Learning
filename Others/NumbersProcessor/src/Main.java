
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm tính BSCNN (LCM) của hai số a và b
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // Lấy chữ số cuối cùng của n
            n /= 10;        // Loại bỏ chữ số cuối cùng của n
        }
        return sum;
    }
    // Hàm kiểm tra số nguyên tố

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Các số <= 1 không phải là số nguyên tố
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Nếu chia hết cho số nào đó, không phải số nguyên tố
            }
        }
        return true;
    }

    // Hàm liệt kê n số nguyên tố đầu tiên
    public static void printNPrimes(int n) {
        int count = 0; // Đếm số lượng số nguyên tố đã tìm thấy
        int number = 2; // Bắt đầu kiểm tra từ số 2

        // Lặp đến khi tìm đủ n số nguyên tố
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " "); // In ra số nguyên tố
                count++; // Tăng số lượng số nguyên tố đã tìm thấy
            }
            number++; // Kiểm tra số tiếp theo
        }
        System.out.println(); // Xuống dòng sau khi in đủ số nguyên tố
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;/*Số hoàn hảo là số có tổng các ước của nó (trừ chính nó) bằng chính số đó. Ví dụ: 6=1+2+3

         */
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }//Số Palindrome là số mà khi đảo ngược các chữ số vẫn giống như số ban đầu. Ví dụ: 121, 12321.

    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Số lượng số Fibonacci phải lớn hơn 0.");
        } else {
            long F0 = 0, F1 = 1;
            // In ra số Fibonacci đầu tiên
            if (n >= 1) {
                System.out.print(F0 + " ");
            }
            // In ra số Fibonacci thứ hai
            if (n >= 2) {
                System.out.print(F1 + " ");
            }
            // Tính và in ra các số Fibonacci tiếp theo
            for (int i = 3; i <= n; i++) {
                long Fn = F0 + F1;  // Fn = F(n-1) + F(n-2)
                System.out.print(Fn + " ");
                // Cập nhật lại giá trị cho F0 và F1
                F0 = F1;
                F1 = Fn;
            }
            System.out.println();  // Xuống dòng sau khi in hết
        }

    }

    /*  Vòng lặp for:

Vòng lặp bắt đầu từ giá trị i = 3 và tiếp tục cho đến khi đạt đủ số lượng Fibonacci yêu cầu (n).
Mỗi lần lặp, giá trị Fibonacci tiếp theo (Fn) được tính theo công thức 
𝐹𝑛=𝐹n-1+𝐹𝑛−2 
​
 . Sau đó, in ra giá trị này và cập nhật lại hai giá trị trước đó: F0 trở thành F1, và F1 trở thành Fn.*/
    public static boolean isPerfectSquare(int n) {//so chinh phuong
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
        /*Hàm này kiểm tra xem một số có phải là số Fibonacci hay không. Một số thuộc dãy Fibonacci nếu nó thỏa mãn điều kiện rằng 5𝑛^2+4 hoặc 5𝑛^2−4
−4 là số chính phương.*/
    }

    public static boolean isFibonacci(int number) {
        return isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên dương a và b
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        int ucln = gcd(a, b);
        int bcnn = lcm(a, b);
        System.out.println("Nhap so c");
        int c = scanner.nextInt();
        sumOfDigits(c);
    }

}
