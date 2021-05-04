//CHALLENGE 1

/*Write a method maximum that returns the largest integer in the list. You can assume that the list has at least one element*/

class Main {
  public static void main(String[] args){
    //Creating an instance of the Maximum class
    Maximum max = new Maximum();

    /*Let's crate two lists (named list1 and list2) composed by 3 and 4 elements respectively*/
    Integer[] list1 = {1, 3, 5}; 
    Integer[] list2 = {5, 6, 7, 8};

    /*Printing the maximum integer on the lists list1 and list2*/
    max.maximum(list1); //5
    max.maximum(list2); //8
  }
}

class Maximum{
  public Integer maximum(Integer[] numList) { 
    //https://www.javatpoint.com/int-vs-integer-java

    /*Let's create the maximum variable. Our guess is that the first integer on the numList is the largest*/
    int maximum = numList[0];

    /*Let's look at the rest of the numbers in numList one by one with the help of a for loop. For each one, we will test whether or not it's larger than our current guess of the largest number and if it is, we will make that number our new guess*/
    for (int i : numList) {
      if (i > maximum)
      maximum = i;
      }

      System.out.println("Maximum integer in the list: " + maximum);
      return maximum;
      /*After looking at all the integers in numList, our most recent guess will be the actual largest number in the entire list*/
  }
}
