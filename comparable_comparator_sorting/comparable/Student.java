package sorting.comparable;
//Sort collection of object on single attriute
public class Student implements  Comparable{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        //return this.id - ((Student)o).id; //sorting based on id
        //return this.name.compareTo(((Student)o).name); //sorting based on name
        return Integer.compare(this.age, ((Student)o).age); //sorting based on name
    }
}
/**
 * By using Comparable we can sort collection of objects based on single attribute
 * We arite code in current class in case of Comparable
 * compareTo method we can override to sort.
 * To sort alphabetically we use compareTo method
 */
