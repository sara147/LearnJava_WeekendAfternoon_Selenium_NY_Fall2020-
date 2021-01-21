public class ConditionalOperator {

    // && conditional AND : All condition must have to be true then it will execute  block of code
    // || Conditional OR : If one condition then a lot of code will be execute

    // Pipemain
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        if (num1 == num2) {
            // If condition is false then it will not execute if block of code
            System.out.println(" number 1 is small than number 2 ");
        }
        if (num1 == 55 && num2 == 68) {

            System.out.println("we are comparing two numbers ");
        }
        if (num1 == 50 && num2 == 60) {

            System.out.println(" we are comparing two numbers ");
        }
        if (num1 == 55 || num2 == 60){
            System.out.println(" we are comparing two numbers using or operator");
        }


    }




}


