package mgl7361automne2011;

	import java.io.*;

	public class TraceStack
	{
	    private FileWriter outFile;
	    private PrintWriter output;
	    
	    TraceStack(String filename) throws IOException
	    {
	        try
	        {
	            outFile = new FileWriter(filename);
	            output = new PrintWriter(outFile);
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	    
	    public void addLine(String text)
	    {
	        System.out.println(text);
	        output.println(text);
	    }
	    
	    public void close()
	    {
	        output.close();
	    }
	}


