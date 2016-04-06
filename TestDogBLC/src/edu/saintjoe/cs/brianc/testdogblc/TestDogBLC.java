package edu.saintjoe.cs.brianc.testdogblc;

// class is named TestDogBlc
public class TestDogBLC {
// represents the TestDogBlc's name, also a string object
	    private String name;
	    // is the TestDogs size, called weight 
	    private int weight;
	   // is an instance method for name 
	    public void setName(String newName) {
	    	name = newName;
	    }
	    // is an instance method for its size
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    
	    //calls the operation of its name from above and returns the value of the name
	    public String getName() {
	    	return name;
	    }
	    // calls the operation of its size from above and returns the value of its weight 
	    public int getWeight() {
	    	return weight;
	    }
	    // starts the local scope of bark()
	    public void bark() {
	    // have to give int a value 
	    	int pointless = 0;
	    	
	    	// tells the operation what to do and when to do it depending on the int
	    	if (weight > 60 ) {
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }
	    // local variable
	    public int setBoth(String newName, int newWeight) {
	    	
	    	int oldWeight = weight;
	    	
	    	name = newName;
	    	weight = newWeight;
	    	return oldWeight;
	    }
	    	
// make eat() public and has no return value
	    public void eat() { }
	    // make chaseCAt() public and has no return value
	    public void chaseCat() { }
	}

