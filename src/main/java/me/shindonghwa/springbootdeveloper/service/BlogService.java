package me.shindonghwa.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.shindonghwa.springbootdeveloper.domain.Article;
import me.shindonghwa.springbootdeveloper.dto.AddArticleRequest;
import me.shindonghwa.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}