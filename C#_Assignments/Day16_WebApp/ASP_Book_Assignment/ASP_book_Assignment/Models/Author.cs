using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Net;

namespace ASP_book_Assignment.Models
{
    public class Author
    {
        public int? Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }

        public ICollection<Book?> Books { get; set;}
    }
}
