package gittasks.DesignPrincipals;
import java.util.Scanner;
abstract class Operations{
        abstract void getOutput(int a,int b);

}
class Add extends Operations{
        void getOutput(int x,int y){
                System.out.println("result="+(x+y));
        }
}
class Subtract extends Operations{
        void getOutput(int x,int y){
                System.out.println("result="+(x-y));
        }
}
class Multiply extends Operations{
        void getOutput(int x,int y){
                System.out.println("result="+(x*y));
        }
}
class Division extends Operations{
        void getOutput(int x,int y){
                System.out.println("result="+(x/y));
        }
}
class App{
        private static Scanner input;

		public static void main(String args[]){

                Operations op;
                input = new Scanner(System.in);
                System.out.print("Enter num1:");
                int num1=input.nextInt();
                System.out.print("Enter num2:");
                int num2=input.nextInt();
                System.out.println("Enter an operator");
                char k=input.next().charAt(0);
                switch(k)
                {
                case'+':
                        op=new Add();
                        op.getOutput(num1,num2);
                        break;
                case'-':
                        op=new Subtract();
                        op.getOutput(num1,num2);
                        break;
                case'*':
                        op=new Multiply();
                        op.getOutput(num1,num2);
                        break;
                case'/':
                        op=new Division();
                        op.getOutput(num1,num2);
                        break;
                default:
                        System.out.println("incorrect");
                }

        }
}