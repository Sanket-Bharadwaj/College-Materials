package Assignment_IO_FileManagement;

import java.io.*;

public class Q10 {
	
		public static void main(String args[])
		{
			try {
					FileReader fr = new FileReader("E:\\CSW\\CSW2\\String\\src\\Assignment_IO_FileManagement\\diary.txt");
					int ch;
					while((ch=fr.read())!=-1)
						{
							System.out.print((char)ch);
						}
					fr.close();
				}
			
			catch(Exception e)
				{
					System.out.println("File not found");
				}
		}

}

