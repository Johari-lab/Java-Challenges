//CHALLENGE 2

/*Write a program called printNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. Use:

(a) a "nested-if" statement;

(b) a "switch-case-default" statement.*/

class Main {
  public static void main(String[] args) {
    /*Creating an instance of both the NestedIf and the SwitchCaseDefault classes*/
    NestedIf nestedif = new NestedIf();
    SwitchCaseDefault switchcasedefault = new SwitchCaseDefault();

    int num1 = 10;
    int num2 = 5;
    nestedif.printNumberInWord(num1);
    switchcasedefault.printNumberInWord(num1);
    nestedif.printNumberInWord(num2);
    switchcasedefault.printNumberInWord(num2);
  }
}

class NestedIf{
  public String printNumberInWord(int num) {
    String number = null;
    switch(num){
      case 1:
        number = "ONE";
        break;
      case 2:
        number = "TWO";
        break;
      case 3:
        number = "THREE";
        break;
      case 4:
        number = "FOUR";
        break;
      case 5:
        number = "FIVE";
        break;
      case 6:
        number = "SIX";
        break;
      case 7:
        number = "SEVEN";
        break;
      case 8:
        number = "EIGHT";
        break;
      case 9:
        number = "NINE";
        break;
      default:
        number = "OTHER";
    }
    System.out.println("(a) \"nested-if\" statement: " + number);
    return number;
  }
}

class SwitchCaseDefault{
  public String printNumberInWord(int num) {
    String number = null;
    if (1 == num) {
      number = "ONE";
      } else if (2 == num) {
        number = "TWO";
        } else if (3 == num) {
          number = "THREE";
          } else if (4 == num) {
            number = "FOUR";
            } else if (5 == num) {
              number = "FIVE";
              } else if (6 == num) { 
                number = "SIX";
                } else if (7 == num) {
                  number = "SEVEN";
                  } else if (8 == num) {
                    number = "EIGHT";
                    } else if (9 == num) {
                      number = "NINE";
                      } else {
                        number = "OTHER";
                        }
                        System.out.println("(b) \"switch-case\" statement: " + number)
                        ;
                        return number;
  }
}
