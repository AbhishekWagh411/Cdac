using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    public class Calculator
    {
        public double square(String x)
        {
            double sqr = Convert.ToSingle(x);
            return sqr*sqr;
        }
        public double cube(String x)
        {   
            double cu = Convert.ToSingle(x);
            return cu*cu;
        }
        public int round(String x)
        {
            int i = (Int32)Double.Parse(x);
            return i;
        }
        /*public static void Main(String[] args)
        {
            Console.WriteLine("Enter no. ");
            String x= Console.ReadLine();
            Calculator calculator = new Calculator();
            Console.WriteLine(calculator.square(x));
            Console.WriteLine(calculator.cube(x));
            Console.WriteLine(calculator.round(x));

        }*/
    } 
}
