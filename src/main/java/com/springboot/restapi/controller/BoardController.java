package com.springboot.restapi.controller;

import com.springboot.restapi.domain.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/boards")
public class BoardController {

    @GetMapping
    public ResponseEntity<List<Board>> list() throws Exception{
        log.info("list");

        List<Board> boardList = new ArrayList<>();

        Board board = Board.builder()
                .boardNo(1)
                .title("향수")
                .content("넓은 벌 동쪽 끝으로")
                .writer("test1")
                .build();
        boardList.add(board);

        board = Board.builder()
                .boardNo(2)
                .title("첫 마음")
                .content("날마다 새로우며 깊어지고 넓어진다")
                .writer("test2")
                .build();
        boardList.add(board);

        return new ResponseEntity<>(boardList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> register(@RequestBody Board board) {
        log.info("register");

        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @GetMapping("/{boardNo}")
    public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo) {
        log.info("read");

        Board board = Board.builder()
                .boardNo(1)
                .title("title")
                .content("content")
                .writer("writer")
                .build();

        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @DeleteMapping("/{boardNo}")
    public ResponseEntity<String> remove(@PathVariable("boardNo") int boardNo) {
        log.info("remove");

        return new ResponseEntity<>("DELETE", HttpStatus.OK);
    }

    @PutMapping("/{boardNo}")
    public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo,
                                         @RequestBody Board board) {
        log.info("modify");

        return new ResponseEntity<>("MODIFY", HttpStatus.OK);
    }
}
