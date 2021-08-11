package blackJack;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerBase {

	List<Card> hand = new ArrayList<Card>();
	int point = 0;
	boolean burst = false;
	
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public boolean isBurst() {
		
		if(point > 21) {
			burst = true;
		}
		
		return burst;
	}
	public void setBurst(boolean burst) {
		this.burst = burst;
	}
	
	public abstract void draw();
	
}
