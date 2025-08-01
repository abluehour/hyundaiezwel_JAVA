package inerfacepkg.sec05;

public class MemberMain {
    public static void main(String[] args) {
        // DTO DAO 활용 예제
        // 회원가입을 위한 정보가 전달외었다고 가정

        MemberDTO member = new MemberDTO("user01", "pass123", "홍길동", "010-1234-5678", "서울시 강남구");

        // DAO 객체 생성
        IMemberDAO memberDAO = new MemberDAO();
        // 회원가입 메서드 호출
        memberDAO.insertMember(member);

        // 회원정보 검색 메서드 호출
        MemberDTO searchedMember = memberDAO.selectMember("user01");
        if (searchedMember != null) {
            System.out.println("회원 정보 검색 성공!");
            System.out.println("회원 ID: " + searchedMember.getMemId());
            System.out.println("회원 이름: " + searchedMember.getMemName());
            System.out.println("회원 전화번호: " + searchedMember.getMemPhone());
            System.out.println("회원 주소: " + searchedMember.getMemAddress());
        } else {
            System.out.println("회원 정보가 없습니다.");
        }
    }
}
