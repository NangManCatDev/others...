public class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void printInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("직업: " + this.job);
    }
}