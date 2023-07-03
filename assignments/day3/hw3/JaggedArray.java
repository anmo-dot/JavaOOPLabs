package hw3;

public class JaggedArray {
	public static void main(String[] args) {
		String[][] arr = 
			{{"Tony", "Java", "C", "C++"},
					{"Thomas", "Java", "UNIX"},
					{"Dinil", "Linux", "Oracle"},
					{"Delvin", "RDBMS", "C#", "Oracle"},
			};
		for(int x= 0; x < 4; x++) {
			for(int y =0; y < 4;y++) {
				if("Delvin".equals(arr[x][0])) {
					System.out.print(arr[x][y] + " ");
				}
			}
		}
	}
}
