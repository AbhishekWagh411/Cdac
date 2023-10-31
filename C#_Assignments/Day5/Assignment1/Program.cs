using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1
{
    public class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter two strings:- ");
            string s1= Console.ReadLine();
            string s2= Console.ReadLine();
            Console.WriteLine(s1 == s2);
            Console.WriteLine(s1.Equals(s2));
            Console.WriteLine(s1.GetHashCode());
            Console.WriteLine(s2.GetHashCode());
            Console.WriteLine(String.ReferenceEquals(s1,s2));



        }
    }
}
