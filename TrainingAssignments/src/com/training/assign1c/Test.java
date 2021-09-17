package com.training.assign1c;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		
	TreeSet<EmpHashDuplicate> treeSet = new TreeSet<>(new Comparator<EmpHashDuplicate>() {
        @Override
        public int compare(EmpHashDuplicate o1, EmpHashDuplicate o2) {
            int index = o1.getName().compareTo(o2.getName());
            return index==0?1:index;
        }
    });
    treeSet.add(new EmpHashDuplicate("Aniruddha"));
    treeSet.add(new EmpHashDuplicate("Aniruddha123"));
    treeSet.add(new EmpHashDuplicate("Aniruddha"));
    treeSet.add(new EmpHashDuplicate("Aniruddha456"));
    treeSet.add(new EmpHashDuplicate("Aniruddha")); 
    treeSet.forEach(System.out::println);
}
}