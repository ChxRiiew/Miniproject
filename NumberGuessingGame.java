import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxNumber = 0;

        // ���͡�дѺ�����ҡ
        System.out.println("�����!!����µ���Ţ!");
        System.out.println("���͡�����ҡ�����:");
        System.out.println("1. ���� (1-50)");
        System.out.println("2. �ҹ��ҧ (1-100)");
        System.out.println("3. �ҡ (1-500)");
        System.out.print("��س����͡�����ҡ (1-3): ");

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
                System.out.println("�س���͡�������١��ͧ! �к������дѺ: �ҹ��ҧ (1-100)");
                maxNumber = 100;
        }

        // �����Ţ����дѺ�����ҡ
        int randomNumber = random.nextInt(maxNumber) + 1;
        int guess;
        int attempts = 0;

        System.out.println("�к�����������Ţ�����ҧ 1 �֧ " + maxNumber + " ����");
        System.out.println("����������!");

        do {
            System.out.print("��͡����Ţ���س�Դ�����: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("�ҡ�! �ͧ�����ա��.");
            } else if (guess < randomNumber) {
                System.out.println("�����! �ͧ�����ա��.");
            } else {
                System.out.println("Bravo!! ����Ţ���١��ͧ��� " + randomNumber);
                System.out.println("�س��͡����Ţ价����� " + attempts + " ����.");
            }

        } while (guess != randomNumber);

        scanner.close();
    }
}
