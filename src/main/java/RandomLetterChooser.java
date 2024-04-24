public class RandomLetterChooser extends RandomStringChooser
{
	private ArrayList <String> arr;
	public RandomLetterChooser(String str)
	{ 
		/* to be implemented in part (b) */
		arr = new ArrayList <String> ();
		for(String str:this.getSingleLetters(str))
			arr.add(str);
		
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
