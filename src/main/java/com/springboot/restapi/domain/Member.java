package com.springboot.restapi.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

// final 로 선언된 필드값을 인자로 받는 생성자를 생성한다.
@RequiredArgsConstructor
@ToString
public class Member {

    // 생성자의 인자로 사용될 필드를 final 로 선언하여 지정.
    private final String userId;
    private final String password;
    private String userName;
}
