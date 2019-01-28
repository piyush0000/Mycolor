package jan28;
import java.util.*;
public class Mycolor {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String arrcolors[]= {"white","yellow","orange","red","pink","purple","blue","cyan","green","dark green","brown","light grey","medium grey","dark grey","black"};
		System.out.println("Choose from the following colors-");
		for(int i=0;i<15;i++)
		{
			System.out.println(arrcolors[i]);
		}
		String yourcolor=input.next();
		Random rd=new Random();
		int j=rd.nextInt(arrcolors.length);
		do{   
			System.out.println(arrcolors[j]);
			j=rd.nextInt(arrcolors.length);
		}while(!arrcolors[j].equals(yourcolor));
	}
}
