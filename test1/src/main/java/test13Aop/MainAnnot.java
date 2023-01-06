package test13Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnot {

	public static void main(String[] args) {
		String[] configs= {"test13Aop/contextAnnot.xml"};
		ApplicationContext context=
				new ClassPathXmlApplicationContext(configs);
		
		WriteArticleService service=
				context.getBean("writeArticleService",WriteArticleService.class);
		
		Integer articleId=service.write(new Article());
		
		ReadArticleService readArticleService=
				context.getBean("readArticleService",ReadArticleService.class);
		
		Article article1=readArticleService.readArticle(articleId);
	}

}
