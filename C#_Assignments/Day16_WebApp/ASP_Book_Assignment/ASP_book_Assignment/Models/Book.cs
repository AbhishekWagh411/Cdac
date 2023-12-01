using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace ASP_book_Assignment.Models
{
    public class Book
    {
        
        public int? BookId { get; set; }
        public string Title { get; set; }

        public int? AuthorId {  get; set; }
        public Author? Author { get; set; }
    }
}
