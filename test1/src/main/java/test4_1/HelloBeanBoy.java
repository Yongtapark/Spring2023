package test4_1;

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
		//List
	List myList=helloBoy.myList;
	for(int i=0; i<myList.size();i++) {
		System.out.println(myList.get(i));
	}
	
	System.out.println(helloBoy.name+" "+msg);
	
	//Map
	Map<String, String> myMap=helloBoy.myMap;
	Set<String> entryKey=myMap.keySet();
	Iterator<String> it= entryKey.iterator();
	
	while(it.hasNext()) {
		String key=it.next();
		System.out.println(key+"="+myMap.get(key));
	}
	
	//Properties
	Properties myJdbc= helloBoy.myJdbc;
	Enumeration<String> propertyNames=(Enumeration<String>)myJdbc.propertyNames();
	while(propertyNames.hasMoreElements()) {
		String prop=propertyNames.nextElement();
		System.out.println(prop+"="+myJdbc.getProperty(prop));
	}
	
	//Set
	Set<String> mySet = helloBoy.mySet;
			it=mySet.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	}
	
	
	

	
	

}
