public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int s = 0; s <= 17; s = s + 2) {
           System.out.println(s);
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int a = 10; a >= -10; a = a - 1) {
            System.out.println(a);
        }
        //Задача 5
        System.out.println("Задача 5");
        for (int b = 1904; b <= 2096; b = b + 4) {
            System.out.println(b);
        }
        //Задача 6
        System.out.println("Задача 6");
        for (int a = 7; a <= 98; a = a + 7) {
            System.out.println(a);
        }
        //Задача 7
        System.out.println("Задача 7");
        for (int a = 1; a <= 512; a =a * 2) {
            System.out.println(a);
        }
        //Задача 8
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i ++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        //Задача 9
        System.out.println("Задача 9");
        int salaryMonth = 29000;
        int totalSalary = 0;
        for (int i = 1; i <= 12; i ++) {
            totalSalary = totalSalary + totalSalary/100;
            totalSalary = totalSalary + salaryMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSalary + " рублей");
        }
        //Задача 10
        System.out.println("Задача 10");
        int m = 2;
        int t = 0;
        for (int i = 1; i <= 10; i++) {
            t = t + m;
            System.out.println( m + " * " + i + " = " + t);
        }
    }
}
