/* 회원 컨트롤러에서 회원을 실제 등록하는 기능 */

@PostMapping(value = "/members/new")
public String create(MemberForm form) {

    Member member = new Member();
    member.setName(form.getName());

    memberService.join(member);

    return "redirect:/";
}