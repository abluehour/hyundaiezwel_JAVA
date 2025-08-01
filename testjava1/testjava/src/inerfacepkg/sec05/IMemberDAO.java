package inerfacepkg.sec05;

import java.util.ArrayList;

// 쇼핑몰에서 회원관리를 위한 DAO 인터페이스
// 회원관리 기능
// 1. 회원가입 : 1명의 회원정보를 받아서 DB에 저장하고 종료. 반환값 없음
// 2. 회원탈퇴 : 1명 회원의 memId를 전달 받아서 DB에서 해당 회원을 찾아서 삭제하고 종료. 반환값 없음
// 3. 회원정보검색 : 1명 회원의 id를 전달받아서  DB에서 해당 ㅎ회원 정보를 검색하고 검색된 결과를 반환. 반환값 있음
// 4. 회원정보수정 : 1명 회원의 정보를 전달받아서 DB에서 해당 회원 정보를 수정하고 종료. 반환값 없음
// 관리자 기능
// 5. 회원 전체 조회 : DB에 저장된 모든 회원 정보를 조회하고 조회된 결과를 반환. 반환값 있음
// 6. 회원 검색 : 회원의 이름을 전달받아서 DB에서 해당 회원을 검색하고 검색된 결과를 반환. 반환값 있음
public interface IMemberDAO {
    // 1. 회원가입
    public void insertMember(MemberDTO dto);

    // 2. 회원탈퇴 - id 필요
    public void deleteMember(String memId);

    // 3. 회원정보검색 - id 필요
    public MemberDTO selectMember(String memId);

    // 4. 회원정보수정 - 수정할 회원의 정보가 필요
    public void updateMember(MemberDTO dto);

    // 5. 회원 전체 조회 - 모든 회원정보를 반환
    public ArrayList<MemberDTO> getAllMembers();

    // 6. 회원 검색 - 이름으로 회원을 검색
    public ArrayList<MemberDTO> searchMemberByName(String memName);


}
