
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
		System.out.println(shopList);
		System.out.println(newShopList);
		
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
	
	public static String[] doubled(String[] arr1)
	{
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = arr1[i] + arr1[i];
		}
		
		return arr1;
	}
	
	public static String[] printArray(String[] arr1)
	{
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
