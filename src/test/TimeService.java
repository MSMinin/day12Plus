package test;

import java.text.SimpleDateFormat;

public class TimeService {
	TimeDTO t;
	
	public TimeService() {
		t = new TimeDTO();
	}
	
	public void stTime() { // 시작시간 설정 
		t.setStart(System.currentTimeMillis());
	}
	
	public String stChk() { // 시작시간 확인
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String s = simple.format(t.getStart());
		
		return s;
	}
	
	public void enTime() { //종료시간 설정
		t.setEnd(System.currentTimeMillis());
		System.out.println("종료 시간이 설정되었습니다.");
		
		t.setTotal((t.getEnd() - t.getStart()) / 1000);
	}
	
	public String enChk() { // 종료시간 확인
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String e = simple.format(t.getEnd());
		
		return e;
	}
	
	public String totalChk() { // 사용시간 확인
		// System.out.println(t.getTotal() + "초 사용");
		long total = t.getTotal();
		int m = (int)total / 60;
		int s = (int)total % 60;
		// System.out.println(m + "분" + s + "초");
		
		return m + "분" + s + "초";
		
	}
}
