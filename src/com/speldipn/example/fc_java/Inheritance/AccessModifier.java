package com.speldipn.example.fc_java.Inheritance;

import com.speldipn.example.fc_java.Inheritance.another.NewParent;

public class AccessModifier {

	public static void main(String[] args) {
		
		//3. protected 접근제한자
		NewParent parent = new NewParent();
		System.out.println(parent.money);		
		NewChild newChild = new NewChild();
		newChild.printProtected();
		
		// 4. 다형성 polymorphism
		
		// 5. 내부 클래스 inner class

	}

}


class NewChild extends NewParent {
	public void printProtected() {
		System.out.println(super.car);
	}
}