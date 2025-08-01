package inerfacepkg.sec05;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {
    //db connection data 필드

    //db 연결 코드 : 연결 메서드

    //실제 구련은 db연동에 의한 db접근이 진행되어야 하고
    //관련 쿼리를 전달해서 각 기능이 수행되게 해야 함
    @Override
    public void insertMember(MemberDTO dto) {
        //전달 받은 회원정보를 SB에 저장하려면 DTO에서 개별 정보를 반환을 받아 저장하게됨
        String memId = dto.getMemId();
        System.out.println("회원가입 성공!");
        System.out.println("회원 ID: " + memId);
    }

    @Override
    public void deleteMember(String memId) {

    }

    @Override
    public MemberDTO selectMember(String memId) {
        MemberDTO member = new MemberDTO("1234","qwer","홍길동","1111","서울");
        return member;

    }

    @Override
    public void updateMember(MemberDTO dto) {

    }

    @Override
    public ArrayList<MemberDTO> getAllMembers() {
        return null;
    }

    @Override
    public ArrayList<MemberDTO> searchMemberByName(String memName) {
        return null;
    }
}
