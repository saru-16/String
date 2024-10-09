public class Str {

	public static void main(String[] args) {
		  String s="hai";	
		  String s1= new String("hai");
		  String s4= new String("hai");
		  String s3="hai";
		  String s2= new String("hello");
 	  
		  System.out.println(s==s1);
		  System.out.println(s==s3);
		  System.out.println(s.equals(s1));
		  System.out.println(s.hashCode());
		  System.out.println(s1.hashCode());		  

	}

}
