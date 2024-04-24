public class RandomLetterChooser extends RandomStringChooser
{
	private String [] k;
	private ArrayList <String> arr;
	public RandomLetterChooser(String str)
	{ 
		/* to be implemented in part (b) */
		k = getSingleLetters(str);
		arr = new ArrayList <String> ();
		for(String a:k)
			arr.add(a);
		
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
