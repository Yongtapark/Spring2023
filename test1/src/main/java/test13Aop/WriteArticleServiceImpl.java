package test13Aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WriteArticleServiceImpl implements WriteArticleService {
	private Log log=LogFactory.getLog(getClass());
	private int articleId;
	
	public Integer write(Article article) {
		articleId++;
		if(log.isTraceEnabled())//로그기록이 활성화 여부, true이면 실행
			log.trace(this+"'s write method executed. Article id is "+articleId);
		return articleId;
	}

}
