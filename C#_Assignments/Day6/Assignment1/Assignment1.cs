using System;
using System.Collections.Generic;
using System.Diagnostics.PerformanceData;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment3
{
    public class Assignment1
    {
        static int digitAdd(int x , out int y)
        {
            int sum = 0;
            y=0;
            while (x > 0)
            {
                int r = x % 10;
                sum+= r;
                x /= 10;
                y++;
            }
            Console.WriteLine(sum);
            return y;
        }/*
        static void Main(string[] args)
        {
            Console.WriteLine(digitAdd(123, out int Count));
        }*/
    }
    public class Assignment2
    {
        static int[] evenNo(int x, out int y) {
            y = 0;
            int[] even = new int[x/2+1];
        for(int i = 0; i <= x; i++)
            {
                if(i%2==0)
                {
                    even[y++] = i;
                    
                }
            }
        Console.WriteLine("Count ={0}",y);
            return even;
        }

/*        static void Main(String[] args)
        {
            int[] even = evenNo(10, out int y);
            
            foreach(int i in even)
            {
                Console.WriteLine(i);
            }
        }*/
    }
    


}

