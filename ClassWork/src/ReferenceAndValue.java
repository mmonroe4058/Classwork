
public class ReferenceAndValue {

	public static void main(String[] args)
	{
		int y = 3;
		int z = doubled(y);
		
		String foo = "foo";
		String foofoo = doubled(foo);
		
		String[] shopList = {"Apples", "Bananas", "Coffee"};
		String[] newShopList = doubled(shopList);
		
		System.out.println(foo);
		System.out.println(foofoo);
		printArray(shopList);
		printArray(newShopList);
		
	}
	
	public static int doubled(int x)
	{
		x = x + x;
		return x;
	}
	
	public static String doubled(String str1)
	{
		str1 = str1 + str1;
		return str1;
	}
	
	/*
	public static String[] doubled(String[] arr1)
	{
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = arr1[i] + arr1[i];
		}
		
		return arr1;
	}
	*/
	
	public static String[] doubled(String[] arr1)
	{
		String[] test = new String[arr1.length];
		
		for(int i = 0; i < test.length; i++)
		{
			test[i] = arr1[i] + arr1[i];
		}
		
		return test;
	}
	
	
	private static void printArray(Object[] arr1)
	{
		for(Object x : arr1)
		{
			System.out.println(x);
		}
	}
	
	/*

	private static void printArray(Object[] arr1)
	{
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
	 */

}
