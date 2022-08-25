public class Main {
    public static void bissextileYear(int year){     // К задаче 1
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }
    public static void applicationInstaller(int deviceModel, int deviceYear){   // К задаче 2
        int currentYear = 2022;
        if (deviceModel == 0){
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (deviceModel == 1){
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static int deliveryTime(int distance){    // К задаче 3
        if (distance <= 20){
            return 1;
        } else if (distance <= 60){
            return 2;
        } else if (distance <= 100) {
            return 3;
        }
        return 0;
    }
    public static void doublesFinder(String str){   // К задачам 4 и 5 повышенной сложности
        char[] arr = str.toCharArray();
        boolean b = false;
        for(int i = 0; i < arr.length; i ++){
            for(int j = i + 1; j < arr.length; j ++){
                if(arr[i] == arr[j]){
                    System.out.println("Продублирован символ " + arr[i]);
                    b = true;
                    break;
                }
            }
            if(b) {
                break;
            }
        }
        if(!b){
            System.out.println("Ни один символ не продублирован");
        }
    }
    public static void replaceNumbers(int arr[]){   // К задаче 4 повышенной сложности
        for(int i = 0; i < arr.length / 2; i ++){
            arr[i] = arr[arr.length-i-1] - arr[i];
            arr[arr.length-i-1] = arr[arr.length-i-1] - arr[i];
            arr[i] = arr[arr.length-i-1] + arr[i];
        }
    }
    // К задаче 6 повышенной сложности
    public static int[] generateRandomArray() {    // Генерирует массив с рандомными значениями
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static int sumArrayNumbers(){   // Считает сумму элементов массива
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static float averageValueArray(){
        float middleCount = sumArrayNumbers() / 30;
        return middleCount;
    }
    public static void main(String[] args) {

        // Задача 1

        System.out.println("Задача 1");
        int year = 2022;
        bissextileYear(year);
        System.out.println();

        // Задача 2

        System.out.println("Задача 2");
        int clientDeviceModel = 0;
        int clientDeviceYear = 2015;
        applicationInstaller(clientDeviceModel, clientDeviceYear);
        System.out.println();

        // Задача 3

        System.out.println("Задача 3");
        int deliveryDistance = 68;
        System.out.println("Понадобится дней: " + deliveryTime(deliveryDistance));
        System.out.println();

        // Задача 4

        System.out.println("Задача 4");
        String str = "aabccddefgghiijjkk";
        doublesFinder(str);
        System.out.println();

        // Задача 4 Повышенный уровень

        System.out.println("Задача 4 Повышенный уровень");
        int[] array = {3, 2, 1, 6, 5};
        replaceNumbers(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Задача 5 Повышенный уровень

        System.out.println("Задача 5 Повышенный уровень");
        String stroka = "aabccddefgghiijjkk";
        doublesFinder(str);
        System.out.println();

        // Задача 6 Повышенный уровень

        System.out.println("Задача 6 Повышенный уровень");
        System.out.println("Средняя сумма трат за месяц составила " + averageValueArray() + " рублей.");
        System.out.println();
    }
}