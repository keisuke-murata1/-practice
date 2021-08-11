package blackJack;

public class Dealer extends PlayerBase{
	int count = 0;

	@Override
	public void draw() {
		
		while (point <= 17) {
			count++;
			
			Card now = Deck.draw();
			hand.add(now);
			point += now.getPoint();
			
			if(count == 2) {
				System.out.println("ディーラーの引いたカードは分かりません");
				return;
			} else {
				System.out.println("ディーラーの引いたカードは" + now.getMark() + "の" + now.getNoString() + "です");
			}

			if (isBurst()) {
				System.out.println("ディーラーの得点は" + point + "です");
				System.out.println("あなたの勝ちです");
				System.exit(0);
			}
		}
		System.out.println("ディーラーの現在の得点は" + point + "です");
		
		return;
	}
}
