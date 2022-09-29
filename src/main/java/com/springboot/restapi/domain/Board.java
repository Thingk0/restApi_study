package com.springboot.restapi.domain;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "boardNo")
@ToString(exclude = "boardNo")
public class Board {

    private Integer boardNo;

    @NonNull
    private String title;

    private String content;

    private String writer;

    private LocalDateTime regDate;

}
