package buildingInterfaceFwork;

public interface WrapperMethods {
	
	public void launchBrowser(String url);
	
	//By enter
	
	public void enteById (String locatorValue, String data);
	
	public void enteByName (String locatorValue, String data);

    public void enteByClass (String locatorValue, String data);

    public void enteByLinktext (String locatorValue, String data);

    public void enteByXpath (String locatorValue, String data);
    
    
    // By click
    
    public void clickById (String locatorValue);

    public void clickByName (String locatorValue);
    
    public void clickByClass(String locatorValue);
    
    public void clickByLinktext (String locatorValue);
    
    public void clickByXpath (String locatorValue);
    
    
    // By VisibleText
    
    public void selectVisibleTextById(String Id, String data);
    
    public void selectVisibleTextByName(String Name, String data);
    
    public void selectVisibleTextByClass(String Class, String data);
    
    public void selectVisibleTextByLinktext(String Linktext, String data);
    
    public void selectVisibleTextByXpath(String Xpath, String data);
    
    //By Index
    
    public void selectIndexById(String Id, int value);
    
    public void selectIndexByName(String Name, int value);
    
    public void selectIndexByClassName(String ClassName, int value);
    
    public void selectIndexByLinktext(String Linktext, int value);
    
    public void selectIndexByXpath(String Xpath, int value);
    
    // By GetText
    
    public void verifyTextById(String Id);
    
    public void getTextByName(String Name);
    
    public void getTextByClass(String Class);
    
    public void getTextByXpath(String Xpath);
    
    



}