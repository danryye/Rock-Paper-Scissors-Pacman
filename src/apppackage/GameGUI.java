package apppackage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGUI extends JFrame{
	
	
	// Frame settings
	
	private int FRAME_WIDTH = 600;
	private int FRAME_HEIGHT = 600;
	private int FRAME_INIT_X = 200;
	private int FRAME_INIT_Y = 200;
	
	// Timer (in seconds)
	private Thread timer;
	private int timePassed;
	private boolean pauseTimer;
	
	// For Statistics
	private int collisions = 0;
	
	
	public GameGUI() {
		
		// sets frame
		this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		this.setLocation(FRAME_INIT_X, FRAME_INIT_Y);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		// layouts of the frame
		JPanel menuScreen;
		JPanel playScreen;
		JPanel resultScreen;
		
		//----------Menu Screen----------//
		
		//----------Play Screen----------//
		//----------Result Screen----------//
		
		//----------Timer----------//
		timePassed = 0;
		pauseTimer = true;
	}
	
	//----------Timer----------//
	public void startTimer() {
		pauseTimer = false;
		
		timer = new Thread() {
			public void run() {
				while(pauseTimer) {
					timePassed++;
					
					//sleep for 1 second
					try {
						update();
						sleep(1000);
					}catch(Exception e) {
						
					}
				}
			}
		};
		timer.start();
	}
	
	public void stopTimer() {
		pauseTimer = true;
		
		try {
			if(timer != null)
				timer.join();
		}catch(Exception e) {
			
		}
	}
	
	//updates all 
	private void update() {
		
	}
	
	
	
}
