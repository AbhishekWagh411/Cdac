using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityAssignment.Models
{
    public class Department
    {
        [Key]
        public int Id { get; set; }
        public string? DeptName { get; set; }

        [ForeignKey("DepartmentId")]
        public IList<Employees?> Employees {  get; set; }

    }
}
