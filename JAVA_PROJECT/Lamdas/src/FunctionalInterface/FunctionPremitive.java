package FunctionalInterface;

public class FunctionPremitive {
@FunctionalInterface
public interface ShortToByteFunction{
	byte applyAsByte(short s);
}
public byte[] transformArray(short[] array, ShortToByteFunction function) {
	byte[] transformedArray = new byte[array.length];
	for(int i = 0 ;i<array.length;i++) {
	//	transformedArray = function.applyAsByte(array[i]);
		
	}
	return transformedArray;
}
}
