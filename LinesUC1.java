public class LinesUC1 {
	static double points(int x1, int x2, int y1, int y2 ) {		
       double dis;
      dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
       return dis;
	}

  public static void main(String args[])	
	{
     		 double c, d;
	c = points(2,3,4,5);
	d = points(10,5,3,2);
		String s=String.valueOf(c);
		String s1=String.valueOf(d);
     System.out.println("length of 1st line" +c);
     System.out.println("length of 2nd line" +d);  
		if (s.equals(s1)) {  
	            System.out.println("both lines are equal");  
		    	}
	            else {
	        	System.out.println("both lines are unequal");     
	            }  
		    
		}
		
	}

