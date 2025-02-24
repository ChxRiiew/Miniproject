import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxNumber = 0;

    
        System.out.println("¹Õè¤×Í!!à¡Á·ÒÂµÑÇàÅ¢!");
        System.out.println("àÅ×Í¡¤ÇÒÁÂÒ¡ä´éàÅÂ:");
        System.out.println("1. §èÒÂ (1-50)");
        System.out.println("2. »Ò¹¡ÅÒ§ (1-100)");
        System.out.println("3. ÂÒ¡ (1-500)");
        System.out.print("¡ÃØ³ÒàÅ×Í¡¤ÇÒÁÂÒ¡ (1-3): ");

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
                System.out.println("¤Ø³àÅ×Í¡âËÁ´äÁè¶Ù¡µéÍ§! ÃÐºº¨ÐãªéÃÐ´Ñº: »Ò¹¡ÅÒ§ (1-100)");
                maxNumber = 100;
        }

        // ÊØèÁàÅ¢µÒÁÃÐ´Ñº¤ÇÒÁÂÒ¡
        int randomNumber = random.nextInt(maxNumber) + 1;
        int guess;
        int attempts = 0;

        System.out.println("ÃÐººä´éÊØèÁµÑÇàÅ¢ÃÐËÇèÒ§ 1 ¶Ö§ " + maxNumber + " áÅéÇ");
        System.out.println("ÁÒàÃÔèÁàÅÂ!");

        do {
            System.out.print("¡ÃÍ¡µÑÇàÅ¢·Õè¤Ø³¤Ô´ÇèÒãªè: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("ÁÒ¡ä»! ÅÍ§ãËÁèÍÕ¡·Õ.");
            } else if (guess < randomNumber) {
                System.out.println("¹éÍÂä»! ÅÍ§ãËÁèÍÕ¡·Õ.");
            } else {
                System.out.println("Bravo!! µÑÇàÅ¢·Õè¶Ù¡µéÍ§¤×Í " + randomNumber);
                System.out.println("¤Ø³¡ÃÍ¡µÑÇàÅ¢ä»·Ñé§ËÁ´ " + attempts + " ¤ÃÑé§.");
            }

        } while (guess != randomNumber);

        scanner.close();
    }
}
