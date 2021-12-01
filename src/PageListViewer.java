import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.ActionEvent;


public class PageListViewer extends JTree{
	private DefaultMutableTreeNode root;
	public PageEditor pageEditor;
	
	public PageListViewer(PageEditor pageEditor, DefaultMutableTreeNode root) { 
		this.pageEditor = pageEditor;
		this.root = root;
		
	}
	
	public boolean addPage(ArrayList<Page> pageList) { //15, 20, 25번째 줄 : 문서에는 매개변수가 page로 되어있지만 PageList와 연관성이 있음. page가 아니라 pageList인 것으로 예상됨.
		
		return false;//실패할 경우 false 반환
	}
	
	public boolean removePage(ArrayList<Page> pageList) { 
		
		return false;//실패할 경우 false 반환
	}
	
	public boolean savePage(ArrayList<Page> pageList) { //클래스 다이어그램에는 리턴 자료형이 불린이다. 하지만  클래스 다이어그램 명세에는 다르다.
		return true;
	}
	
	public void nodeSelectionPerformed(ActionEvent selectionEvent) { //리턴 자료형이 나와있지 않다.
		
	}
	
	public String getLastSelectedPage() {
		return null; //클래스 다이어그램 명세에는 가장 최근에 선택된 페이지 명을 반환함.
		
	}
 
}


//3번째 줄 오류 관련
//https://zzznara2.tistory.com/186
//https://blog.naver.com/fochaerim/70105895049