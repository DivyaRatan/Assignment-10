public class sub1 extends base1{
  int num1,num2;
  sub1(){
	  super(20);
	  System.out.println("This is dfault constructor");
  }
  sub1(int num){
	  super(num);
	  System.out.println("This is parametrised constructor with one parameter");
  }
  sub1(int num1,int num2){
	  super(num1);
	  System.out.println(num2);
	  System.out.println("This is parametrised constructor with two parameter");
  }
}
