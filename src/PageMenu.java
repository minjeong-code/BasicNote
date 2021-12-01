import javax.swing.*;
import java.awt.event.ActionEvent;

public class PageMenu extends JMenuBar{   //메뉴바를 상속받은 클래스
	public PageListViewer pageListViewer;
	public PageEditor pageEditor;
	private JMenu mainMenu;
	private JMenuItem createMenuItem;
	private JMenuItem removeMenuItem;
	private JMenuItem saveMenuItem;
	private JMenuItem resizeFontMenuItem;
	
	public PageMenu(PageListViewer pageList, PageEditor pageEditor) {//클래스와 이름이 같아 생긴 빨간줄
		this.pageListViewer = pageList;
		this.pageEditor = pageEditor;
		
		
		//메뉴 추가
		mainMenu = new JMenu("Set");
		createMenuItem = new JMenuItem("new page");
		removeMenuItem = new JMenuItem("Font");
		saveMenuItem = new JMenuItem("Edit");
		resizeFontMenuItem = new JMenuItem("Save");
		
		/*메뉴 아이템에 Action 이벤트 달기*/
		
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
