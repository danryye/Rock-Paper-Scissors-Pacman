package apppackage;

import java.util.ArrayList;

public class Board {
	
	//size of play area
	private int width;
	private int height;
	
	//ArrayList containing players
	private final int PLAYERS_PER_TEAM = 4;
	private ArrayList<Player> players;
	
	public Board() {
		this(2);
	}
	
	public Board(int size) {
		if(size == 1) { //small
			width = 500;
			height = 500;
		}else if(size == 3) { //large
			width = 700;
			height = 700;
		}else { //medium or other
			width = 900;
			height = 900;
		}
		
		//initialize players
		initPlayers(size);
		
	}

	private void initPlayers(int size) {
		players = new ArrayList<Player>();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < PLAYERS_PER_TEAM; j++) {
				players.add(
					new Player(
							(int)((Math.random()*(width-100)) + 50),
							(int)((Math.random()*(height-100)) + 50),
							(int)(Math.random()*60)-30,
							(int)(Math.random()*60)-30,
							size
							));
			}
		}
	}
}
