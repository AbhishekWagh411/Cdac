using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    public enum Dep
    {
        MKT=1,
        ADV=2,
        ADMN=3
    }
    public class Employye
    {
        private int Id;
        private string Name;
        public double Salary;
        public double NetSalary;
        public Dep dep;
        static Employye()
        {
            Console.WriteLine("ABC.xyz");
        }
        public Employye(int id, string name, double salary, Dep dep)
        {
            Id = id;
            Name = name;
            Salary = salary;
            this.dep = dep;
        }
        public double payTax(double p)
        {
            NetSalary = Salary - Salary * (p / 100);
            return p;
        }
        public String display()
        {
            return $"name = {Name}, NetSalary= {NetSalary}";
        }
    }
        
    public class Demo
    {
        public static void DepSal(ConsoleApp1.Employye[] err)
        {
            double MKTsum = 0;
            double ADMNsum = 0;
            double ADVsum = 0;

               for(int i = 0; i < err.Length; i++)
                {
                    if (err[i].dep == Dep.ADMN){
                        ADMNsum = ADMNsum + err[i].Salary;
                    Console.WriteLine();
                }
                    else if(err[i].dep == Dep.ADV)
                    {
                        ADVsum= ADVsum + err[i].Salary;
                    }else if (err[i].dep == Dep.MKT)
                    {
                        MKTsum = MKTsum+ err[i].Salary;
                    }
                }
               Console.WriteLine(ADMNsum);
               Console.WriteLine(ADVsum);
               Console.WriteLine(MKTsum);
            }
            public static void Main(string[] args)
            {
                Employye employye1 = new Employye(1, "Abhishek", 450000, Dep.MKT);
                Employye employye2 = new Employye(2, "Mayur", 300000, Dep.ADV);
                Employye employye3 = new Employye(3, "Abhishek", 650000, Dep.ADMN);
                Employye employye4 = new Employye(4, "Rahhul", 300000, Dep.ADV);
                Employye employye5 = new Employye(5, "Shubham", 450000, Dep.MKT);
                ConsoleApp1.Employye[] emp = new Employye[5];
                emp[0] = employye1;
                emp[1] = employye2;
                emp[2] = employye3;
                emp[3] = employye4;
                emp[4] = employye5;
                DepSal(emp);

            Console.WriteLine( employye1.payTax(30));
            Console.WriteLine(employye1.display());

            }
        
    }
}
