using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using assignment;
class sd
{
    public static void Main(String[] args) 
    {
        assignment.Calculator calc = new Calculator();
        Console.WriteLine(calc.add(10,20));
        Console.WriteLine(calc.prod(10,20));
    }


}


