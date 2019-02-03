package Streams;

import java.io.*;

public class FileCopy
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream is = null;
		FileOutputStream os = null;
		
		try 
		{
			is = new FileInputStream(args[0]);
			os = new FileOutputStream(args[1]);
			byte [] buffer = new byte[1024];
			int value;
			while((value = is.read(buffer, 0, 1024)) > 0)
			{
				os.write(buffer, 0, value);
			}
		
		}finally {
			is.close();
			os.close();
		}
		
		}
	}


