package com.springboot.restapi.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardTest {

    @Test
    void testNoArgsConstructor() {
        Board board = new Board();

        System.out.println(board);
    }

    @Test
    void testRequiredArgsConstructor() {
        Board board = new Board("테스트 제목");

        System.out.println(board);
    }

    @Test
    void getter_test() {
        Board board = new Board();
        System.out.println(board.getTitle());
    }

    @Test
    void setter_test() {
        Board board = new Board();
        board.setTitle("제목수정");

        System.out.println(board.getTitle());
    }

    @Test
    void toString_test() {
        Board board = new Board();
        board.setTitle("title");
        board.setBoardNo(1);
        board.setContent("content");
        board.setWriter("writer");
        board.setRegDate(LocalDateTime.now());

        System.out.println(board.toString());;
    }
}