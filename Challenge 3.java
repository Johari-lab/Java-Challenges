//CHALLENGE 3

/*Write a method called checkOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.

Hint: n is an even number if (n % 2) is 0; otherwise, it is an odd number. Use == for comparison, e.g., (n % 2) == 0*/

class Main{
  public static void main(String[] args){
    //Creating an instance of the CheckOddEven class
    CheckOddEven checkoddeven = new CheckOddEven();

    int num1 = 3;
    int num2 = 10;
    checkoddeven.checkOddEven(num1); //Odd
    checkoddeven.checkOddEven(num2); //Even
  }
}

class CheckOddEven{
  public void checkOddEven(int num) { 
    if(num % 2 == 0){
      System.out.println(num + " is an Even Number");
    }else{
      System.out.println(num + " is an Odd Number");
      }
  }
}
