package mySimpleSpringAppp;


public class Fruit 
{
	private String myName;
	
	public String getMyName() 
	{
		return myName;
	}
	
	public void setMyName(String myName)
	{
		this.myName = myName;
	}
	public Fruit(String pName)
	{
		setMyName(pName);
	}
	public Fruit() {}
	public String talkAboutYourself()
	{
		String speech= "Hi I  am a fruit.I come from plants and trees with seeds...";
		if(myName!=null && myName!="") speech=speech+"My name is: "+ myName;
		return speech;
	}

}




