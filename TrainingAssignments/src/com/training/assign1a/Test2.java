package com.training.assign1a;

public class Test2<S1, S2> extends Test1<S1> {

	S2 s2;

	Test2(S1 ob1, S2 ob2) {
		super(ob1);
		s2 = ob2;
	}

	S2 getOb2() {
		return s2;
	}
}
