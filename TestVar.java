import java.util.ArrayList;
import java.util.HashMap;

public class TestVar {
	// var bclass = 56; an instance variable is not allowed with var keyword
	private int check = 5;
	
	{
		var def = "I am def and in upper block";
		System.out.println(def);
	}
	
	static {
		var var = "I am var and in static block"; // var can also be used a variable itself which means it isn't a reserved
											// keyword.
		System.out.println(var);
	}

	public TestVar() {
		var var = "I am var and in constructor";
		System.out.println(var);
	}
	
	{
		var bcd = "I am bcd and in middle block";
		System.out.println(bcd);
	}

	public static void main(String... ankit) {

		new TestVar();

		var a = 1;
		var b = 22;
		var c = 75678764;
		var d = 8976546789098765898L;
		var e = 10.53598745f;
		var f = 987656789.8765467d;
		var g = "Ankit Maurya";
		var h = 'A';
		var i = true;
		
		var j = new ArrayList<>();// if no dataType is given here then by default it will be ArrayList<Object>()
		j.add("Ankit");
		j.add(5);
		j.add('c');
		j.add(true);
		j.add(5.9f);
		j.add(2.2345676543d);
		
		var k = new ArrayList<String>();
		k.add("Amit");
		k.add("Dhirendra");
		k.add("Ujjwal");
		k.add("Prabhat");
		
		var l = new HashMap<>();
		l.put("Ankit","Maurya");
		l.put(1,1);
		l.put(1.2f,1.2f);
		l.put("Boolean",true);
		
		var m = new HashMap<String,Integer>();
		m.put("One",1);
		m.put("Two",2);
		m.put("Three",3);

		System.out.println();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("l = " + l);
		System.out.println("m = " + m);
		// System.out.println(bclass);
		
	}
		
	{
		var mno = "I am mno and in last block at bottom";
		System.out.println(mno);
	}
}