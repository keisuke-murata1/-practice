package blackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	ArrayList<ArrayList<Integer>> olddeck = new ArrayList<>();
	
	static List<Card> deck = new ArrayList<Card>();
	
	public static void createDeck() {
		
	}
	
	public Deck() {

		String[] suit = { "ハート", "ダイヤ", "スペード", "クローバー" };

		for (int i = 0; i < 4; i++) {
		for (int j = 1; j <= 13; j++) {
				deck.add(new Card(suit[i], j));
			}
		}

	}
	
	public int size() {
		return this.olddeck.size();
	}

	public ArrayList<Integer> getDeck(int suit) {
		return olddeck.get(suit);
	}
	
	public static Card draw() {

		
		Card tmp = new Card();
		Random rand = new Random();
		
		int num = rand.nextInt(deck.size()-1);
		tmp = deck.get(num);
		
		deck.remove(num);
		
		return tmp;
	}
}
