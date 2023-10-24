using System.ComponentModel.Design;

namespace ClassLibrary1
{
    public class Class1
    {
        public int fact(int x)
        {
            if (x > 0)
            {
                return x * fact(x - 1);
            }
            else return 1;
        }
    }
}