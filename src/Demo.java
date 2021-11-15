
class Demo
{
    int a;
    static int b;
}
//Driver Class
class UseDemo
{
    public static void main(String[] args)
    {
        Demo d1=new Demo();
        d1.a=10;
        System.out.println(d1.a);


        Demo d2=new Demo();
        d2.a=50;
        System.out.println(d2.a);

        System.out.println(Demo.b);

        Demo.b=98;
        System.out.println(Demo.b);


    }
}
