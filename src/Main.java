import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Misko", "Podolan", 7));
        persons.add(new Person("Roger", "Mashed potato", 40));
        persons.add(new Person("Tobias", "Tangle Moss", 33));
        persons.add(new Person("Gunnar", "Bakkal Harun Catli Akkurt Bahadir Erdal Bilgin", 11));
        persons.add(new Person("Pupun", "Mamando Kari Maru", 25));
        persons.add(new Person("Yerbolat", "Aidynov Serikbekev Marlenev Hojaniasev", 80));
        persons.add(new Person("Tor", "Aasland", 18));
        persons.add(new Person("Mancio", "Ficara Della Rocca Casino Billeci", 28));

        int maxWordsToCompare = 3;
        persons.sort((o1, o2) -> {
            if (o1.getSurNameWordsCount() < maxWordsToCompare || o2.getSurNameWordsCount() < maxWordsToCompare) {
                if (o1.getSurNameWordsCount() < o2.getSurNameWordsCount()) {
                    return 1;
                } else if (o1.getSurNameWordsCount() > o2.getSurNameWordsCount()) {
                    return -1;
                }
            }
            return Integer.compare(o2.getAge(), o1.getAge());
        });
        for (Person p : persons){
            System.out.println(p);
        }
    }
}
