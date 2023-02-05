public class Main {
    //static final int HER_AGE = 23;
    public static void main(String[] args){
        // КОНСТАНТА
        /* final int MY_AGE = 18; // Переменная final (константа) не может изменяться
        System.out.println();
        //System.out.println(args[0] + " " + args[1]);
        int x = 5, y = 6; // объявление переменной (типа переменной)
        //x = 5, y = 6; // инициализация переменной (без инициализации не работает, к переменной нельзя обратиться
        System.out.println(x + y);
        short t = 0;
        long m = 1;
        char r = 'a';
        byte b = 127;
        boolean flag = true; //  С маленькой буквой пишутся названия примитивных типов данных; С большой - обёрточные типы - классовые типы;
                            // Оберточные типы нужны для того, чтобы применять к объектам функций и методов
        String test = "89";
        System.out.println(Integer.valueOf(test) + 5);
        String s = "Moms cook cakes";
        b += 5;
        System.out.println(b);
        infoMinMax();
        operation();
        int num1 = 10, num2 = 15; // В метод sum можно передать в качестве аргументов не только конкретные числа, но и перевенные из кода
        System.out.println(sum(1,2));
        */
        logicOperation();
    }
    public static void infoMinMax(){
        System.out.println("Integer Max = " + Integer.MAX_VALUE + " " + "MIN = " + Integer.MIN_VALUE);
        System.out.println("Short Max = " + Short.MAX_VALUE + " " + "MIN = " + Short.MIN_VALUE);
        System.out.println("Byte Max = " + Byte.MAX_VALUE + " " + "MIN = " + Byte.MIN_VALUE);
        System.out.println("Long Max = " + Long.MAX_VALUE + " " + "MIN = " + Long.MIN_VALUE);
        System.out.println("Float Max = " + Float.MAX_VALUE + " " + "MIN = " + Float.MIN_VALUE);

    }

    public static int sum(int a, int b) { //объявляем метод и аргументы метода
        return a + b;
    }

    public static void operation(){
        int c = 1;
        System.out.println(5 + 2);
        System.out.println(5 - 2);
        System.out.println(5 * 2);
        System.out.println(5 / 2); // целочисленное деление
        System.out.println(5 % 2); // остаток от деления
        System.out.println(5 / 2.0); // ПОЛНОЕ ДЕЛЕНИЕ (ПРИВЕДЕНИЕ К ТИПУ DOUBLE!!!)
        System.out.println(c++); // сначала делается всё остальное, а в конце - увеличение на 1
        System.out.println(++c); // сначала выполняется прибавление 1, затем - все остальные операции
        int x = 5, y = 6;
        int k = 0;
        k = x + y++;
        System.out.println(k);
        k = ++y + x;
        System.out.println(k);
        k += 5; // k = k + 5 и т.д для всех операций
        // битовые операции:
        System.out.println(5 & 2); // И
        System.out.println(6 | 5); // ИЛИ
        System.out.println(6 ^ 5);
        System.out.println(11 << 1); // СДВИГ ВПРАВО
        System.out.println(11 << 2);
        System.out.println(11 >> 1); // СДВИГ ВЛЕВО
        System.out.println(11 >> 2);
        System.out.println("Hello" + "WORLD"); // Склейка строк

    }

    public static void logicOperation() {
        boolean a = true, b = false;
        System.out.println(a && b); // быстрая проверка И (еси первый оперант ложный, то следующий даже не проверяется); удобно при работе с массивами
        System.out.println(a & b); // полная проверка И (проверяет все условия)
        System.out.println(a || b); // быстрое ИЛИ
        System.out.println(a | b); // полное ИЛИ
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println(5 < 7);
        System.out.println(5 > 7);
        System.out.println(5 <= 7);
        System.out.println(!a); // обратная логическая функция
    }

}
