package com.ohgiraffers.section01.autowired.common;


import java.util.List;

public interface BookDAO {

    // 도서 목록 전체조회
    List<BookDTO> selectBookList();

    // 도서 번호 도서 조회
    BookDTO selectOneBook(int sequence);



}
