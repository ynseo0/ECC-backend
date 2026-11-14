/* 웹 등록 화면에서 데이터를 전달받을 폼 객체 */

package hello.hellospring.controller;

public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}