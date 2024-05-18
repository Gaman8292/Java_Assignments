
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.File;

public class FileUtility 
{

	
	
	public void OpenFile(String filePath)
	{		
		try 
		{
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }
            reader.close();

        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
	}

}
