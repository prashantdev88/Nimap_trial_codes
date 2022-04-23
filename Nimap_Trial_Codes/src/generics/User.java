package generics;

public class User implements Comparable<User>{

	private int points;
	
	public User(int points) {
		this.points = points;
	}
	
	
//	@Override
//	public int compareTo(User o) {
//		if(o.points > points) {
//			return o.points;
//		}else {
//			return this.points;
//		}
//		
//	}
	
	
	@Override
	public int compareTo(User o) {
		return this.points - o.points;
	}
	
	public String toString() {
		return this.points+ " CLASS";
	}

}
