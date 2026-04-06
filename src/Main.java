//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }
        System.out.println("Задание 2");
        short clientDeviceYear = 2010;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегчённую версию для IOS по ссылке ...");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке ...");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 3");
        short year = 2021;
        if (year > 1584) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " високосный");
                    } else {
                        System.out.println(year + " не високосный");
                    }
                } else {
                    System.out.println(year + " високосный");
                }
            } else {
                System.out.println(year + " не високосный.");
            }
        } else {
            System.out.println("Год должен быть больше 1584");
        }


        System.out.println("Задание 4");
        long deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней 1");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней 2");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        System.out.println("Задание 5");
        byte monthNumber = 12;
        if (monthNumber > 12) {
            System.out.println("Ошибка: некорректный номер месяца");
        }
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний");
                break;
        }
    }
}
