namespace ASPAssignment1.Models
{
    public interface ICustomerRepository
    {
        public IEnumerable<Customer> GetAllCustomer();
    }
}
