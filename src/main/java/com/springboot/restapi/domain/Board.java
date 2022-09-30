package com.springboot.restapi.domain;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class Board {

    private Integer boardNo;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;

    @Builder
    public Board(Integer boardNo, String title, String content, String writer) {
        this.boardNo = boardNo;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.regDate = LocalDateTime.now();
    }
}
