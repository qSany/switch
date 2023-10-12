public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        int androidClientDeviceYear = 2018;
        int clientDeviceYear = 2018;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Загрузите и установите приложение на ваше устройство iOS");
        }
        if (androidClientDeviceYear < 2015) {
            System.out.println("Скачайте и установите облегченную версию приложения для Android");
        } else {
            System.out.println("Скачайте и установите приложение на ваш телефон Android");
        }

        System.out.println("Задача 3");


        int year = 2021;
        if (year >= 1584 && year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Недействительный год. Год должен быть больше 1584");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int days = 0;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставка недоступна на расстояния более 100 км");
        }

        System.out.println("Потребуется дней " + days + " срок доставки.");
    }
        System.out.println("Задача 5");

    int monthNumber = 12; // Поменяйте значение на 12, чтобы увидеть результат
        switch(monthNumber)

    {
        case 1:
        case 2:
        case 11:
        case 12:
            System.out.println(monthNumber + " принадлежит к сезону Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println(monthNumber + " принадлежит к сезону Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println(monthNumber + " принадлежит к сезону Лето");
            break;

        System.out.println(monthNumber + " принадлежит к сезону Осень");
        break;
        default:
            System.out.println(monthNumber + " не принадлежит ни к одному из сезонов");
            break;


    }
}
