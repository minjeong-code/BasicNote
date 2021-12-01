import java.util.ArrayList;

public class PageList { // 밑의 메소드들의 매개변수를 수정해야함.
	private ArrayList<Page> pageList;
	
	public PageList() { //클래스와 이름이 같아 생긴 빨간줄
		
	}
	
	private void initPageListFromFileSystem() {
		
	}
	
	public Page readFile(int file) { //매개변수는 FileReader와 BufferReader를 import하여 사용해야할 것으로 예상됨
		return null;
	}
	
	public void writeFile(int file, String content) { //매개변수가 여기에도 잘 명시가 안되어있음. FileWriter를 import하고  try 구문 사용해아할 것으로 예상됨.
		
	}
	
	public boolean removeFile(int file) { //역시 클래스 다이어그램 명세에 불린 설명 없음.
		return true;
	}
	
	public Page searchPage(String name) { //Page 객체 반환
		return null;
	}
	
	public boolean addPage(int page) { //추가 성공할 경우 true
		return true;
	}
	
	public boolean removePage(int page) { //삭제 성공할 경우 true
		return true;
	}
	
	public boolean savePage(int page) { //writeFile 매소드 호출 중 에러 -> false
		return true;
	}
	
	public boolean duplicateCheck(int file) { //같은 파일이 있으면 true
		return true;
	}

}