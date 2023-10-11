package com.example.firstproject.dto;

public class ArticleForm {
    private String title;
    private String content;
    //전송받은 제목과 내용을 필드에 저장하는 생성자 추가
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }
    //데이터를 잘 받았는지 확인할 toString() 메서드 추가

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
