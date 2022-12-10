package day05;

import java.util.Arrays;
import java.util.List;

public class Algorithms {

	public static void main(String[] args) {
		Algorithms algorithms = new Algorithms();
		List<Integer> map = List.of(1,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,1,1);

		System.out.println(algorithms.longestWaterSegment(map));

		String[] words = {"flower","flow","flight","flown","flamish"};

		System.out.println(algorithms.longestCommonPrefix(words));

	}

	//flower, flow, flight-> flight, flow, flower
	public String longestCommonPrefix(String[] words){
		Arrays.sort(words);
		String first = words[0];
		String last = words[words.length-1];
		int i =0;
		StringBuilder sb = new StringBuilder();
		while(i<first.length() && first.charAt(i) == last.charAt(i)){
			sb.append(first.charAt(i));
			i++;
		}
		return sb.toString();
	}

	public int longestWaterSegment(List<Integer> map){
		int count = 0;
		int result = 0;

		for(int i =0; i<map.size();i++){
			if(map.get(i)==0){
				count++;
			}else{
				if(count>result){
					result=count;
				}
				count = 0;
			}
		}

		return result;
	}
}
