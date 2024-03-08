package week1.Day2;

public class Browser 
{
	public String launchBrowser() 
	{
		// TODO Auto-generated method stub
        return "Browser Launced Succesfully";
	}
    public String loadURL() 
    {
		// TODO Auto-generated method stub 
        return "Application URL Loaded Succesfully";
	}
    public static void main(String[] args) 
    {
		Browser web = new Browser();
		
		System.out.println(web.launchBrowser());
		System.out.println(web.loadURL());
	}
}
