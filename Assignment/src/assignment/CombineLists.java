package assignment;

import java.util.ArrayList;
import java.util.List;

public class CombineLists {
	
	public static List<Object>joinList(List<Object> l1,List<Object> l2){
		int count=0;
		List<Object> finList=new ArrayList<>();
		while(count<l1.size()||count<l2.size()) {
			if(count<l1.size()) {
				finList.add(l1.get(count));
			}
			if(count<l2.size()) {
				finList.add(l2.get(count));
			}
			count++;
		}
		return finList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1=new ArrayList<>();
		List<Object> l2=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l2.add("a");
		l2.add("b");
		l2.add("c");
		System.out.println(CombineLists.joinList(l1, l2));
		
	}

}
