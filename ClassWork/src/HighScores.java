
public class HighScores
{
	private String name;
	private int score;
	
	public HighScores(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getScore()
	{
		return score;
	}

	public String toString()
    { 
    	return "Highscore [Name = " + name + "   Score = " + score + "]";
    }
}
