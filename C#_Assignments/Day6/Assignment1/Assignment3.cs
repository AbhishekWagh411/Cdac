using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment3
{
    public class Account
    {
        int id;
        string name;
        double balance;

        static  Account()
        {
            Console.WriteLine("Bank of India");
        }
        public Account() { }
        public int Id
        {
            get; set;

        }
        public string Name
        {
            get; set;
        }
        public double Balance
        {
            get;set;
        }
        public void Deposit(int amt)
        {
            balance += amt;
        }
    }

    public class CurrentAccount: Account
    {
        string Type;
        public CurrentAccount(int id, string name, Double balance, string type)
        {
            Id = id;
            Name = name;
            Balance = balance;
            Type = type;
        }
        public void Withdraw(int amt)
        {
            Balance = Balance- amt;
        }
    }
    public class SavingsAccount: Account
    {
        String Type;
        public SavingsAccount(int id ,string name, Double balance, string type)
        {
            Id = id;
            Name = name;    
            Balance = balance;
            Type = type;
        }
        public String ToString()
        {
            return String.Format($"ID= {Id}, Name= {Name}, Balance = {Balance}, A/C Type= {Type}");
        }
        public void Withdraw(int amt)
        {
            if (Balance - amt < 0)
            {
                throw new Exception("Negative Balance is not Allowed!!");
            }else
            Balance = Balance - amt;
        }
    }
    public  class Assignment3
    {
        /*
        public static void Main(String[] args)
        {
            SavingsAccount ac1 = new SavingsAccount(1, "Abhishek", 50000, "saving");
            Console.WriteLine(ac1.ToString());
        }
        */
    }
}
