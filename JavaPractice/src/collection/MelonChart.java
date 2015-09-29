package collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {
	public static void main(String[] args) {
		List<Music> list1 = new ArrayList<Music>();
		list1.add(new Music("바람이나 좀쐐","개리"));
		list1.add(new Music("보통연애","박경"));
		list1.add(new Music("취향저격","IKON"));
		System.out.println("--<<멜론 차트>>--");
		printList(list1);
		System.out.println("--<<2위 곡 추가>>--");
		list1.add(1,new Music("레옹","이유갓지"));
		printList(list1);
		System.out.println("--<<3위 곡 변경>>--");
		list1.add(2,new Music("맙소사","황태지"));
		printList(list1);
		System.out.println("--<<4위 곡 삭제>>--");
		list1.remove(3);
		printList(list1);
		System.out.println("--<<전체 리스트 삭제>>--");
		list1.clear();
		printList(list1);
	}

	public static void printList(List<Music> list1) {
		// TODO Auto-generated method stub
		int sunwee=1;
		for(Music list : list1)
		{
			System.out.println(sunwee+"."+list.toString());
		}
		
	}

}
