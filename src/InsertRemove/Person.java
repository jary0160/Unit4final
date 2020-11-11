package InsertRemove;

public class Person implements Comparable{
    private String name;
    private int age;
    private String gender;

    public Person(String n, int a, String g) {
        name=n;
        age=a;
        gender=g;
    }

    @Override
    public int compareTo(Object o) {
        String other = ((Person)o).getName();
        return name.compareTo(other);
    }
    
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    
}
