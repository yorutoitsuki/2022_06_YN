package cal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class ListenerMain implements KeyListener{

	private ArrayList<Double> numberAL = new ArrayList<Double>();
	private ArrayList<String> operationAL = new ArrayList<String>();
	private String temp = "0";
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if((KeyEvent.VK_0<= e.getKeyCode() && e.getKeyCode()<=KeyEvent.VK_9)
				||(KeyEvent.VK_NUMPAD0 <= e.getKeyCode() && e.getKeyCode() <= KeyEvent.VK_NUMPAD9)) {
			temp += e.getKeyCode();
			temp.toString();
		}
		if(e.getKeyCode() == KeyEvent.VK_PLUS) {
			numberAL.add(Double.parseDouble(temp));
			temp = "0";
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
