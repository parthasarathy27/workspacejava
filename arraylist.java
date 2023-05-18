public class arraylist {

    public static void main(String[] args) {
        System.out.println("<---------- list of string ----------->");
        List<String> liststr = new ArrayList<String>();
        liststr.add("mango");
        liststr.add("apple");
        liststr.add("banana");
        liststr.add(null);
        liststr.add("grapes");
        liststr.add("apple");
        liststr.add("banana");
        liststr.add(null);

        for (int i = 0; i < liststr.size(); i++) {
            System.out.println(liststr.get(i));
        }

        for (String fruit : liststr) {
            System.out.println("String ==>" + fruit);
        }
        System.out.println("<------- list of integer ---------->");
        List<Integer> listNum = new ArrayList<Integer>();
        listNum.add(5);
        listNum.add(6);
        listNum.add(7);
        listNum.add(10);
        listNum.add(11);
        listNum.add(12);

        for (int i = 0; i < listNum.size(); i++) {
            System.out.println(listNum.get(i));
        }

        for (int numbers : listNum) {
            System.out.println("String ==>" + numbers);
        }
    }
}
