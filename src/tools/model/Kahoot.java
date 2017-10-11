package tools.model;

public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	private String topic;
	
	public Kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "nobody";
		this.isJumble = false;
		this.topic = "some topic";
	}
	
	public Kahoot(String creator, int questionCount, String topic)
	{
		this();
		this.creator = creator;
		this.questionCount = questionCount;
		this.topic = topic;
	}
	
//	Getters are public so they can be accessed
	
	public String toString()
	{
		String description = "This Kahoot was made by " + creator + " and has " + questionCount + " questions";
		return description;
	}
	
	public String getCreator()
	{
		return creator;
	}
	
	public String getTopic()
	{
		return topic;
	}
	
}

