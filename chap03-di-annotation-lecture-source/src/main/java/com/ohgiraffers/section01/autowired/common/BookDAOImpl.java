package com.ohgiraffers.section01.autowired.common;



import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @Component 의 세분화 어노테이션의 한 종류로 DAO 타입의 객체에 사용한다.
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {

    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();

        bookList.put
                (1, new BookDTO(1,
                        12456,"정석","김정석","정석출판" , LocalDate.now()));
        bookList.put
                (2,
                new BookDTO(2,15156,"아","왜안돼","짜증나", LocalDate.now()));
    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }
}
