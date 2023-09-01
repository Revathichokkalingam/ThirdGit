package qa.ProjectsJNJ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input:  arr[] = {1, 2, 0, 4, 3, 0, 5, 0}
		//Output: arr[] = {0 0 0 2 4 3 5 1}
		/*
		 * List<Integer> li= Arrays.asList(1, 2, 0, 4, 3, 0, 5, 0);
		 * List<Integer>output=li.stream().sorted().collect(Collectors.toList());
		 * System.out.println(output);
		 */
		/*
		 * int arr[] = {1, 2, 0, 4, 3, 0, 5, 0}; for(int i=0;i<arr.length;i++) { for(int
		 * j=i+1;j<arr.length;j++) { if(arr[i]>=arr[j]) {int temp= arr[i]; arr[i]=
		 * arr[j]; arr[j]=temp; } }
		 * 
		 * } for(int k=0;k<arr.length;k++) { System.out.println(arr[k]); }
		 */
		
		String s1="Keerthi     Va san       is a Qu           alityAna    list";

				String[] s2=s1.split(" ");

			String s4="";


				for(String s3:s2)
				{
				s4=s4+s3;
				}
				System.out.println(s4);
		}
	}


