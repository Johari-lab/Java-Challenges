//CHALLENGE 4

/*Write a method average that returns the average of the integer in the list. You can assume that the list has at least one element*/

class Main {
  public static void main(String[] args) {
    //Creating an instance of the Average class
    Average avg = new Average();

    Integer[] numList1 = {23,5,9,8}; //new list: numList1
    avg.average(numList1); //11.25
  }
}

class Average{
  public double average(Integer[] numList) { 
    
    /*Let's declare total variable, that represents the sum of all elements in the list, and initilize it with 0*/
    double total = 0.0; //or double total = 0d;
    for(int i : numList){
      total += i; 
    }

    /*Declaring the variable avg, the average of the integer in the list*/
    double avg = total/numList.length;

    //Printing the average with 2 decimals
    System.out.format("The average is: %.2f", avg);
    return avg;
  }
}
