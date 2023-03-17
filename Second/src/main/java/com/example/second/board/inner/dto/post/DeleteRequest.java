package com.example.second.board.inner.dto.post;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author ur2ku
 * @version 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteRequest {

    private Board board;
    private Post post;


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Board {
        @NotNull(message = "Board Id cannot be null")
        @Size(min = 1, message = "Board Id cannot be empty")
        private Long id;
    }


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Post {
        @NotNull(message = "Post Id cannot be null")
        @Size(min = 1, message = "Post Id cannot be empty")
        private Long id;

        private Author author;

        @Data
        @Builder
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Author {
            @NotNull(message = "Author Id cannot be null")
            @Size(min = 1, message = "Author Id cannot be empty")
            private Long id;
        }
    }

}