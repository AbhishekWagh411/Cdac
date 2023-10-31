using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_space
{
    public static class Message
    {
        public static void sms(double salary)
        {
            Console.WriteLine($"SMS:- salary credited Rs.{salary}");
        }
        public static void email(double salary) 
        {

            Console.WriteLine($"Email:- salary credited Rs.{salary}");
        }
    }
}
