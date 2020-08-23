package function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
public static void main(String[] args) {
	int increment = increment(0);
	Integer n = incrementFunction.apply(1);
	System.out.println(n);
	System.out.println(increment);
	Integer mutilple = mutilpleBy10.apply(2);
	System.out.println(mutilple);
	Function<Integer,Integer> addBy1And10 = incrementFunction.andThen(mutilpleBy10);
	//Bifunction
	System.out.println(incrementByOneAn.apply(1, 10));
System.out.println(addBy1And10.apply(3));
}
static Function<Integer,Integer> incrementFunction = number-> number+1 ;
static Function<Integer,Integer> mutilpleBy10 = number->number*10;
static int increment(Integer number) {
	return number + 1;
}
static BiFunction<Integer,Integer,Integer> incrementByOneAn = (num1,num2)->(num1 + 1)*num2;
static int incrementByOneAndMuilple (int number, int numTo) {
	return (number + 1) * numTo;
}
}
