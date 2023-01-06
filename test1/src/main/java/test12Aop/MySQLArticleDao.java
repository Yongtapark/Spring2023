package test12Aop;


public class MySQLArticleDao implements ArticleDao{


	public void insert(Article article) {
		System.out.println("MySQLArticleDao.insert()실행");
		
	}


	public void updateReadCount(int id, int i) {
		System.out.println("MySQLArticleDao.updateReadCount() 실행");
		
	}

}
