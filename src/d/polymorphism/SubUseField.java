package d.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class SubUseField extends SuperUseField{
	private List list = new ArrayList();
	public SubUseField(){
		overrideMe();
	}
	public void overrideMe(){
		System.out.println(list.size());
	}
}
