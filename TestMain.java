public class TestMain {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.setWidth(10);
        triangle.setHeight(5);
        int area = triangle.getArea();
        System.out.println("삼각형의 넓이: " + area);

        
        Person person = new Person("박성진", 14, "중학생");
        person.printInfo();
    }
}