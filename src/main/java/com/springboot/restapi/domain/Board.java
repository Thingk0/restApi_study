package com.springboot.restapi.domain;

import lombok.*;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@ToString
public class  Board {

    @NonNull
    private Integer boardNo;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;

}
