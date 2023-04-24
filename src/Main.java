import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        leapYearCheck(2021);
        leapYearCheck(2020);
        appVersionPrompt(0,2022);
        appVersionPrompt(1,2023);
        deliveryTimeAnnouncer(50);
        deliveryTimeAnnouncer(500);
    }

    public static void leapYearCheck (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void appVersionPrompt(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверно указаны данные");
        }
    }
    
    public static int deliveryTimeCalculator(int deliveryDistance) {
        int deliveryTime = 0;

        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        }

        return deliveryTime;
    }

    public static void deliveryTimeAnnouncer(int deliveryDistance) {
        int deliveryTime = deliveryTimeCalculator(deliveryDistance);

        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Слишком далеко");
        }

    }
}