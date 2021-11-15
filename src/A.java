 class A {
    public static void show()
    {
        System.out.println("In show() of A ");
    }
    public void display()
    {
        System.out.println("In display() of A");
    }
}
class B extends A{
    public static void  show()
    {
        System.out.println("In show() of B");
    }
    public void display()
    {
        System.out.println("In display() of B");
    }
}
 class useB
 {
     public static void main(String[] args) {
         A ref= new A();
         ref.show();
         ref.display();
         ref=new B();
         ref.show();
         ref.display();

     }
 }