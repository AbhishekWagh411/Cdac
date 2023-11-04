using Microsoft.Extensions.Configuration;

namespace Assignment2
{
    public class Program
    {
        public static IConfiguration iconfiguration;
    
        public static void Main(string[] args)
        {
            GetConnection();
            Customer();
        }
        public static void GetConnection()
        {
            var builder = new ConfigurationBuilder().
                SetBasePath(Directory.GetCurrentDirectory()).
                AddJsonFile("Appsettings.json");
            iconfiguration = builder.Build();
        }
        public static void Customer()
        {
            Customerlayer cl = new Customerlayer(iconfiguration);
            cl.Customer();

        }
    }
}