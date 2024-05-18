import java.io.File;

public class HelloWorld 
{

	public static void main(String[] args) 
	{
		FileUtility fileUtil = new FileUtility();
		System.out.println("Hello World");
		
		File projectDirectory = new File(System.getProperty("user.dir"));
		String FilesFolderPath = projectDirectory.getParent();
        String filePath = FilesFolderPath + "/Files/Data1.txt"; 
        
        fileUtil.OpenFile(filePath);
	}

}
