using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1
{
    public class Account
    {
        static int gid;
        private int id;
        private string name;
        private double balance;

        public Account(string name, double balance)
        {
            id = ++gid;
            Name = name;
            Balance = balance;
        }
        public virtual String Name
        {
            get; set;
        }
        public int Id
        {
            get { return id; }
        }
        protected virtual double Balance
        {
            get; set;
        }
        public virtual void withdraw(double amt)
        {
            
        }
        public void deposit(double amt)
        {
            Balance += amt;
        }
        public override string ToString()
        {
            return string.Format($"Id= {id}, Name= {Name}, Balance={Balance}");
        }
    }

    public class Current : Account
    {
        public Current(string name, double balance) : base(name, balance)
        {

        }
        public sealed override void withdraw(double amt)
        {
            if((Balance-amt)<1000) {
                throw new Exception("minimum Balance should be thousand");

            }else
                Balance-=amt;
        }
    }
    public class Saving : Account
    {
        public Saving(string name, double balance) : base(name, balance)
        {

        }
        public sealed override void withdraw(double amt)
        {
            Balance-=amt;
        }
    }
    public class Program
    {
        /*
        public static void Main(string[] args)
        {
            try
            {
                Account account1 = new Saving("Abhishek", 2000);
                account1.deposit(1000);
                account1.withdraw(15000);
                Console.WriteLine(account1);

                Account account2 = new Current("Shubham", 2000);
                account2.withdraw(1500);
                Console.WriteLine(account2);
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }*/
    }
}
namespace Assignment2
{
    public class Shape
    {
        public virtual void draw(float i, float j)
        {
            Console.WriteLine("Dawing Shape at {0}, {1}",i,j);
        }
    }
    public class Circle:Shape
    {
        public override void draw(float i, float j)
        {
            Console.WriteLine("Drawing Circle at {0}, {1}", i, j);
        }
    }
    public class Square : Shape
    {
        public override void draw(float i, float j)
        {
           Console.WriteLine("Drawing Square at {0}, {1}",i, j);
        }
        public void draw1()
        {
            Console.WriteLine("in square unique");
        }
    }
    public class Demo
    {
        public static void Main(String[] args)
        {
            Shape[] shape = new Shape[2];
            shape[0] = new Circle();
            shape[1] = new Square();
            
            foreach(Shape s in shape)
            {
                if(s is Square)
                {
                   Square c= (Square)s;
                    c.draw1();
                }
                    s.draw(100, 100);
                    s.draw(200, 200);
                    s.draw(300, 300);
                
            }
        }
    }
}