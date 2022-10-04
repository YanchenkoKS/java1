package ru.gb.yanchenko.lesson1;

public class HomeWork1
{
    private static float abcdMethod (int a, int b, int c, int d)
    {
        float cf = c;
        return a * (b + (cf / d));
    }

   private static boolean checkFromTenYoTwenty (int x, int y)
   {
       int sumxy = x + y;
       if (sumxy >= 10 && sumxy <=20)
       {
           return true;
       }
       else
       {
           return false;
       }
   }

   private static void checkPositiveOrNegative (int q)
   {
       if (q >= 0)
       {
           System.out.println (q + " is positive number");
       }
       else if (q < 0)
       {
           System.out.println (q + " is negative number");
       }
   }

   private static String helloName (String name)
   {
       return "Привет, " + name + "!";
   }

    private static String checkLeapYear (int year)
    {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
        {
            return (year + " год - не високосный");
        }
        else
        {
            return (year + " год - високосный");
        }
    }
//   {
//       if (year % 400 == 0)
//       {
//           return (year + " год - високосный");
//       }
//       else if (year % 100 == 0 )
//       {
//           return (year + " год - не високосный");
//       }
//       else if (year % 4 == 0)
//       {
//           return (year + " год - високосный");
//       }
//       else
//       {
//           return (year + " год - не високосный");
//       }
//   }


    public static void main (String[] args)
    {
        System.out.println(abcdMethod(3,2,3,6));
        System.out.println (checkFromTenYoTwenty(2,15));
        System.out.println (checkFromTenYoTwenty(1,3));
        System.out.println (checkFromTenYoTwenty(11,13));
        checkPositiveOrNegative (-33);
        checkPositiveOrNegative (0);
        checkPositiveOrNegative (23);
        System.out.println (helloName("Вася"));
        System.out.println (checkLeapYear(2000));
        System.out.println (checkLeapYear(1900));
        System.out.println (checkLeapYear(2024));
        System.out.println (checkLeapYear(235));
    }
}
