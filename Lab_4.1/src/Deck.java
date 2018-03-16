import java.util.ArrayList;

public class Deck 
{
	private static ArrayList<Cards>unDealt = new ArrayList<Cards> ();
	private static ArrayList<Cards>Dealt = new ArrayList<Cards> ();
	
	public Deck(String[] Rank, String[] Suit, int[] Value)
	{
		for (int i = 0; i < Rank.length-1; i++)
		{
			for (int x = 0; x < Suit.length-1; x++)
			{
				unDealt.add(0, new Cards(Rank[i], Suit[x], Value[i]));
			}
		}
	}
	
	public static boolean empty()
	{
		if (unDealt.size() == 0)
		{
			return true;
		}
		else return false;
	}
	
	public static int size()
	{
		return unDealt.size();
	}
}
