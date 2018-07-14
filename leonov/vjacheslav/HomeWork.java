package leonov.vjacheslav;

// Task 1.
public class HomeWork {

    public static void main(String[] args) {

// Task 2.
        byte b = 100;
        short s = 20000;
        int i = 89765567;
        long l = 90909032523L;
        float f = 400.5f;
        double d = 5.221322;
        char c = 'r';
        boolean bol = false;

        System.out.println(calculate(1, 2, 8, 4));
        System.out.println(task10and20(10, 10));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-10));
        greetings("Вячеслав");
        leapYear(56);
    }

// Task 3.
    public static int calculate(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

// Task 4.
    public static boolean task10and20(int x1, int x2){
        if ((x1 + x2)>= 10 && (x1 + x2)<= 20){
            return true;
        } else {
            return false;
        }
    }

// Task 5.
    public static void isPositiveOrNegative(int x){
        if(x >= 0){
            System.out.println(x + " - положительное число.");
        } else
            System.out.println(x + " - отрицательное число.");
    }

// Task 6.
    public static boolean isNegative(int x){
        if(x < 0){
            return true;
        }
        return false;
    }

// Task 7.
    public static void greetings(String name){
        System.out.println("Привет, " + name + "!");
    }

// Task 8.
    public static void leapYear(int year){
        double chek4 = year / 4;
        double chek100 = year / 100;
        double chek400 = year / 400;
        if(year == chek100 * 100 && year != chek400 * 400) {
            System.out.println(year + " - не високосный год.");
        } else if(year == chek4 * 4){
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }
}
