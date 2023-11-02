using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GroupByAssignment

{
    public enum Depnt
    {
        MKT,
        ADV, 
        HR
    }
    public  class Employee
    {
        int id;
        string name;
        Depnt dept;

        public int Id
        {
            get; set;
        }
        public string Name
        {
            get;set;
        }
        public Depnt Dept
        {
            get;set;
        }

    }
    public class DemoMain
    {
        public static void Main(string[] args)
        {
            var subset = new[] {
                                    new Employee{Id=1, Name="Raj", Dept=Depnt. HR },
                                    new Employee{Id=2, Name="Raja", Dept=Depnt.HR },
                                    new Employee{Id=3, Name="Rajani",Dept=Depnt.ADV },
                                    new Employee{Id=4, Name="Kavita", Dept=Depnt.MKT },
                                    new Employee{Id=5, Name="Vidya", Dept=Depnt.MKT },
                                    new Employee{Id=6, Name="Ganesh", Dept=Depnt.HR },
                                    new Employee{Id=7, Name="Mohan", Dept=Depnt.MKT }
                                     };
            var a = subset.GroupBy(x => x.Dept).Select(g => new { Employees=g });
            
            foreach(var i in a)
            {
                foreach(var j in i.Employees)
                {
                    Console.WriteLine(j.Id+" "+j.Name+" "+j.Dept);
                }
            }
        }
    }
}
