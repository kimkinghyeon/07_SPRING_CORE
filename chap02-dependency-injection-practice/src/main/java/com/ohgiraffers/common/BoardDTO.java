package com.ohgiraffers.common;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class BoardDTO {
    private Long id;
    private String title;
    private String content;
    private MemberDTO writer;

}
