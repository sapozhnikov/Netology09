public class Person {
    private String name;
    private String surname;
    private int age;

    private int surNameWordsCount;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        updateSurNameWordsCount();
    }

    private void updateSurNameWordsCount(){
        surNameWordsCount = surname.split(" ").length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        updateSurNameWordsCount();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSurNameWordsCount() {
        return surNameWordsCount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
