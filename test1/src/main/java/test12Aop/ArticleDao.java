package test12Aop;


public interface ArticleDao{
	void insert(Article article);
	//insert¸¸ Á¤ÀÇ
	
	void updateReadCount(int id, int i);
}
