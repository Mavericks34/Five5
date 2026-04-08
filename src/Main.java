//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else {
            System.out.println("Ошибка ввода");
        }
        System.out.println("Задание 2");
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегчённую версию для IOS по ссылке ...");
        } else if (clientOS > 1 && clientDeviceYear < 2015) {
            System.out.println("Не корректный ввод операционной системы");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке ...");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложениядля Android по ссылке");
        } else if (clientOS > 1 && clientDeviceYear > 2015) {
            System.out.println("Не корректный ввод операционной системы");
        } else {
            System.out.println("Неизвестная ошибка");
        }


        System.out.println("Задание 3");
        short year = 2021;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else if (year < 1584) {
            System.out.println(year + " год , теоретически можно определить является ли он високосным или нет , но начало исчисления високосного года началось с 1584 года");
        } else {
            System.out.println(year + " не високосный");
                    }


        System.out.println("Задание 4");
        long deliveryDistance = 95L;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 100) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка свыше 100 км невозможна.");
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
                System.out.println(monthNumber + " месяц является зимним");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц является весенним");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц является летним");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц является осенним");
                break;
        }
    }
}



