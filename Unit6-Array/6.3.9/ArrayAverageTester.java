public class ArrayAverageTester
{

   public static void main(String[] args)
   {
     int[] numArray =  {12, 17, 65, 7, 30, 88};
     
     // Create an ArrayAverage object and print the result 
     ArrayAverage hi = new ArrayAverage(numArray);
     double avglast = hi.getAverage();
     System.out.println("The average of the array is " + avglast);
   }
}
