namespace ASPAssignment1.Models
{
    public class CustomerService : ICustomerRepository
    {
        public static IList<Customer> list;
        public CustomerService() 
        {
           list  = new List<Customer>()
            {
                new Customer() { Id = 1, Name = "Mary", Mobile_No="9657411234", BillAmount=654845 },
                new Customer() { Id = 2, Name = "John",Mobile_No="4878487484", BillAmount=654845 },
                new Customer() { Id = 3, Name = "Sam", Mobile_No="9815184564", BillAmount=654845 }
            };
        }
        public IEnumerable<Customer> GetAllCustomer()
        {
            return list;
        }
    }
}
