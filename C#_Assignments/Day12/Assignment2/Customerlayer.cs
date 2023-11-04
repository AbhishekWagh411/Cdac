using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Configuration;

namespace Assignment2
{
    public class Customerlayer
    {
        public string connectionString;
        public Customerlayer(IConfiguration iconfiguration)
        {
           connectionString= iconfiguration.GetConnectionString("Default");
        }
        public void Customer() 
        {
            using(SqlConnection conn = new SqlConnection(connectionString))
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand("Select * from Customer",conn);
                //SqlDataReader reader = cmd.ExecuteReader();

                //string que = "insert into Customer(name,Address, Mob_no) VALUES ('Pratik', 'ksehfuehfue', 7887454854)";
               /* 
                if(reader.HasRows) 
                {
                    while(reader.Read())
                    {
                        Console.WriteLine("Id = {0}, Name = {1}, Address = {2}, Mobile no. = {3}", reader[0], reader[1], reader[2], reader[3]);
                    }
                }
               */
                //reader.Close();
                //Console.WriteLine();
                //cmd.CommandText = que;
                //int changedRows= cmd.ExecuteNonQuery();
                //Console.WriteLine("Changed Rows ={0}",changedRows);

                //cmd.CommandText = "update Customer set name= 'Akash' where id= 6";
                //int changedRows= cmd.ExecuteNonQuery();
                //Console.WriteLine($"changed rows={changedRows}");
                //cmd.CommandText = "delete from Customer where Id= 3";
                //int changedRows = cmd.ExecuteNonQuery();
                //Console.WriteLine($"changed Rows= {changedRows}");

                cmd.CommandText = "Select * from Customer";
                SqlDataReader srd= cmd.ExecuteReader();
                if(srd.HasRows)
                {
                    while(srd.Read())
                    {
                        Console.WriteLine("Id = {0}, Name = {1}, Address = {2}, Mobile no. = {3}", srd[0], srd[1], srd[2], srd[3]);
                    }
                }

            }
        }
    }
}
