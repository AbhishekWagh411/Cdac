using ASPAssignment1.Models;
using Microsoft.AspNetCore.Mvc;

namespace ASPAssignment1.Controllers
{
    public class CustomerController : Controller
    {
         ICustomerRepository cc;
        public CustomerController(ICustomerRepository cr) {
            cc = cr;
        }
        
        public IActionResult Index()
        {
            return View(cc.GetAllCustomer());
        }
    }
}
