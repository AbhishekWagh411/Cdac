using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_space
{
    public delegate void Empsal(double salary); 
    public abstract class Employee
    {
        static Employee()
        {
            Console.WriteLine("abc.com.org");
        }
        public Empsal empsal;
        static int gid;
        int id;
        string name;
        double salary;
        double netsalary;

        public Employee(string name, double salary) 
        {
            id = ++gid;
            Name= name;
        }
        public int Id
        {
            get { return id; }
        }
        
        public string Name
        {
           get;
           set;
            
        }
        public virtual double Salary
        {
            get;set;
        }
        public  double givebasic_Salary()
        {
            netsalary = salary-salary*0.1;
            return netsalary;
        }
        public void creditSalary()
        {
            if (empsal != null)
            {
                empsal(Salary);
            }
        }
        public abstract void giveBonus();
    }
    public class Permanent : Employee
    {
        static double bonus =0.1;
        
        public Permanent(string name, double salary) : base(name, salary)
        {
            Salary = salary;
        }
         public override double Salary
         {
            get { return base.Salary; }
            set
            {
                if (value > 150000)
                {
                    throw new Exception("Cant be more than 150000");
                }
                else
                    base.Salary = value;
                
            }
         }

        public override void giveBonus()
        {
            Salary = Salary *bonus;
        }
    }
    public class Temp : Employee
    {
        static double bonus = 0.05;
        public Temp(string name, double salary) : base(name, salary)
        {
            Salary = salary;
        }
        public override double Salary
        {
            get { return base.Salary; }
            set {

                if (value > 150000)
                {
                    throw new Exception("Cant be more than 150000");
                }
                else
                {
                    base.Salary = value;
                }
                    
            }
        }
        public override void giveBonus()
        {
           double bn = Salary * bonus;
            Salary += bn;
        }
    }
}
