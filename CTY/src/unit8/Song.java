package unit8;

public class Song 
{
	private String name;
	private String recordingArtist;
	private String category;
	private double price;
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setRecordingArtist(String recordingArtist)
	{
		this.recordingArtist = recordingArtist;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getRecordingArtist()
	{
		return recordingArtist;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public Song(String name, String recordingArtist, String category, double price)
	{
		
	}
}
