import java.util.Arrays;

public class BigNum {

	public static int SIZE;
	public static int BASE;
	private static int[] BigNum;

	//public BigNum()
	//{
		//BigNum = null;
	//}

	public BigNum( String number )
	{
		for (int i=0; i < number.length()-1; i++)
		{
		
			Integer a;
			a = Integer.valueOf(number.charAt(i));
			for(int k = 0; k < 10; k++)
			{
				BigNum[k] = a;
			}
		}
	}

	//copy constructor
	/*public BigNum() {

  }*/
	public static int[] values()
	{
		return BigNum;
	}
	
	public String toString(){
		String result;
		result = "";

		return result;
	}

	public boolean equals( BigNum other ){
		return true;
	}

	public boolean isZero(){
		return true;
	}

	public static void main(String[] args) {

		BigNum c = new BigNum("123");
		
		System.out.println(34);
		}

	
}