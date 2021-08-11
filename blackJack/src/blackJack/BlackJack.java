package blackJack;

public class BlackJack {

	public static void main(String[] args) {
		
		System.out.println("★ブラックジャックスタート★");
		
		Deck deck = new Deck();
		
		 User user = new User();
		Dealer dealer = new Dealer();
		
		for (int i = 0;i < 2;i++) {
			Card now = Deck.draw();
			user.hand.add(now);
			user.point += now.getPoint();
			System.out.println("あなたの引いたカードは" + now.getMark() + "の" + now.getNoString() + "です");
		}
		
		dealer.draw();
		user.draw();
		System.out.println("ディーラーの2枚目のカードは" + dealer.getHand().get(1).getMark() + "の" + dealer.getHand().get(1).getNoString() + "です");
		dealer.draw();
		
		if(dealer.isBurst() == user.isBurst() && user.isBurst() == false) {
			if(dealer.getPoint() > user.getPoint()) {
				System.out.println("ディーラーの勝ちです");
			} else if(dealer.getPoint() < user.getPoint())  {
				System.out.println("あなたの勝ちです");
			} else {
				System.out.println("引き分けです");
			}
		}
		
		
	}
}
