package edu.saintjoe.cs.brianc.testdogblc;

public class TestDogBLC {

	    private String name;
	    
	    private int weight;
	    	    
	    public void setName(String newName) {
	    	name = newName;
	    }
	    
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    

	    public String getName() {
	    	return name;
	    }
	    
	    public int getWeight() {
	    	return weight;
	    }
	    
	    public void bark() {
	    
	    	int pointless = 0;
	    	
	    	
	    	if (weight > 60 ) {
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }
	    
	    public int setBoth(String newName, int newWeight) {
	    	
	    	int oldWeight = weight;
	    	
	    	name = newName;
	    	weight = newWeight;
	    	return oldWeight;
	    }
	    	

	    public void eat() { }
	    
	    public void chaseCat() { }
	}

