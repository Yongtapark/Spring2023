package test12Aop;


public interface ArticleDao{
	void insert(Article article);
	//insert�� ����
	
	void updateReadCount(int id, int i);
}
