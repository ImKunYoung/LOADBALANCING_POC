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

import java.time.LocalDateTime;

/**
 * @author ur2ku
 * @version 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PutResponse {

    private Post post;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Post {
        private Long id;
        private String title;
        private String content;
        private Author author;
        private LocalDateTime createdDate;

        @Data
        @Builder
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Author {
            private Long id;
        }
    }

}