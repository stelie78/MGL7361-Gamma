package mgl7361automne2011;



public class TestOperation1 {

	 public static void main(String[] args) {
		  double valeur  ; 
		  double valeur1;
		  double valeur2;
		  double valeur3;
		  
		  TestOperation mesOperations = new TestOperation(2,10);
		  mesOperations.addTestOperations = mesOperations.addition();  
		  mesOperations.addTestOperations = mesOperations.soustraction();
		  mesOperations.addTestOperations = mesOperations.multiplication();
		  mesOperations.addTestOperations = mesOperations.division();
		  mesOperations.executeTestOperations();
		  
		 
		  valeur = mesOperations.addition();
		  valeur1 = mesOperations.soustraction();
		  valeur2= mesOperations.multiplication(); 
		  valeur3= mesOperations.division();
		  
		  System.out.println("Commencer à afficher les tests :");
		  System.out.println(" valeur " + valeur +" ok");
		  System.out.println(" valeur " + valeur1 + " ok "); 
		  System.out.println(" valeur " + valeur2 + " ok ");
		  System.out.println(" valeur " + "impossible" + " valeur " + valeur3 + " Erreur "); 
		  // TODO Auto-generated method stub*/
		 }
		}

	 
	


