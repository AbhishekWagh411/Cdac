using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment4
{
    public class Account
    {
        static double intRate = 0.07;
        static int gId;
        int id;
        string name;
        double balance;
        public Account( string name, double balance)
        {
            id = ++gId;
            Name = name;
            
            Balance = balance;
        }
        public string Name
        {
            get; set;
        }
        public int Id
        {
            get { return id; }
        }
        public double Balance
        {
            get { return balance; }
            set
            {
                if (value < 1)
                {
                    throw new ArgumentException("Cant be less than zero");
                }
                else
                    balance = value;
            }
        }
        public void deposit(double amt)
        {
            Balance+= amt;
        }
        public override string ToString()
        {
            return String.Format($"Id= {Id}, Name= {Name}, Balance= {Balance} ");
        }
    }
    public class SavingsAccount : Account
    {
        public SavingsAccount(string name, double balance) : base(name, balance)
        {
        }
        public String withdraw(int amt)
        {
            if(Balance-amt < 1000)
            {
                throw new Exception("A/C Can't be less than 1000");
            }else
            Balance -= amt;
            return $" Balance= {Balance}";
        }
    }
    public class CurrentAcount : Account
    {
        public CurrentAcount(string name, double balance) : base(name, balance)
        {
        }
        public double withdraw(int amt)
        {
            Balance -= amt;
            return Balance;
        }
    }
    public class AccountDemo
    {
        public static void Main(String[] args)
        {
            try
            {
                Assignment4.SavingsAccount savingsAccount = new Assignment4.SavingsAccount("Abhishek Wagh", 2000);
                Console.WriteLine(savingsAccount);
                Console.WriteLine(savingsAccount.withdraw(150));
                Assignment4.SavingsAccount savingsAccount1 = new Assignment4.SavingsAccount("Abhishek Wagh", 2000);
                Console.WriteLine(savingsAccount1);
                Console.WriteLine(savingsAccount1.withdraw(1050));


            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
