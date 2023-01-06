package test12Aop;



public class WriteArticleServiceImpl implements WriteArticleService {
	private ArticleDao articleDao;
	public WriteArticleServiceImpl() {
		
	}
	
	public WriteArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	public void write(Article article) {
		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);
		
	}
	
}
