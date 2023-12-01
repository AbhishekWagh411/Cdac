using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using EntityAssignment.Models;

namespace EntityAssignment
{
    public class EmployeeDemo
    {
        public static void Main(string[] args)
        {
            DbService db = new DbService();
            /*Employees e = new Employees()
            {
                Name = "Abhishek",
                Salary= 65000, 
                DepartmentId = 1
            };*/
            //db.AddData(e);
            // db.Display();

            /*
            List<Employees> list = db.getDept1();
            foreach (Employees emp in list)
            {
                Console.WriteLine(emp);
            }
            

            Department department = new Department()
            {
                DeptName= "R&D",
            };
            db.addDept(department);
            db.AddData(new Employees
            {
                Name="Akshay",
                Salary=8000,
                DepartmentId=4
            });

            db.Display();

            */

            //db.Del(2);
            //db.Display();

           // db.Disp();


        }
    }
}
