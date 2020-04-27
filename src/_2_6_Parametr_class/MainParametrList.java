package _2_6_Parametr_class;

public class MainParametrList {
    public static void main(String[] args) {
        ParametrList<Integer> pI = new ParametrList<>();
        ParametrList<String> pS = new ParametrList<>();

        // add(value)
        pI.add(5);pI.add(4);pI.add(3);pI.add(2);pI.add(1);
        pS.add("word1");pS.add("word2");pS.add("word3");pS.add("word4");pS.add("word5");
        System.out.println(pI);
        System.out.println(pS);

        // size()
        System.out.println("size = " + pI.size());
        System.out.println("size = " + pS.size());

        // get(index)
        System.out.println("get(3) = " + pI.get(3));
        System.out.println("get(3) = " + pS.get(3));

        // set(index, value)
        System.out.print("set(2, 2) : ");
        pI.set(2, 2);
        System.out.println(pI);
        pI.set(2, 3);

        // remove(index)
        System.out.print("remove(2) : ");
        pI.remove(2);
        System.out.println(pI);

        // insert(index, value)
        System.out.print("insert(2, 3) : ");
        pI.insert(2, 3);
        System.out.println(pI);

        // find(value)
        System.out.println("find(4) = " + pI.find(4));
    }
}
