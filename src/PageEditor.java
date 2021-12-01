import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Dimension;
public class PageEditor extends JTextArea {
	private int initFont;
	
	public PageEditor() {
		super(100,70);  //rows: 7줄, columns: 20자 를 입력받을 수 있는 TextArea
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
	
	public int getCurFont() { // 클래스 다이어그램에 리턴 자료형이 Font라고 되어있다.
		int font=0;
		return font;
	}
}
