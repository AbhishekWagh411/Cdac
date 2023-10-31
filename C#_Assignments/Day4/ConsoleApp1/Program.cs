namespace ConsoleApp1
{
    public class Employee
    {
        private readonly int id;
        private static int getId;
        private String name;
        private int salary;
        private double netSalary;
        private static double TDS;
        static Employee()
        {
            Console.WriteLine("Company.exe");
        }
        public Employee()
        {
            id = ++getId;
            if (id > 3)
            {
                throw new Exception("error");
            }
        }
        public int Id
        {
            get { return id; }
        }
        public String Name
        {
            get; set;
        }
        public int Salary
        {
            get {

                return salary;
            }
            set
            {
                if (value < 1 || value > 50000)
                {
                    throw new Exception("Salary can't be zero negative and more than 50000!!");
                }
                else
                {
                    salary = value;
                }
            }
        }

        public double deductSal()
        {
            double TDS = salary * 0.1;
            netSalary = Salary - TDS;
            return TDS;
        }



        public static void Main(string[] args)
        {
            Employee employee = new Employee();
            Employee employee1 = new Employee();
            Employee employee2 = new Employee();
            try
            {

                Employee employee3 = new Employee();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            try
            {
                employee.Salary = 60000;
                Console.WriteLine(employee.Salary);
            }
            catch (Exception e1)
            {
                Console.WriteLine(e1.Message);
            }
        }
    }
}