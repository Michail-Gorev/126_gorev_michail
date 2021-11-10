import java.util.*;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        // Выбрать из данного списка элементы, кратные k, но не кратные n
        // и сформировать из них новый список.
        // Вернуть новый список в качестве результата
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < data.size(); i++){
            if(data.get(i) % k == 0 && data.get(i) % n != 0){
                a.add(data.get(i));
            }
        }
        return a;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        // сгенерировать и вернуть список размера size,
        // содержащий первые size элементов последовательности, описанной в
        // задаче subtask_2_for задания task_3
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; a.size() < size; i++){
            for(int j = 0; j < i && a.size() < size; j++){
                a.add(Integer.parseInt(Integer.toString(i)));
            }
        }
        return a;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите пересечение множеств s1 и s2
        s1.retainAll(s2);
        return s1;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите объединение множеств s1 и s2
        s1.addAll(s2);
        return s1;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите дополнение множества s1 до множества s2
        HashSet<Integer> dop= new HashSet<>(s1);
        dop.retainAll(s2);
        s2.removeAll(dop);
        return s2;
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно
        HashSet<Integer> s= new HashSet<>(s1);
        HashSet<Integer> S1 = new HashSet<>(s1);
        HashSet<Integer> S2= new HashSet<>(s2);

        s.retainAll(s2);
        S1.removeAll(s);
        S2.removeAll(s);

        HashSet<Integer> k = new HashSet<>(S1);
        k.addAll(S2);
        return k;
    }

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        HashMap<String,Double> s = new HashMap<>();
        for(String i: data){
            s.put(i, (double)Collections.frequency(data,i)*100/data.size());
        }
        return s;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        HashMap<String, Double> s = new HashMap<>();
        s.put("max", Collections.max(data));
        s.put("min", Collections.min(data));
        s.put("mean", data.stream().mapToDouble(i->i).average().getAsDouble());
        return s;
    }
}