package exOnBench;

public class Main {

    public static void main(String[] args) {

        IntLambda intLambdaAdd = (x,y) -> System.out.println(x+y);
        IntLambda intLambdaSub = (x,y) -> System.out.println(x-y);
        IntLambda intLambdaMul = (x,y) -> System.out.println(x*y);
        IntLambda intLambdaDiv = (x,y) -> {
          try{
              System.out.println(x/y);
          }catch(ArithmeticException e){
              System.out.println(e);
          }
        };

        DoStuffWithLambda doStuffWithLambda = new DoStuffWithLambda();
        doStuffWithLambda.doStuff(intLambdaAdd,5,10);
        doStuffWithLambda.doStuff(intLambdaSub,5,10);
        doStuffWithLambda.doStuff(intLambdaMul,5,10);
        doStuffWithLambda.doStuff(intLambdaDiv,5,0);
    }


}

