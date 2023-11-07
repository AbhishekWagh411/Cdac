using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Data.SqlClient;
using Microsoft.Extensions.Configuration;

namespace Assignment2
{
    public class EmployeeLayer : IEmployeeRepository
    {
        public EmployeeLayer(IConfiguration configuration)
        {
           _connectionString= configuration.GetConnectionString("Default");
        }
        public string _connectionString;

        public SqlConnection getSqlConnection()
        {
            SqlConnection conn = new SqlConnection(_connectionString);
            return conn;
        }

        void IEmployeeRepository.Add(Employee employee)
        {
            
                SqlConnection sql = getSqlConnection();
                SqlCommand cmd = new SqlCommand("Add", sql);
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.Add(new SqlParameter("@pname", employee.Name));
                cmd.Parameters.Add(new SqlParameter("@psalary", employee.Salary));
                cmd.Parameters.Add(new SqlParameter("@pgender", employee.Gender));
                cmd.Parameters.Add(new SqlParameter("@paddress", employee.Address));
                sql.Open();
                int i = cmd.ExecuteNonQuery();
                sql.Close();
                Console.WriteLine(i);
           
        }

        void IEmployeeRepository.Delete(int Id)
        {
            SqlConnection sql = getSqlConnection();
            SqlCommand cmd = new SqlCommand("Delete", sql);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.Add(new SqlParameter("@pid", Id));
            sql.Open();
            int i = cmd.ExecuteNonQuery();
            sql.Close();
            Console.WriteLine(i);
        }

        void IEmployeeRepository.Update(Employee employee, int Id)
        {
            SqlConnection sql = getSqlConnection();
            SqlCommand cmd = new SqlCommand("Update", sql);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.Add(new SqlParameter("@pid", Id));
            cmd.Parameters.Add(new SqlParameter("@pname", employee.Name));
            cmd.Parameters.Add(new SqlParameter("@psalary", employee.Salary));
            cmd.Parameters.Add(new SqlParameter("@pgender", employee.Gender));
            cmd.Parameters.Add(new SqlParameter("@paddress", employee.Address));
            sql.Open();
            int i = cmd.ExecuteNonQuery();
            sql.Close();
            Console.WriteLine(i);
        }

        Employee IEmployeeRepository.Get(int id)
        {
            SqlConnection sql = getSqlConnection();
            SqlCommand cmd = new SqlCommand("Get", sql);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.Add(new SqlParameter("@pid", id));
            sql.Open();
            SqlDataReader reader = cmd.ExecuteReader();
            Employee emp=null;
            while (reader.Read())
            {
                emp = new Employee
                {
                    Id= Convert.ToInt32(reader["Id"]) ,
                    Name=reader["Name"].ToString(),
                    Salary= Convert.ToSingle(reader[ "Salary"]),
                    Gender= reader["Gender"].ToString() ,
                    Address = reader["Address"].ToString()
                };
            }
            sql.Close();
            return emp;
        }

        List<Employee> IEmployeeRepository.GetAll()
        {
            List<Employee> list = new List<Employee>();
            SqlConnection sql = getSqlConnection();
            SqlCommand cmd = new SqlCommand("GetAll", sql);
            cmd.CommandType = CommandType.StoredProcedure;
            sql.Open();
            SqlDataReader reader = cmd.ExecuteReader();

            while (reader.Read())
            {
                Employee emp = emp = new Employee
                {
                    Id = Convert.ToInt32(reader["Id"]),
                    Name = reader["Name"].ToString(),
                    Salary = Convert.ToSingle(reader["Salary"]),
                    Gender = reader["Gender"].ToString(),
                    Address = reader["Address"].ToString()
                };
                list.Add(emp);
            }
            sql.Close();
            return list;
        }
    }
}
