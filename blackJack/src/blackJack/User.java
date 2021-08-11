package blackJack;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User extends PlayerBase {

	@Override
	public void draw() {

		Scanner sc = new Scanner(System.in);
		Pattern yes = Pattern.compile("(?i)y");
		Pattern no = Pattern.compile("(?i)n");

		while (point <= 21) {
			System.out.println("あなたの現在の得点は" + point + "です");
			System.out.println("カードを引きますか？引くならY、引かないならNを入力してください");
			String choice = sc.next();

			if (yes.matcher(choice).matches()) {
				Card now = Deck.draw();
				hand.add(now);
				point += now.getPoint();

				System.out.println("あなたの引いたカードは" + now.getMark() + "の" + now.getNoString() + "です");

				if (isBurst()) {
					System.out.println("あなたの得点は" + point + "です");
					System.out.println("あなたの負けです");
					System.exit(0);
				}
			} else if (no.matcher(choice).matches()) {
				break;
			} else {
				System.out.println("YかNで回答してください");
				continue;
			}
		}

		return;

	}

}
