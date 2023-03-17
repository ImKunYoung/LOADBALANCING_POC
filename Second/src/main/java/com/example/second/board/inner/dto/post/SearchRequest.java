/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.second.board.inner.dto.post;


import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author ur2ku
 * @version 1.0
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SearchRequest {

    private Board board;

    @NotNull(message = "Keyword cannot be null")
    @Size(min = 1, message = "Keyword cannot be empty")
    @Size(max = 20, message = "Keyword cannot be over 20 characters")
    private String keyword;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Board {
        @NotNull(message = "Board Id cannot be null")
        @Size(min = 1, message = "Board Id cannot be empty")
        private Long id;
    }

}