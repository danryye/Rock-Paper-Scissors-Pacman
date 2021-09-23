package apppackage;

public class Player {

	//board postion
	private int x;
	private int y;
	private int velX;
	private int velY;
	
	//state of the player
	// 0 = rock
	// 1 = paper
	// 2 = scissor
	private int playerState;
	
	Player(int x, int y, int velX, int velY, int playerState){
		this.x = x;
		this.y = y;
		this.velX = velX;
		this.velY = velY;
		this.playerState = playerState;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public int getPlayerState() {
		return playerState;
	}

	public void setPlayerState(int playerState) {
		this.playerState = playerState;
	}
	
	
}
