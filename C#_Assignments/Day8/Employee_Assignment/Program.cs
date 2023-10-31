using Employee_space;
namespace Employee_Assignment
{
    public  class Program
    {
        public static void Main(string[] args)
        {
            Employee[] emp = new Employee[2];
            emp[0] = new Permanent("Abhishek", 50000);
            emp[1] = new Temp("Mayur", 100000);

            for (int i  = 0; i < emp.Length; i++)
            {
                emp[i].empsal += Message.sms;
                emp[i].empsal += Message.email;
            }
            emp[0].Salary = 20000;
            emp[0].creditSalary();

        }
    }
}