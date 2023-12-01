using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using EntityAssignment.Models;

namespace EntityAssignment
{
    public class DbService
    {
        public static readonly EmployeeContext employeeContext = new EmployeeContext();
       public void AddData(Employees e)
        {
            employeeContext.Add<Employees>(e);
            employeeContext.SaveChanges();
        }
        public void Display()
        {
            foreach(var i in employeeContext.Employees.ToList<Employees>())
            {
                Console.WriteLine(i);
            }
        }
        public List<Employees> getDept1()
        {
           var list= employeeContext.Employees.Where((e)=>e.DepartmentId == 1).ToList();
            return list;
        }
        public void addDept(Department department)
        {
            employeeContext.Add<Department>(department);
            employeeContext.SaveChanges ();
        }
        public void Del(int id)
        {
             Employees e = employeeContext.Employees.FirstOrDefault((e)=>e.Id==id);
            if (e != null)
            {
                employeeContext.Remove(e);
                employeeContext.SaveChanges();
            }
        }
        public void Disp()
        {
           var e= employeeContext.Employees.Join(employeeContext.Department,(e)=>e.DepartmentId,(f)=>f.Id,(i,d)=>new { i.Name, d.DeptName });
            foreach(var i in e)
            {
                Console.WriteLine(i.Name+" "+i.DeptName);
            }
        }
        public List<Employees> salgtthan()
        {
            var e = employeeContext.Employees.Where((e)=>e.Salary>8000).ToList();
            return e;
        }

    }
}
