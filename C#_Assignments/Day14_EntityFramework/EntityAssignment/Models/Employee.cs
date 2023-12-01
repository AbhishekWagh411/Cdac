using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityAssignment.Models
{
    public class Employees
    {
        public int Id { get; set; }
        public string? Name { get; set; }

        public double? Salary { get; set; }

        [ForeignKey(nameof(Department))]
        public int? DepartmentId { get; set; }

        public Department? Department { get; set; }
        public override string? ToString()
        {
            return String.Format($" Id= {Id}, Name = {Name}, Salary = {Salary}, DepartmentId = {DepartmentId} ");
        }
    }
}
