package Day3;

public class String {
	class Main {
	    public static void main(String[] args) {
	        java.lang.String name = "manut";
	        int n= name.length();
	        int count= 0;
	        int count1=0;
	        for(int i=0;i<n;i++){
	            System.out.println(name.charAt(i));
	            if(name.charAt(i)=='a' || name.charAt(i)=='i' || name.charAt(i)=='e' || name.charAt(i)=='o' || name.charAt(i)=='u')
	                count++;
	       
	           else if(name.charAt(i)>='a'&& name.charAt(i)<='z') {
	               count1++;
	           
	               
	           }
	               
	        }
	       
	        System.out.println(count);
	        System.out.println(count1);
	       
	               
	               
	                }
	}
	               
	       // System.out.println(name.charAt(0));
	       
	       
	       
	       // System.out.println(name);


}
