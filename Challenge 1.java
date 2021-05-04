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
