/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectioninterfacetask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author 92019337
 */
public class CollectionInterfaceTask {

    private static int breakNumber = 0;

    public static void pntbr() {
        breakNumber += 1;
        System.out.println(breakNumber + "========================================");
    }

    public static void main(String[] args) {

        pntbr();

        ArrayList array1 = new ArrayList();
        array1.add("3.14");
        array1.add("2.72");
        array1.add("1.13");
        System.out.println(array1.size());
        System.out.println(array1);
        System.out.println(array1.contains("3.14"));
        System.out.println(array1.remove("3.14"));
        System.out.println(array1);
        array1.clear();
        System.out.println(array1);

        pntbr();

        Stack stack1 = new Stack();
        stack1.add("3.14");
        stack1.add("2.72");
        stack1.add("1.13");
        System.out.println(stack1.size());
        System.out.println(stack1);
        System.out.println(stack1.contains("3.14"));
        System.out.println(stack1.remove("3.14"));
        System.out.println(stack1);
        stack1.clear();
        System.out.println(stack1);

        pntbr();

        LinkedList linkedList1 = new LinkedList();
        linkedList1.add("3.14");
        linkedList1.add("2.72");
        linkedList1.add("1.13");
        System.out.println(linkedList1.size());
        System.out.println(linkedList1);
        System.out.println(linkedList1.contains("3.14"));
        System.out.println(linkedList1.remove("3.14"));
        System.out.println(linkedList1);
        linkedList1.clear();
        System.out.println(linkedList1);

        pntbr();

        Set<String> set1 = new HashSet<>();
        set1.add("3.14");
        set1.add("2.72");
        set1.add("1.13");
        System.out.println(set1.size());
        System.out.println(set1);
        System.out.println(set1.contains("3.14"));
        System.out.println(set1.remove("3.14"));
        System.out.println(set1);
        set1.clear();
        System.out.println(set1);
    }

}
