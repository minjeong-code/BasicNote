import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Dimension;
public class PageEditor extends JTextArea {
	private int initFont;
	
	public PageEditor() {
		super(100,70);  //rows: 7��, columns: 20�� �� �Է¹��� �� �ִ� TextArea
		setBackground(Color.ORANGE);
		setPreferredSize(new Dimension(80, 150));
		//initPageEditor();
	}
	
	public String getContent() {
		return "";
	}
	
	public void openEditor(int page) {
		
	}
	
	public void modifyEditor() {
		
	}
	
	public void closePage() {
		
	}
	
	public void setFont(int font) {
		
	}
	
	public int getCurFont() { // Ŭ���� ���̾�׷��� ���� �ڷ����� Font��� �Ǿ��ִ�.
		int font=0;
		return font;
	}
}
