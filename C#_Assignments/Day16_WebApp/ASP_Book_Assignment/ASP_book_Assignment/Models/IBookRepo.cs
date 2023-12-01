using Microsoft.AspNetCore.Mvc;

namespace ASP_book_Assignment.Models
{
    public interface IBookRepo
    {
        public IEnumerable<Book> Create();

        public IEnumerable<Book> Update();
        public Author Delete(int id,Author a);
        public Book Delete(int id, Book b);
        public IEnumerable<Book> Read();
    }
}
