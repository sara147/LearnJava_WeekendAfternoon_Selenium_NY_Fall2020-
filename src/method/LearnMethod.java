package method;

public class LearnMethod {
// method have some naming convention // method name start with verb/noun ex check display
    //method syntax
    //access modifier
    //return type what will return ( all data type )
    //it can return nothing (void)
    //it can can return object and class
public static void display() {
    System.out.println("method");
}
    public int doSummation(){   //return type method
        int num1 = 50;
        int num2 = 60;
        int total = num1 + num2;
        System.out.println("total value = "+total);
        return total;
    }

    public int doSubs(){
        int num1=70;
        int num2=65;
        System.out.println("substraction = "+(num1 - num2));
        return num1- num2;
    }
    public double doSub(double num1, double num2){
        System.out.println("total Sub = "+(num1 - num2));
        return num1 -num2;
    }
    public int doDivision(){
        int num1 =25;
        int num2 = 5;
        System.out.println("division = "+ (num1/num2));
        return num1/num2;
    }

 //dynamic method
public int doMultiplication(int number1, int number2){
        int num1=number1;
        int num2= number2;
    System.out.println("TOTAL Multiplication = "+(num1*num2));
    return num1*num2;
}
   public int doSum(int number1,int number2){
       System.out.println("total summution = "+(number1 +number2));
       return number1 +number2 ;
   }
   //Non Return Method without Parameter:
    public void studentInformation(){
    String name = "John";
    String address = "Brooklyn,Ny";
        System.out.println("student name is "+ name +" the address is " + address);
    }
public void salaryCalculation(){
    int month = 12;
    double salary = 4000;
    double yearlySalary = month*salary;
    System.out.println("yearly salary " + month * salary);
}
    //Non Return Method with Parameter:
    public void doDivi(double num1 , double num2){
    double result = num1/num2;
        System.out.println("division result = "+ result);
    }
    public void stInfo(String name , String address,String dob, String phoneNumber){
        System.out.println("student name " + name+   "Address " + address+    "Dob"  +dob+   "phoneNumber"+ phoneNumber);
    }
    public static void main(String[] args) {
        LearnMethod.display();
    LearnMethod learn=new LearnMethod();
        int salary= 4000;
        double totalsalary= salary+ learn.doSummation();
        System.out.println("total salary = "+totalsalary);
        learn.doSummation();
        learn.doSubs();
    learn.doDivision();
    learn.doMultiplication(10,5);
    learn.doSum(10,70);
    learn.doSub(10.50,10.00);
    learn.studentInformation();
    learn.salaryCalculation();
    learn.doDivi( 200,30);
    learn.stInfo("sara", "Brooklyn", "11/06/1988", "91576545432");
    }


}




