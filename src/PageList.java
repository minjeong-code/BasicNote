import java.util.ArrayList;

public class PageList { // ���� �޼ҵ���� �Ű������� �����ؾ���.
	private ArrayList<Page> pageList;
	
	public PageList() { //Ŭ������ �̸��� ���� ���� ������
		
	}
	
	private void initPageListFromFileSystem() {
		
	}
	
	public Page readFile(int file) { //�Ű������� FileReader�� BufferReader�� import�Ͽ� ����ؾ��� ������ �����
		return null;
	}
	
	public void writeFile(int file, String content) { //�Ű������� ���⿡�� �� ��ð� �ȵǾ�����. FileWriter�� import�ϰ�  try ���� ����ؾ��� ������ �����.
		
	}
	
	public boolean removeFile(int file) { //���� Ŭ���� ���̾�׷� ���� �Ҹ� ���� ����.
		return true;
	}
	
	public Page searchPage(String name) { //Page ��ü ��ȯ
		return null;
	}
	
	public boolean addPage(int page) { //�߰� ������ ��� true
		return true;
	}
	
	public boolean removePage(int page) { //���� ������ ��� true
		return true;
	}
	
	public boolean savePage(int page) { //writeFile �żҵ� ȣ�� �� ���� -> false
		return true;
	}
	
	public boolean duplicateCheck(int file) { //���� ������ ������ true
		return true;
	}

}