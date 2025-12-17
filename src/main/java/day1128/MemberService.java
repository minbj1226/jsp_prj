package day1128;

public class MemberService {

	public void joinMember(ParamDTO pDTO) {
		//회원 테이블에 insert하는 쿼리를 실행하는 DAO method 호출
		System.out.println("Service" + pDTO);
		//히스토리 테이블 insert 쿼리를 DAO method
	}//joinMemeber
}//class