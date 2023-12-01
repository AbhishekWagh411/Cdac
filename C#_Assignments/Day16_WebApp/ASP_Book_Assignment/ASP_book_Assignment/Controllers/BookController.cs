using ASP_book_Assignment.Models;
using Microsoft.AspNetCore.Mvc;

namespace ASP_book_Assignment.Controllers
{
    public class BookController : Controller
    {
        public IBookRepo repo;
        public BookController(IBookRepo repo) 
        {
            this.repo= repo;
        }
        public IActionResult Index()
        {
            return View();
        }
        public IActionResult GetAllBooks()
        {
            return View(repo.Read());
        }
        public ActionResult DeleteBook(int id,Book book) 
        {
            return View(repo.Delete(id,book));
        }
    }
}
