using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace LinQAssi
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var v = new[] { new {Name = "Mac's Coffee", Description = "Coffee with TEETH",
                                         NumberInStock = 24},
                            new {  Name = "Milk Maid Milk",Description = "Milk cow's love",
                                            NumberInStock = 100},
                            new {  Name = "Pure Silk Tofu",  Description = "Bland as Possible",
                                            NumberInStock = 120},
                            new {  Name = "Cruchy Pops",  Description = "Cheezy, peppery goodness",
                                        NumberInStock = 2},
                            new {  Name = "RipOff Water",   Description = "From the tap to your wallet",
                                        NumberInStock = 100},
                            new {  Name = "Classic Valpo Pizza", Description = "Everyone loves pizza!",
                                    NumberInStock = 73},};
            var pro = from i in v select i;
            foreach(var i in pro)
            {
                Console.WriteLine(i);
            }
            var a = from i in v select i.Name;
            foreach(var i in a)
            {
                Console.WriteLine(i);
            }
            var b = from i in v select new {i.Name,i.Description, i.NumberInStock };
            foreach (var i in b)
            {
                Console.WriteLine(i);
            }
            
            var c = from i in v where i.NumberInStock == 100 select i;
            foreach (var i in c)
            {
                Console.WriteLine(i);
            }
            
            var d = pro.Where(i=>i.Name.Contains('s')).OrderBy(i=>i.Name).Select(i=>i);
            foreach (var i in d)
            {
                Console.WriteLine(i);
            }

            var e =pro.Where(i=>i.Name.Contains('s')).OrderByDescending(i=> i.Name).Select(i=>i);
            foreach (var i in e)
            {
                Console.WriteLine(i);
            }

            var f = pro.Where(i => i.NumberInStock < 100).Select(i => i).Count();
            Console.WriteLine(f);
            

            var g = pro.Select(i => i.NumberInStock).Max();
            Console.WriteLine(g);
            var h = pro.Select(i => i.NumberInStock).Min();
            Console.WriteLine(h);
            var j = pro.Select(i => i.NumberInStock).Average();   
            Console.WriteLine(j);
        }
    }
}
