using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment2
{
    public class Day2
    {
        public static double add(double x, double y)
        {
            return x+y;
        }
        public static double square(float x)
        {
            return x * x;
        }
       /* public static void Main(string[] args)
        {
            int x3;
            int y3;
            float f;
            Console.WriteLine("Enter no.: ");
            String x = Console.ReadLine();
            String y = Console.ReadLine();
            int x1= int.Parse(x);
            int y1 = int.Parse(y);
            Console.WriteLine(add(x1, y1));
            float x2 = Convert.ToSingle(x);
            float y2 = Convert.ToSingle(y);
            Console.WriteLine(add(x2, y2));
            bool x4 = Int32.TryParse(x ,out x3);
            bool y4 = Int32.TryParse(y, out y3);
            Console.WriteLine(add(x3,y3));

            float x5 = float.Parse(x);
            Console.WriteLine(square(x5));
            float x6 = Convert.ToSingle(x);
            Console.WriteLine(square(x6));
            bool x7 = float.TryParse(x, out f);
            Console.WriteLine(square(f));

        }*/
    }
}
