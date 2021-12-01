import javax.swing.*;
import java.awt.event.ActionEvent;

public class PageMenu extends JMenuBar{   //�޴��ٸ� ��ӹ��� Ŭ����
	public PageListViewer pageListViewer;
	public PageEditor pageEditor;
	private JMenu mainMenu;
	private JMenuItem createMenuItem;
	private JMenuItem removeMenuItem;
	private JMenuItem saveMenuItem;
	private JMenuItem resizeFontMenuItem;
	
	public PageMenu(PageListViewer pageList, PageEditor pageEditor) {//Ŭ������ �̸��� ���� ���� ������
		this.pageListViewer = pageList;
		this.pageEditor = pageEditor;
		
		
		//�޴� �߰�
		mainMenu = new JMenu("Set");
		createMenuItem = new JMenuItem("new page");
		removeMenuItem = new JMenuItem("Font");
		saveMenuItem = new JMenuItem("Edit");
		resizeFontMenuItem = new JMenuItem("Save");
		
		/*�޴� �����ۿ� Action �̺�Ʈ �ޱ�*/
		
		mainMenu.add(createMenuItem);
		mainMenu.add(removeMenuItem);
		mainMenu.add(saveMenuItem);
		mainMenu.add(resizeFontMenuItem);
		
		add(mainMenu);
	}
	
	public void createActionPerformed(ActionEvent actionEvent) {
		
	}
	
	public void modifyActionPerformed(ActionEvent actionEvent) {
		
	}
	
	public void removeActionPerformed(ActionEvent actionEvent) {
		
	}
	
	public void saveActionPerformed(ActionEvent actionEvent) {
		
	}
	
	public void resizeFontActionPerformed(ActionEvent actionEvent) {
		
	}

}
