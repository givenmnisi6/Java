public class TestAll {
     public static void main(String[] args) {
        
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.append(new Integer(1));
        list.append(new Integer(3));
        list.append(new Integer(5));
        list.append(new Integer(4));

        System.out.println("Getting last half in a list without any even number");
        System.out.println(list);
        //System.out.println(list.getLastHalf());
        
        list.delete(new Integer(1));
        list.delete(new Integer(3));
        list.delete(new Integer(5));
        list.delete(new Integer(4));

        list.append(new Integer(1));
        list.append(new Integer(6));
        list.append(new Integer(9));

        System.out.println("\nGetting last half in a list with even number");
		System.out.println(list);
        System.out.println(list.getLastHalf());
    }
}
