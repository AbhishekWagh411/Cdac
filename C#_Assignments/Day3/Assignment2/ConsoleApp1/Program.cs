using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    public class Account
    {
        String name;
        int id;
        double balance = 5000;

        public void setName(String name)
        {
            this.name = name;
        }
        public void deposit(int amt)
        {
            balance += amt;
        }
        public void withdraw(int amt)
        {
            balance -= amt;
        }
        public string display()
        {
            return $"name {name}, Balance= {balance}";
        }
      /*  public static void Main(string[] args)
        {
            Account account = new Account();
            account.setName("Abhishek");
            account.deposit(1000);
            Console.WriteLine(account.display());
            account.withdraw(500);
            Console.WriteLine(account.display());
        }*/
    }
}
