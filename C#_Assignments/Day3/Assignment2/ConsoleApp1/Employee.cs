using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    public class Employee
    {
        int Id;
        String Name;
        double Salary;
        double NetSalary;

        public Employee(int Id, String Name, double Salary) { 
            this.Id = Id;
            this.Name = Name;
            this.Salary = Salary;
        }   
        public double CalculateSal()
        {
           this.NetSalary=Salary-Salary*0.1;
            return this.NetSalary;
        }
        public String display()
        {
            return $"Name= {Name}, NetSalary= {this.NetSalary}";
        }

        public static void Main(String[] args)
        {
            Employee employee1 = new Employee(1, "Abhishek", 650000);
            Employee employee2 = new Employee(2, "Shubham", 600000);
            Employee employee3 = new Employee(3, "Akshay", 750000);

            employee1.CalculateSal();
            Console.WriteLine(employee1.display());
            employee2.CalculateSal();
            Console.WriteLine(employee2.display());
            employee3.CalculateSal();
            Console.WriteLine(employee3.display());


        }
    }
}
