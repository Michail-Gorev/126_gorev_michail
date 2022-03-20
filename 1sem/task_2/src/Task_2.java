public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int max = 1;
        int i = 1;
        while (i <= num){
            if (Math.sqrt(i) == (int)(Math.sqrt(i))) max = i;
            i = i + 1;
        }
        return max;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num;
        int p;
        int i;
        i = 1;
        p = 1;
        while (i <= num) {
            p = 2*p + 6;
            i += 1;
        }
        return p;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        int ch = base;
        while (ch < num){
            ch = ch * base;
        }
        if (ch == num)
            return true;
        else
            return false;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        int ch1 = start;
        int i = 0;
        while (ch1 > end){
            if(ch1/2.0 == ch1/2 && ch1/2 > end)
                ch1 = ch1/2;
            else
                ch1 = ch1 - 1;
            i = i + 1;
        }
        return i;
    }
}