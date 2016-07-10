import java.util.*;
public class KangarooJump {
	
	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int x1 = in.nextInt();
	        int v1 = in.nextInt();
	        int x2 = in.nextInt();
	        int v2 = in.nextInt();
	        
	        in.close();
	        
	        int flag =0;
	        
	        if (x2 > x1 && v2 > v1)    flag = 0;
	        if (x1 > x2 && v1 > v2)    flag = 0;
	        
	        if(x1==x2) {
	            flag = 1;
	        }
	        else{
	          
	        	for(int i=0; i<10000; i++){
	            
	        		x1 += v1;
	        		x2 += v2;

	        		if(x1==x2){ 
	        			flag = 1;
	        			break;
	        		}    
	        	}
	            
	        }
	        if(flag == 1)
	           System.out.println("YES");
	        else
	            System.out.println("NO");
	   }
}

