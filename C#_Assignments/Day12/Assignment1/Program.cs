using Microsoft.Extensions.Configuration;

namespace Assignment1
{
    public class Program
    {
        static IConfiguration iconfiguration;
        public static void Main(string[] args)
        {
            getConnection();
            Employee();
        }
        public static void getConnection()
        {
            var builder = new ConfigurationBuilder().SetBasePath(Directory.GetCurrentDirectory()).AddJsonFile("Appsettings.json", optional: false, reloadOnChange: true);
              iconfiguration=  builder.Build();
        }
        public static void Employee()
        {
            Employeelayer emp = new Employeelayer(iconfiguration);
            emp.Employee();
        }

    }
}