package function_redo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
public static void main(String[] args) {
	System.out.println(mutipleByOnef.andThen(mutiplePlus).apply(5));
	System.out.println(bi.apply(4, 5));
}
static Function<Integer,Integer> mutipleByOnef = num->num + 1;
static int mutilpleByOne( int num) {
	return num+1;
}
static Function<Integer,Integer> mutiplePlus = num->num *10;
static BiFunction<Integer,Integer,Integer> bi= (num1,num2)->num1+num2;

}
