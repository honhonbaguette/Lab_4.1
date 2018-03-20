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
	
	public  Cards deal()
	{
		if (!(unDealt.isEmpty()))
		{
			Cards top = unDealt.remove(0);
			Dealt.add(top);
			return top; 
		}

		else return null;

	}

	public void shuffle()
	{
		unDealt.addAll(getDealt());
		
		for (int k = 1; k < 52; k++)
		{
			int r = (int)(Math.random()*k);
			Cards temp = unDealt.get(r);
			unDealt.set(r, unDealt.get(k));
			unDealt.set(k, temp);
		}

	}

	public ArrayList<Cards> getUnDealt() {
		return unDealt;
	}

	public void setUnDealt(ArrayList<Cards> unDealt) {
		this.unDealt = unDealt;
	}

	public ArrayList<Cards> getDealt() {
		return Dealt;
	}

	public void setDealt(ArrayList<Cards> dealt) {
		this.Dealt = dealt;
	}
}
