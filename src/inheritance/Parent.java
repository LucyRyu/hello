package inheritance;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Parent {
    public String name;
    public int age;

    public void smoke(){
        System.out.println("아버지가 담배를 핍니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
