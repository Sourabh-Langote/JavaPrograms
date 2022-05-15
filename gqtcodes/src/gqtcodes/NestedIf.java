package gqtcodes;

public class NestedIf {

	public static void main(String[] args) {
		int salary=10000;
		int exp=3;
	    int age=25;
	    
	    if(age>=25) {
	    	if(exp>=3) {
	    		if(salary<=25000){
	    			salary=salary+5000;
	    			System.out.println("your salary is incremented");
	    			System.out.println("new salary is :"+salary);
	    		}
	    		else {
	    			System.out.println("your salary is more than 25k"); 
	    		}
	    	}
	    	else {
	    		System.out.println("your experience is less than requered");
	    	}
	    }
	    else {
	    	System.out.println("your age is less than 25");
	    }
	}

}
