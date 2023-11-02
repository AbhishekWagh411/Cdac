namespace ConsoleApp1
{
    public enum DetId{
        ADV,
        HR, 
        ADMIN
    }
    public class Employee
    {
        public int MemberId { get; set; }
        public string Name { get; set; }
        public double Salary { get; set; }

        public DetId detId { get; set; }
    }
    public class Department
    {
        public DetId detId { get; set; }  
        public string DeptName { get; set; }
    }
    public class Program
    {
       /*
        public static void Main(string[] args)
        {
            var emp = new[] { new { MemberId = 1, Name = "Abhishek", Salary = 20000, detId = DetId.ADV },
                              new {MemberId = 2, Name ="Bhushan",Salary=25000,detId=DetId.ADMIN },
                              new {MemberId = 3, Name ="Bhupesh",Salary=30000,detId=DetId.HR },
                              new {MemberId = 4, Name ="Nishant",Salary=27000,detId=DetId.ADV },
                              new { MemberId = 5, Name = "Mayur", Salary =29000, detId = DetId.ADMIN },
                              new {MemberId = 1, Name ="Abhishek",Salary=20000,detId=DetId.HR }};

            var dep = new[] { new {detId=DetId.ADV, DeptName="Advertising Department" },
                          new {detId=DetId.HR, DeptName="Human Resource Department" },
                          new {detId=DetId.ADMIN, DeptName="Admin Department" },
                          new {detId=DetId.ADMIN, DeptName="Admin Department" },
                          new {detId=DetId.HR, DeptName="Human Resource Department" },
                          new {detId=DetId.ADV, DeptName="Advertising Department" },
            };

            var subset = emp.Join(dep, emp => emp.detId,dep => dep.detId, (dep, emp)=>new { dep.Name, emp.DeptName });
           
            foreach(var i in subset)
            {
                Console.Write(i+"\n");
            }
       
        */
       
    }
    
}
