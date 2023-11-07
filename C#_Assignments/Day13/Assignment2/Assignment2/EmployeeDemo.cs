using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Configuration;

namespace Assignment2
{
    public class EmployeeDemo
    {
        public static IConfiguration iconfiguration;
        public static void Main(string[] args)
        {
            GetConnection();
            Employee();
        }
        public static void GetConnection()
        {
            var builder = new ConfigurationBuilder().SetBasePath(Directory.GetCurrentDirectory()).AddJsonFile("Appsettings.json", optional: false, reloadOnChange: true);
            iconfiguration = builder.Build();
        }
        public static void Employee()
        {
           
            IEmployeeRepository emp = new EmployeeLayer(iconfiguration);
          
             Employee employee1 = new Employee { Name = "Sanket", Salary = 800000,Gender="M",Address="lmn" };
            //emp.Add(employee1);
            //emp.Delete(6);
            //emp.Update(employee1, 2);
            //Employee emp2 =emp.Get(5);
            //Console.WriteLine("Id= {0}, Name= {1}, Salary= {2}, Gender= {3}, Address= {4}",emp2.Id,emp2.Name,emp2.Salary,emp2.Gender,emp2.Address);

            List<Employee> list=emp.GetAll();
            foreach(Employee emp2 in list)
            {
                Console.WriteLine("Id= {0}, Name= {1}, Salary= {2}, Gender= {3}, Address= {4}",emp2.Id,emp2.Name,emp2.Salary,emp2.Gender,emp2.Address);

            }
        }
    }
}
