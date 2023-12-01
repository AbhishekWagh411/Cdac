using Microsoft.AspNetCore.Mvc;

namespace ASP_book_Assignment.Models
{
    public class BookService : IBookRepo
    {
        public  readonly BookContext Context;
        public BookService(BookContext context) {
        Context = context;
        }

        public IEnumerable<Book> Create()
        {
            throw new NotImplementedException();
        }

        public Book Delete(int id, Book b)
        {
           Book book= Context.Find<Book>(id);
            
            if(book!=null)
            {
                Context.Remove(book);
                Context.SaveChanges();
            }
            return book;
        }

        public Author Delete(int id, Author b)
        {
            Author author= Context.Find<Author>(id);
            if (author != null)
            {
                Context.Remove(author);
                Context.SaveChanges();
            }
            return author;

        }

        public IEnumerable<Book> Read()
        {
            return Context.Book;
        }

        public IEnumerable<Book> Update()
        {
            throw new NotImplementedException();
        }
    }
}
