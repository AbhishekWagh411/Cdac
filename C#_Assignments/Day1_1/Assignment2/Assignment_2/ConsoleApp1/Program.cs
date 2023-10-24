using ClassLibrary1;

namespace cls
{

    public class A
    {
        public static void Main(String[] args) {
            ClassLibrary1.Class1 a = new ClassLibrary1.Class1();
            int r = a.fact(4);
            Console.WriteLine(r);
                }
    }
}