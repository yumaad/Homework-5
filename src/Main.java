public class Main {
    public static void main(String[] args) {
        // task #1
        int clientOS = 1;
        if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        }
        else if (clientOS == 1)
        {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        }
        else
        {
            System.out.println("Версии приложения для такой операционный системы нет\n");
        }

        // task #2
        int clientDeviceYear = 2010;
        switch (clientOS)
        {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                if (clientDeviceYear < 2015)
                {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015)
                {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Версии приложения для такой операционный системы нет");
        }

        // task #3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year >= 1584)
        {
            System.out.println("\n" + year + " год является високосным");
        }
        else if (year >= 1584)
        {
            System.out.println("\n" + year + " год не является високосным");
        }
        else
        {
            System.out.println("\n Введите, пожалуйста, другой год за 1584 годом");
        }

        // task #4
        int deliveryDistance = 95;
        int deliveryTerm = 1;
        if (deliveryDistance <= 20)
        {
            System.out.println("\nПотребуется дней: " + deliveryTerm);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60)
        {
            deliveryTerm +=1;
            System.out.println("\nПотребуется дней: " + deliveryTerm);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100)
        {
            deliveryTerm +=2;
            System.out.println("\nПотребуется дней: " + deliveryTerm);
        }
        else if (deliveryDistance > 100)
        {
            System.out.println("\nСвыше 100 км доставки нет.");
        }

        // task #5
        int monthNumber = 6;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("\nПринадлежит к сезону зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("\nПринадлежит к сезону весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("\nПринадлежит к сезону лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("\nПринадлежит к сезону зима");
                    break;
            }
        }
        else
        {
            System.out.println("\nТакого месяца нет, введите число до 12");
        }

    }
}