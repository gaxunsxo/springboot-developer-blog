package me.seogaeun.springbootdeveloper.dto;

import lombok.Getter;
import me.seogaeun.springbootdeveloper.domain.Article;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
