using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment
{
    public class Student
    {
        String name;
        int math;
        int science;
        int english;
        int total;
        static Student()
        {
            Console.WriteLine("Vidyanagari");
        }
        public Student(string name,int math, int science, int english) { 
            this.name = name;   
            this.math = math;
            this.science = science; 
            this.english = english;

        }
        public int TotalMarks()
        {
          total=   math+science+english;
            return total;
        }
        public String info()
        {
            return String.Format("name = {0} ,Total marks= {1}",name, total);
        }
    }
}
