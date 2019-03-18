package exOnBench;

public class DoStuffWithLambda {
    void doStuff(IntLambda lambda, Integer a, Integer b){
            lambda.performOnInt(a,b);
    }
}
