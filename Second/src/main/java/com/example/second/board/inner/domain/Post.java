package com.example.second.board.inner.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.second.board.inner.domain.vo.Author;
import com.example.second.board.inner.dto.post.PutRequest;
import com.example.second.board.inner.dto.post.SaveRequest;
import com.example.second.board.inner.service.exception.NotAuthorityPutException;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "postEntity")
@Slf4j
public class Post extends BaseTime implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @Embedded
    private Author author;

    @JsonIgnoreProperties("posts")
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;

    public Post(SaveRequest saveRequest) {
        this.title = saveRequest.getPost().getTitle();
        this.content = saveRequest.getPost().getContent();

        this.setAuthor(saveRequest);
    }

    /**
     * methodName : setAuthor
     * author : IMKUNYOUNG
     * description : 작성자 설정
     */
    private void setAuthor(SaveRequest saveRequest) {
        this.author = new Author();
        this.author.setAuthor(saveRequest);
    }


    /**
     * methodName : updatePost
     * author : IMKUNYOUNG
     * description : 포스트 수정
     * id : GHDV-24
     *
     * @return post
     */
    public Post updatePost(PutRequest putRequest) {
        this.checkAuthor(putRequest.getPost().getAuthor().getId());
        this.title = putRequest.getPost().getTitle();
        this.content = putRequest.getPost().getContent();
        return this;
    }


    /**
     * methodName : checkAuthor
     * author : IMKUNYOUNG
     * description : 작성자 확인
     *
     */
    public void checkAuthor(long id) {
        log.info("author : {}", id);

        if (!this.author.getId().equals(id)) {
            throw new NotAuthorityPutException();
        }
    }


}
