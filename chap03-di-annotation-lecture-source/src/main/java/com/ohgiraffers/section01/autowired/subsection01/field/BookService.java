package com.ohgiraffers.section01.autowired.subsection01.field;


import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service : @Component 의 세분화 어노테이션의 한 종류로 Service 게층에서 사용된다.
@Service("bookServiceField")
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    // 도서목록 전체조회
    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    // 도서 번호로 도서 조회
    public BookDTO searchBookBySequence(int sequence){
        return bookDAO.selectOneBook(sequence);
    }
}
