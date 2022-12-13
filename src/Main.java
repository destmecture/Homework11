import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");

        Scanner innerYear = new Scanner(System.in);
        System.out.println("Введите год");
        int year = innerYear.nextInt();

        checkYear(year);

        System.out.println("Task 2");

        Scanner osVersion = new Scanner(System.in);
        System.out.println("Введите версию вашей ОС: 1 - Android, 0 - IOS ");
        int clientOs = osVersion.nextInt();

        Scanner yearVersion = new Scanner(System.in);
        System.out.println("Введите год производства телефона ");
        int clientDeviceYear = yearVersion.nextInt();

        checkUpdate(clientOs, clientDeviceYear);

        System.out.println("Task 3");

        Scanner dis = new Scanner(System.in);
        System.out.println("Введите расстояние до адреса для расчета дней доставки");
        int deliveryDistance = dis.nextInt();

        getDeliveryInfo(deliveryDistance);

    }
    private static void checkYear(int yearNumber){
        if((yearNumber%4==0&&yearNumber%100!=0)||yearNumber%400==0){
            System.out.println(yearNumber+" - високосный год");
        }else{
            System.out.println(yearNumber+" - не високосный год");
        }
    }

    private static void checkUpdate(int os, int year){
        if(os==0){
            if(year>=2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (os==1){
            if(year>=2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            }else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }else{
            System.out.println("Невозможно определение версии и/или года производства, " +
                    "проверьте введенные данные или обратитесь в службу технической поддержки");
        }
    }

    public static void getDeliveryInfo (int deliveryDistance) {
        int deliveryDays = 1+(deliveryDistance+20)/40;
        System.out.println("Потребуется дней: " + deliveryDays);
    }


}