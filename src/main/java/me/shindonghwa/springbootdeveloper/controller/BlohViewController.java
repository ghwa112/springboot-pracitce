package me.shindonghwa.springbootdeveloper.controller;


import lombok.RequiredArgsConstructor;
import me.shindonghwa.springbootdeveloper.domain.Article;
import me.shindonghwa.springbootdeveloper.dto.ArticleListViewResponse;
import me.shindonghwa.springbootdeveloper.dto.ArticleViewResponse;
import me.shindonghwa.springbootdeveloper.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BlohViewController {

    private final BlogService blogService;

    @GetMapping("/articles")
    public String articles(Model model) {
        List<ArticleListViewResponse> articles = blogService.findAll().stream()
                .map(ArticleListViewResponse::new)
                .toList();
        model.addAttribute("articles", articles);

        return "articleList";
    }

    @GetMapping("articles/{id}")
    public String article(@PathVariable Long id, Model model) {
        Article article = blogService.findById(id);
        model.addAttribute("article",new ArticleViewResponse(article));

        return "article";
    }

}