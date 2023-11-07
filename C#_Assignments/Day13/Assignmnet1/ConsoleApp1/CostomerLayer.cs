using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Configuration;

namespace ConsoleApp1
{
    public class CostomerLayer
    {
        public static string _connectionString;
        public CostomerLayer(IConfiguration iconfiguration)
        {
          _connectionString=  iconfiguration.GetConnectionString("Default");
        }
        public static SqlConnection GetConnection()
        {

            SqlConnection conn = new SqlConnection(_connectionString);
                return conn;
        }

        public List<Employee> DisplayList()
        {
            List<Employee> list = new List<Employee>();
            SqlConnection sqlConnection = GetConnection();
            SqlCommand cmd = new SqlCommand("Select * from Customer", sqlConnection);
            sqlConnection.Open();
            SqlDataReader reader= cmd.ExecuteReader();
            if (reader.HasRows)
            {
                while (reader.Read())
                {
                    list.Add(new Employee()
                    {
                        Id = Convert.ToInt32(reader["id"]),
                        name = reader["name"].ToString(),
                        Mob_No= reader["Mob_No"].ToString()
                    });
                }
            }
            sqlConnection.Close();

            return list;
        }

        public int del(int id)
        {
            SqlConnection sqlConnection = GetConnection();
            SqlCommand cmd= new SqlCommand("Procedure",sqlConnection);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.Add(new SqlParameter("@pid",id));
            sqlConnection.Open();
            int i =cmd.ExecuteNonQuery();
            sqlConnection.Close();
            return i;
        }
        public int insert(Employee emp)
        {
            SqlConnection sqlConnection = GetConnection();
            SqlCommand cmd = new SqlCommand("Insert", sqlConnection);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.Add(new SqlParameter("@pname", emp.name));
            cmd.Parameters.Add(new SqlParameter("@paddress", emp.Address));
            cmd.Parameters.Add(new SqlParameter("@pmobno", emp.Mob_No));
            sqlConnection.Open();
            int i= cmd.ExecuteNonQuery();
            sqlConnection.Close();
            return i;
        }
        public int  update(int  id, string name) 
        {
            SqlConnection sqlConnection= GetConnection();
            SqlCommand cmd = new SqlCommand("Update", sqlConnection);
            cmd.CommandType= CommandType.StoredProcedure;

            cmd.Parameters.Add(new SqlParameter("@pid", id));
            cmd.Parameters.Add(new SqlParameter("@pname", name));
            sqlConnection.Open();
            int i= cmd.ExecuteNonQuery();
            sqlConnection.Close();
            return i;
        }
        public Employee Search(int id)
        {
            Employee employee = new Employee();
            SqlConnection sqlConnection = GetConnection();
            SqlCommand cmd = new SqlCommand("Search", sqlConnection);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.Add(new SqlParameter("@pid", id));
            sqlConnection.Open();
            SqlDataReader rdr = cmd.ExecuteReader();

            if (rdr.HasRows)
            {
                while (rdr.Read())
                {
                    employee = new Employee
                    {
                        Id = id,
                        name = rdr["name"].ToString(),
                        Address = rdr["Address"].ToString(),
                        Mob_No = rdr["Mob_No"].ToString()
                    };
                }
            }
            
            sqlConnection.Close();
            return employee;
        }
        public Employee Search(String nmormb)
        {
            Employee employee = new Employee();
            SqlConnection sqlConnection = GetConnection();
            SqlCommand cmd = new SqlCommand("Search2", sqlConnection);
            cmd.CommandType = CommandType.StoredProcedure;

            cmd.Parameters.Add(new SqlParameter("@pname", nmormb));

            cmd.Parameters.Add(new SqlParameter("@pmobno", nmormb));

            sqlConnection.Open();
            SqlDataReader rdr = cmd.ExecuteReader();

            if (rdr.HasRows)
            {
                while (rdr.Read())
                {
                    employee = new Employee
                    {
                        Id = Convert.ToInt32( rdr["Id"]),
                        name = rdr["name"].ToString(),
                        Address = rdr["Address"].ToString(),
                        Mob_No = rdr["Mob_No"].ToString()
                    };
                }
            }

            sqlConnection.Close();
            return employee;

        }
    }
}

    

