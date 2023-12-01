using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;

namespace EntityAssignment.Models
{
    public class EmployeeContext: DbContext
    {
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer(@"Data Source=(localdb)\ProjectModels;Initial Catalog=Employee_data;Integrated Security=True;");
        }
        public DbSet<Employees> Employees { get; set; }
        public DbSet<Department> Department { get; set; }
    }
}
