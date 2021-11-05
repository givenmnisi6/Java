public class TestAll {
    
    public static void main(String[] args) {
        
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(0,new Integer(2));
        list.add(1,new Integer(5));
        list.add(2,new Integer(8));
        list.add(3,new Integer(3));
        list.add(4,new Integer(6));
        list.add(5,new Integer(7));
        list.add(6,new Integer(10));

		System.out.println("List before sorted");
		System.out.println(list);
		
		System.out.println("\nList after sorted");
		if(list.sortList())
			System.out.println(list);
		
		System.out.println("\nSorted list After An Element Is Added");
		list.insertSorted(new Integer(1));
		
		System.out.println(list);
    }
}
