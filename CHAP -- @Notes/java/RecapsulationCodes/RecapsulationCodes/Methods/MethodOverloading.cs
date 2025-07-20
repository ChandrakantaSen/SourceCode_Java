﻿/* Example: Method Overloadings */
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RecapsulationCodes
{

    public class Math2
    {
        // This one's for squares
        public static double Area(double side)
        {
            return side * side;
        }

        // This one's for rectangles
        public static double Area(double length, double height)
        {
            return length * height;
        }
    }

    class MethodOverloading
    {
        public static void Main()
        {
            Console.WriteLine("Here's the area of the square: {0}",
            Math2.Area(10));
            Console.WriteLine("Here's the area of the rectangle: {0}",
            Math2.Area(10, 5));

            Console.WriteLine();
            Console.WriteLine("Please any key to continue...!");
            Console.ReadKey(true);
        }
    }
}