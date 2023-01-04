package test4;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelloBeanBoy implements HelloBean {
	Boy helloBoy;
	String msg;
	public HelloBeanBoy(Boy helloBoy, String msg) {
		super();
		this.helloBoy = helloBoy;
		this.msg = msg;
	}
	public HelloBeanBoy(String msg) {
		super();
		this.msg = msg;
	}
	public void setHelloBoy(Boy helloBoy) {
		this.helloBoy = helloBoy;
	}
	public void printHello(String msg) {
		//list
		List myList = helloBoy.myList;
		for(int i=0;i<myList.size();i++) {
			System.out.println("where is myList : 이름 "+myList.get(i)+i);
		}
		/*
		 * 이름 천지호0 
		 * 이름 언년이1 
		 * 이름 이대길2 
		 * 이름 현아3
		 */
		
		
		System.out.println(helloBoy.name+" "+msg);//천지호 hello
		
	
	
	//Map
	Map<String,String> myMap=helloBoy.myMap;
	Set<String> entryKey=myMap.keySet();
	Iterator<String> it= entryKey.iterator();
			
	while(it.hasNext()) {
		String key =it.next();
		System.out.println("where is myMap : "+key+"="+myMap.get(key));
	}
	
	//Properties
	Properties myJdbc = helloBoy.myJdbc;
	Enumeration<String> propertyNames =
			(Enumeration<String>)myJdbc.propertyNames();
		while(propertyNames.hasMoreElements()) {
			String prop=propertyNames.nextElement();
			System.out.println("where is myJdbc : "+prop+"="+myJdbc.getProperty(prop));
		}
		
	//Set
		Set<String> mySet = helloBoy.mySet;
		it = mySet.iterator();
		while(it.hasNext()) {
			System.out.println("where is mySet : "+it.next());
		}
	
	
	}
}
