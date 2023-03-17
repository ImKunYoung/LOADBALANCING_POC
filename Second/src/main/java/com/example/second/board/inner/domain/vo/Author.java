package com.example.second.board.inner.domain.vo;

import com.example.second.board.inner.dto.post.SaveRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class Author implements Serializable {

    @Column(name = "author_id")
    private Long id;

    /**
     * methodName : setAuthor
     * author : IMKUNYOUNG
     * description : 작성자 설정
     */
    public void setAuthor(SaveRequest saveRequest) {
        this.id = saveRequest.getPost().getAuthor().getId();
    }
}
