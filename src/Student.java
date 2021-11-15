class Student
{
    public static double pi=3.14;

    public Student()
    {
        System.out.println("Constructor called");
    }

    static
    {
        System.out.println("Static block is called");
    }
}
class UseStudent
{
    public static void main(String[] args)
    {
        //Student s=new Student();
        //Student s;

         /*Student s1=new Student();
         Student s2=new Student();
         Student s3=new Student();*/

        System.out.println(Student.pi);
        System.out.println("Hello Students");
    }
}