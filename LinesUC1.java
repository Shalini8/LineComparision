public class LinesUC1 {
			static double points(int x1, int x2, int y1, int y2 ) {		
		    double dis;
		    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
		    return dis;
	}
	 public static void main(String argS[])	
			{
	        double c;
			c = points(2,3,4,5);
			System.out.println("distancebetween the lines is "  +c);
    
		}
}    

