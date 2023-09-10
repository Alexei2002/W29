import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2020; // год для проверки
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        int currentYear = LocalDate.now().getYear();
        int deviceOS = 1; // предположим, что устройство работает на Android
        int deviceReleaseYear = 2018; // год выпуска устройства

        String appVersion = getAppVersion(deviceOS, deviceReleaseYear, currentYear);
        System.out.println("Установить пользователю: " + appVersion);

        int deliveryDistance = 95; // дистанция до клиента

        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка невозможна.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static String getAppVersion(int osType, int releaseYear, int currentYear) {
        if (releaseYear > currentYear) {
            if (osType == 0) {
                return "Облегченную версию для iOS";
            } else if (osType == 1) {
                return "Облегченную версию для Android";
            } else {
                return "Неподдерживаемая операционная система";
            }
        } else {
            if (osType == 0) {
                return "Обычную версию для iOS";
            } else if (osType == 1) {
                return "Обычную версию для Android";
            } else {
                return "Неподдерживаемая операционная система";
            }
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1; // доставка невозможна
        }
    }
}