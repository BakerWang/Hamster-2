package cn.coselding.hamster.dao;

import cn.coselding.hamster.domain.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by 宇强 on 2016/10/4 0004.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ArticleDaoTest {

    @Autowired
    private ArticleDao articleDao;

    @Test
    public void testSaveArticle() throws Exception {
        Article article = new Article();
        article.setTitle("title");
        article.setContent("content");
        article.setTime(new Date());
        article.setAuthor("author");
        article.setType("原创");
        article.setUid(1);
        article.setCid(2);
        articleDao.saveArticle(article);
    }

    @Test
    public void testDeleteArticle() throws Exception {
        //articleDao.deleteArticle(176);
    }

    @Test
    public void testUpdateArticle() throws Exception {

    }

    @Test
    public void testUpdateArticleInfo() throws Exception {

    }

    @Test
    public void testQueryArticle() throws Exception {

    }

    @Test
    public void testQueryNextArticleInfo() throws Exception {

    }

    @Test
    public void testQueryLastArticleInfo() throws Exception {

    }

    @Test
    public void testQueryArticleInfo() throws Exception {

    }

    @Test
    public void testQueryCount() throws Exception {

    }

    @Test
    public void testGetPageDataInfo() throws Exception {

    }

    @Test
    public void testGetPageData() throws Exception {

    }

    @Test
    public void testQueryCountByCid() throws Exception {

    }

    @Test
    public void testGetPageDataByCid() throws Exception {

    }

    @Test
    public void testSearchCount() throws Exception {

    }

    @Test
    public void testSearchPageData() throws Exception {

    }

    @Test
    public void testQueryTop4Articles() throws Exception {

    }

    @Test
    public void testQueryLast3Articles() throws Exception {

    }
}