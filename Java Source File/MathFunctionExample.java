import java.lang.Math;

class MathFunctionExample{
	public static void main(String args[]){
		
		//abs() returns the absolute value of parameter value.
		System.out.println("abs(): " + Math.abs(40.123));
		
		//cbrt() returns the cube root of the parameter.
		System.out.println("cbrt(): " + Math.cbrt(27));
		
		//sqrt() returns the square root of the parameter.
		System.out.println("sqrt(): " + Math.sqrt(16));

		//signum() returns the sign of the parameter.
		System.out.println("signum(): " + Math.signum(0));
		System.out.println("signum(): " + Math.signum(-15));
		System.out.println("signum(): " + Math.signum(15));

		//rint() returns the double value that is closest to parameter that is equal to  mathematical integer.
		System.out.println("rint(): " + Math.rint(1.4));
		System.out.println("rint(): " + Math.rint(1.6));

		//ceil() returns the value of parameter rounded upto its nearest integer.
		System.out.println("ceil(): " + Math.ceil(-0.8));
		System.out.println("ceil(): " + Math.ceil(0.8));

		//floor() returns the value of parameter rounded down to its nearst parameter.
		System.out.println("floor(): " + Math.floor(5.6));

		//random() returns the random number between 0 and 1.
		System.out.println("random(): " + Math.random());

		//pow() returns the value of paramter one to power of parameter two.
		System.out.println("pow(): " + Math.pow(5,3));

		//min() returns the number with the lowest value.
		System.out.println("min(): " + Math.min(-22,22));


		//max() returns the number with the highest value.
		System.out.println("max(): " + Math.max(-22,22));

		//copySign() returns the first the first floating parameter with the sign of second floating parameter.
		System.out.println("copySign(): " + Math.copySign(5,-3));
		
		// Euler's value : 2.178.

		//exp() returns the value of e^x.
		System.out.println("exp(): " + Math.exp(2));

		//expm1() returns the value of e^x-1.
		System.out.println("expm1(): " + Math.expm1(2));

		//getExp() returns the unbiased exponent used in parameter.
		System.out.println("getExponent(): " + Math.getExponent(1234.5678));

		//hypot() returns squareroot(x^2 + y^2) without intermediate of overflow or underflow.
		System.out.println("hypot(): " + Math.hypot(2,3));
		
		//IEEEremainder() returns the IEEE754 standard value.
		System.out.println("IEEEremainder(): " + Math.IEEEremainder(10,3));
		System.out.println("IEEEremainder(): " + Math.IEEEremainder(10,10));

		//nextAfter() returns the floating number adjacent to the parameter 1 in the direction to the parameter 2.
		System.out.println("nextAfter(): " + Math.nextAfter(2,5));

		//nextUp() returns the floating point value adjacent to parameter in the direction of positive infinity.
		System.out.println("nextUp(): " + Math.nextUp(2));

		//round() returens the value of parameter rounded to its nearst integer.
		System.out.println("round(): " + Math.round(2.5));

		//
		System.out.println("acos(): " + Math.acos(-1));

		//
		System.out.println("asin(): " + Math.asin(-1));

		//
		System.out.println("atan(): " + Math.atan(-1));

		//
		System.out.println("atan2(): " + Math.atan2(1,2.5));

		//
		System.out.println("cos(): " + Math.cos(1));

		//
		System.out.println("cosh(): " + Math.cosh(1));

		//
		System.out.println("log(): " + Math.log(10));

		//
		System.out.println("log10(): " + Math.log10(10));

		//
		System.out.println("log1p(): " + Math.log1p(10));

		//
		System.out.println("tan(): " + Math.tan(1));

		//
		System.out.println("tanh(): " + Math.tanh(1));

		//
		System.out.println("toDegrees(): " + Math.toDegrees(Math.PI/4));

		//
		System.out.println("toRadians(): " + Math.toRadians(45));

		//
		System.out.println("ulp(): " + Math.ulp(1));





	}
}