
public class Cards 
{
	public String Rank;
	public String Suit;
	public int pointValue;
	
	public Cards(String Rank, String Suit, int pointValue)
	{
		this.Rank = Rank;
		this.Suit = Suit;
		this.pointValue = pointValue;
	}
	
	public String getRank()
	{
		return Rank;
	}
	
	public void setRank()
	{
		this.Rank = Rank;
	}
	
	public String getSuit()
	{
		return Suit;
	}
	
	public void setSuit()
	{
		this.Suit = Suit;
	}
	
	public int getpointValue()
	{
		return pointValue;
	}
	
	public void setpointValue()
	{
		this.pointValue = pointValue;
	}
	
	@Override
	public String toString() {
		return "This is a" + getRank() + "of" + getSuit() + "valued at" + getpointValue();
	}
}
