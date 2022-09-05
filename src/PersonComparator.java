import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxWordsToCompare;

    public PersonComparator(int maxWordsToCompare) {
        this.maxWordsToCompare = maxWordsToCompare;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurNameWordsCount() < maxWordsToCompare || o2.getSurNameWordsCount() < maxWordsToCompare) {
            if (o1.getSurNameWordsCount() < o2.getSurNameWordsCount()) {
                return 1;
            } else if (o1.getSurNameWordsCount() > o2.getSurNameWordsCount()) {
                return -1;
            }
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
