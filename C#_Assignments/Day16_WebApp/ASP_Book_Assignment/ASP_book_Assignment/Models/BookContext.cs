using Microsoft.EntityFrameworkCore;

namespace ASP_book_Assignment.Models

{
    public class BookContext: DbContext
    {
        public BookContext(DbContextOptions<BookContext> options):base(options)
        {
            
        }
        public DbSet<Book> Book { get; set;}
       public DbSet<Author> Author { get; set;}   

    }
}
