package com.book.springwithaws.service.posts;

import com.book.springwithaws.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts posts)
    {
        this.id= posts.getId();
        this.title= posts.getTitle();
        this.content= posts.getContent();
        this.author= posts.getAuthor();

    }

}
