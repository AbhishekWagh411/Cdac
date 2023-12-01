using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{

    public class EmployeeController : Controller
    {
         public readonly IEmployeeRepository EmployeeRepository;
        public EmployeeController(IEmployeeRepository repo) {
        EmployeeRepository = repo;
        }
        public IActionResult Index()
        {
            IEnumerable<Employee> list= EmployeeRepository.GetAllEmployee();
            return View(list);
        }
        public ActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Create(int id, Employee e)
        {
            EmployeeRepository.Add(e);
            return RedirectToAction(nameof(Index));
        }

        public ActionResult Delete(int id)
        {
           var model= EmployeeRepository.Delete(id);
            return View(model);
        }
        public ActionResult Update(Employee e)
        {
           var emp= EmployeeRepository.Update(e);
            return View(emp);
        }
    }
}
