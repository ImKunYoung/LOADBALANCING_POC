/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

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
public class PutRequest {

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

        @NotNull(message = "Post Title cannot be null")
        @Size(min = 1, message = "Post Title cannot be empty")
        private String title;

        @NotNull(message = "Post Content cannot be null")
        @Size(min = 1, message = "Post Content cannot be empty")
        private String content;

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