package stream_joiner;

import java.util.StringJoiner;

public class Program {

	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner(",").add("abc").add("pqr").add("stl");
		System.out.println(joiner);

		StringJoiner joiner1=new StringJoiner(",","Prfix-- "," --Suffix").add("abc").add("pqr").add("stl");
		System.out.println(joiner1);
		StringJoiner joiner3=joiner.merge(joiner1);
		System.out.println(joiner3);
		//_JAVA_OPTIONS
		//-Xrunjvmhook -Xbootclasspath/a:"C:\Program Files (x86)\HP\Unified Functional Testing\bin\java_shared\classes";"C:\Program Files (x86)\HP\Unified Functional Testing\bin\java_shared\classes\jasmine.jar"
	}

}
