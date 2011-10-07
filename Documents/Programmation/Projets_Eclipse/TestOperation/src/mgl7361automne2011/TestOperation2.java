package mgl7361automne2011;
import java.util.ArrayList;
import java.io.*;

public class TestOperation2 {

	    private int testFalse;
	    private ArrayList<TestOperations> listTestOperations;
	    private String traceFilename;
	    
	    TestOperation2()
	    {
	        testFalse = 0;
	        listTestOperations = new ArrayList<TestOperations>();
	        traceFilename = "c://traceGamma.txt";
	    }
	    
	    TestOperation2(String filename)
	    {
	        testFalse = 0;
	        listTestOperations = new ArrayList<TestOperations>();
	        traceFilename = filename;
	    }
	    
	    public void addTestOperations(Object a, Object b)
	    {
	        listTestOperations.add(new TestOperations(a, b));
	    }

	    public void executeTestOperations()
	    {
	        String text;
	        
	        try
	        {
	            TraceStack trace = new TraceStack(traceFilename);
	            trace.addLine("Commencer à realiser les tests :");
	        
	            for (TestOperations test : listTestOperations)
	            {
	            text = " - Addition entre " + test.getObjectA() + " et " + test.getObjectB();
	            
	            text = " - soustraction entre " + test.getObjectA() + " et " + test.getObjectB();
	            
	            text = " - Multiplication entre " + test.getObjectA() + " et " + test.getObjectB();
	            
	            text = " - division entre " + test.getObjectA() + " et " + test.getObjectB();
	            
	                if (test.assertTrue() == false)
	                {
	                    testFalse++;
	                    trace.addLine(text + " ... Erreur");
	                }
	                else
	                {
	                    trace.addLine(text + " ... OK");
	                }
	            }
	            
	            trace.addLine(listTestOperations.size() + " test(s) Réalisés), " + testFalse + " test(s) echec(s)");
	            trace.close();
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	}