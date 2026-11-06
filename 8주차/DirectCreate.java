/* 회원 서비스가 메모리 회원 리포지토리 직접 생성 */

public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
}