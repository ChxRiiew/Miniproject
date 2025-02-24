import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxNumber = 0;

        // เลือกระดับความยาก
        System.out.println("นี่คือ!!เกมทายตัวเลข!");
        System.out.println("เลือกความยากได้เลย:");
        System.out.println("1. ง่าย (1-50)");
        System.out.println("2. ปานกลาง (1-100)");
        System.out.println("3. ยาก (1-500)");
        System.out.print("กรุณาเลือกความยาก (1-3): ");

        int difficulty = scanner.nextInt();

        switch (difficulty) {
            case 1:
                maxNumber = 50;
                break;
            case 2:
                maxNumber = 100;
                break;
            case 3:
                maxNumber = 500;
                break;
            default:
                System.out.println("คุณเลือกโหมดไม่ถูกต้อง! ระบบจะใช้ระดับ: ปานกลาง (1-100)");
                maxNumber = 100;
        }

        // สุ่มเลขตามระดับความยาก
        int randomNumber = random.nextInt(maxNumber) + 1;
        int guess;
        int attempts = 0;

        System.out.println("ระบบได้สุ่มตัวเลขระหว่าง 1 ถึง " + maxNumber + " แล้ว");
        System.out.println("มาเริ่มเลย!");

        do {
            System.out.print("กรอกตัวเลขที่คุณคิดว่าใช่: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("มากไป! ลองใหม่อีกที.");
            } else if (guess < randomNumber) {
                System.out.println("น้อยไป! ลองใหม่อีกที.");
            } else {
                System.out.println("Bravo!! ตัวเลขที่ถูกต้องคือ " + randomNumber);
                System.out.println("คุณกรอกตัวเลขไปทั้งหมด " + attempts + " ครั้ง.");
            }

        } while (guess != randomNumber);

        scanner.close();
    }
}
