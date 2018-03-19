import java.util.*;
public class CollectionTest{
	public static void main(String[] agrs){
		String apple="apple";
		String orange="orange";
		String pear="pear";
		Collection<String> list=new ArrayList<String>();
		Collection<String> list2=new ArrayList<String>();
		list.add(apple);
		list.add(orange);
		list2.addAll(list);
		list2.add(pear);
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String str=it.next().toString();
			System.out.println(str);
		}
		boolean iscontain=list2.removeAll(list);
		System.out.println(iscontain);
		Iterator<String> it2=list2.iterator();
		while(it2.hasNext()){
			String str2=it2.next().toString();
			System.out.println(str2);
            }
        Object[] str3=list.toArray();
        for(int i=0;i<str3.length;i++){
            System.out.println(str3[i]);
         }
}
}
