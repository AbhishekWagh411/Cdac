using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment
{
    internal class Program
    {
       
        static void Main(string[] args)
        {
            Student student = new Student("Abhishek",10,20,70);
            Console.WriteLine( student.TotalMarks());
            Console.WriteLine(student.info());

        }
        
    }
}
