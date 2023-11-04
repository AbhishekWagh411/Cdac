using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Configuration;

namespace Assignment1
{
    public class Employeelayer
    {
        private string connestionString;
        public Employeelayer(IConfiguration configuration)
        {
            connestionString = configuration.GetConnectionString("Default");
        }
        public void Employee()
        {
            using(SqlConnection sqlConnection = new SqlConnection(connestionString)) {

                sqlConnection.Open();
               
                SqlCommand sqlCommand = new SqlCommand("Select * from Employee", sqlConnection);
             
                SqlDataReader red= sqlCommand.ExecuteReader();
               

                if (red.HasRows)
                {
                    while(red.Read())
                    {
                        Console.WriteLine("Id= {0} , Name= {1}, Salary {2}", red[0], red[1], red[2]);
                    }
                }

            }
        }
    }
}
