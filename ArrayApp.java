
public class ArrayApp {

	public static void main(String[] args) {
		
		String[] users = new String [3];
		
		users[0] = "egoing";				// users[index] = "element"
		users[1] = "jinhuck";
		users[2] = "youbin";
 		
		System.out.println(users[1]);
		System.out.println(users.length); // (length)칸 짜리의 배열이다.  
		
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}
}
