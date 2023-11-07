using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment2
{
    public interface IEmployeeRepository
    {
        void Add(Employee e);
        void Delete(int Id);
        void Update(Employee e, int Id);

        Employee Get(int id);

        List<Employee> GetAll();

    }
}
