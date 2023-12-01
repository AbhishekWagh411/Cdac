namespace WebApplication1.Models
{
    public class EmployeeService : IEmployeeRepository
    {
        public readonly AppDbContext context;
        public EmployeeService(AppDbContext context) {
        this.context = context;
        }
        Employee IEmployeeRepository.Add(Employee employee)
        {
            context.Employee.Add(employee);
            context.SaveChanges();
            return employee;
        }

        Employee IEmployeeRepository.Delete(int Id)
        {
            var a = context.Employee.Find(Id);
            if (a != null)
            {
                context.Employee.Remove(a);
                context.SaveChanges();
            }
            return a;
        }

        IEnumerable<Employee> IEmployeeRepository.GetAllEmployee()
        {
            IEnumerable<Employee> list = context.Employee.ToList<Employee>();
            return list;
        }

        Employee IEmployeeRepository.GetEmployee(int Id)
        {
            throw new NotImplementedException();
        }

        Employee IEmployeeRepository.Update(Employee employeeChanges)
        {
            var emp= context.Employee.Attach(employeeChanges);
            emp.State= Microsoft.EntityFrameworkCore.EntityState.Modified;
            context.SaveChanges();
            return employeeChanges;
        }
    }
}
