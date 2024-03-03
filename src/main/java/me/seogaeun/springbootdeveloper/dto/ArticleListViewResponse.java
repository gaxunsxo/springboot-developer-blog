package me.seogaeun.springbootdeveloper.dto;

import lombok.Getter; //이 애너테이션 하나 빼먹어서 .../articles 접속이 안됐던 것
import me.seogaeun.springbootdeveloper.domain.Article;

@Getter
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article){
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
