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
	
	public boolean addPage(ArrayList<Page> pageList) { //15, 20, 25��° �� : �������� �Ű������� page�� �Ǿ������� PageList�� �������� ����. page�� �ƴ϶� pageList�� ������ �����.
		
		return false;//������ ��� false ��ȯ
	}
	
	public boolean removePage(ArrayList<Page> pageList) { 
		
		return false;//������ ��� false ��ȯ
	}
	
	public boolean savePage(ArrayList<Page> pageList) { //Ŭ���� ���̾�׷����� ���� �ڷ����� �Ҹ��̴�. ������  Ŭ���� ���̾�׷� ������ �ٸ���.
		return true;
	}
	
	public void nodeSelectionPerformed(ActionEvent selectionEvent) { //���� �ڷ����� �������� �ʴ�.
		
	}
	
	public String getLastSelectedPage() {
		return null; //Ŭ���� ���̾�׷� ������ ���� �ֱٿ� ���õ� ������ ���� ��ȯ��.
		
	}
 
}


//3��° �� ���� ����
//https://zzznara2.tistory.com/186
//https://blog.naver.com/fochaerim/70105895049