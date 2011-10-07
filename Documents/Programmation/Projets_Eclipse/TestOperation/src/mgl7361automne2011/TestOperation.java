package mgl7361automne2011;

import java.io.IOException;
import java.util.Arrays;

public class TestOperation {


		public double operandeA;
		public double operandeB;
		public Object execute;
		public double addTestOperations;
		private String traceFilename;
		private double testFalse;
		//private Arrays listTestOperations;
		
		
		TestOperation()
	    {
			testFalse = 0; 
			
			// = new ArrayList<TestOperations>();
	  traceFilename = "c://traceGamma.txt";
	    }
		
		
		TestOperation(String filename)
	    {
			testFalse = 0;
	        traceFilename = filename;
	        
	    }
		
		   TestOperation (double a, double b){
		   operandeA = a;
		   operandeB = b;
		     }
		 public TestOperation(Object a, Object b) {
			// TODO Auto-generated constructor stub
		}


		public double addition  (){ 
		  double s;
		   s = operandeA + operandeB;
		  return s;
		  
		 }
		 public double soustraction  (){
			 double  s1;
			if (operandeA > operandeB) {
				s1 = operandeA - operandeB;
			}
			else{
				s1 = operandeB - operandeA;
			}
			 return s1;
			 
		 }
		 public double multiplication (){
			 double m ;
			 m =1;
			 m =operandeA * operandeB;
			 return m;
			 
		 }
		 public double division (){
			 double div = 0 ;
		 
			if (operandeA!= 0 && operandeB ==0 ){
				
			div = operandeA / operandeB;
		 }
			else{ 
				
		div = operandeA / operandeB;
			}
		return div;
	
		 } 
		 
		 public void executeTestOperations() {
			// TODO Auto-generated method stub
			
		}
			
		    }

		 
		//public void executeTestOperations() {
			
			   //{
		       
		        //{
		           // if (TestOperation.assertTrue() == true)
		            //{
		               // addTestOperations++;
		           // }
//		        }
		       
		   // }
//		}
		// static boolean assertTrue() {
			// TODO Auto-generated method stub
			// false;
				//}
			
		//}
		
		 

		 

