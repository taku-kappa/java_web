public class StuSample {
    public static void main(String[] args) {
        Student stu1 = new Student("菅原");
        Student stu2 = new Student("菅原");

        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.toString());
    }
    
}
