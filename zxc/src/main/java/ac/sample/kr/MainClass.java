package ac.sample.kr;

import java.io.IOException;
import java.util.List;

import org.springframework.context.annotation.Configuration;

public class MainClass {
	
	public static void main(String[] args) {
		googlecheck_Simple go =new googlecheck_Simple();
		try {
			go.check();
			
			List<Object> list =go.resultOffline;
			System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
