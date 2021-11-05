//I DO 6
public class TestAll {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        
        //Test with duplicates
        System.out.println("SPECIAL CASE #1");
        list.append(new Integer(2));
        list.append(new Integer(2));
        System.out.println("Before removal of duplicates:" + list);
        System.out.println("After removal of duplicates:" + list.deleteDuplicates());
        list.clear();

        //Without duplicates
        System.out.println("\nSPECIAL CASE #2");
        list.append(new Integer(2));
        list.append(new Integer(8));
        list.append(new Integer(9));
        list.append(new Integer(1));
        System.out.println("Before removal of duplicates:" + list);
        System.out.println("After removal of duplicates:" + list.deleteDuplicates());
        list.clear();

        System.out.println("\nGENERAL CASE");
        list.append(new Integer(1));
        list.append(new Integer(2));
        list.append(new Integer(2));
        list.append(new Integer(8));
        list.append(new Integer(9));
        list.append(new Integer(1));
        list.append(new Integer(4));
        list.append(new Integer(5));

        System.out.println("Before removal of duplicates:" + list);
        System.out.println("After removal of duplicates:" + list.deleteDuplicates());
        list.clear();
    }
}
