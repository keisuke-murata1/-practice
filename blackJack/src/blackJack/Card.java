package blackJack;

public class Card {

	public String mark;
	public int no;
	public String noString;
	public int point;
	
	public Card(String mark,int no) {
		this.mark = mark;
		this.no = no;
	}

	public Card() {
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNoString() {
		
		switch(no){
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
	}
		return String.valueOf(no);
	}

	public void setNoString(String noString) {
		this.noString = noString;
	}

	public int getPoint() {
		
		if(no > 10) {
			return 10;
		}
		
		return no;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
