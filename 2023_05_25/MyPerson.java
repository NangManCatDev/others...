public class MyPerson {
    //멤버변수
    private String name;
    private int age;

    //생성자 함수
    public MyPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //메소드
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
    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
/*
public class Example {
    public static void main(String[] args) {
        MyPerson aPerson = new MyPerson();
        aPerson.age = 17;
    }
}
*/