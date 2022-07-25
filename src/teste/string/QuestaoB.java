package teste.string;

public class QuestaoB {
	
	public static void main(String[] args) {
		
		String str = "Matheus";
	    System.out.println(str);
	    StringBuilder test = new StringBuilder();
	    for (int i = (str.length() - 1); i >= 0; i--){
	      test.append(str.charAt(i));
	    }
	    System.out.println(test);
	  }
	
}


