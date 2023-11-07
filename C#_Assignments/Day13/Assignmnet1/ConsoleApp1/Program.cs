using Microsoft.Extensions.Configuration;

namespace ConsoleApp1
{
    public class Program
    {
        public static IConfiguration iconfiguration;
        public static void Main(string[] args)
        {
            GetJsonFile();
            GetCustomer();
        }
        static void GetJsonFile()
        {
            var builder = new ConfigurationBuilder().
                SetBasePath(Directory.GetCurrentDirectory()).
                AddJsonFile("Appsettings.json",optional: false,reloadOnChange:true);
           iconfiguration= builder.Build();
        }
        public static void GetCustomer()
        {
            CostomerLayer cst = new CostomerLayer(iconfiguration);
            /*
            List<Employee> list = cst.DisplayList();
            foreach (Employee emp in list)
            {
                Console.WriteLine("ID= {0}, Name = {1}, Address = {2}, Mob_no = {3}",emp.Id,emp.name, emp.Address ,emp.Mob_No);
            }
            
            Console.WriteLine( cst.del(7));
            
            int i = cst.insert(new Employee { Address = "siuhfuysf", Mob_No = "5641645545", name = "Pratik" });
            Console.WriteLine(i);
            

            int i = cst.update(8, "Akshay");
            Console.WriteLine(i);
            */

            Employee emp = cst.Search("54545454");
            Console.WriteLine(" Name = {0}, Address = {1}, Mob_no = {2}",emp.name, emp.Address ,emp.Mob_No );

        }
    }
}