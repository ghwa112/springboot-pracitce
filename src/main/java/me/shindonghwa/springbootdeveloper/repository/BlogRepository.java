package me.shindonghwa.springbootdeveloper.repository;

import me.shindonghwa.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {}