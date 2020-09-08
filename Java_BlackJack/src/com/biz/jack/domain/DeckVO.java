package com.biz.jack.domain;

/*
 *playing card
 *한벌 52개의 카드(조커제외)
 *suit: 빨강(다이아◆,하트♥), 검정(스페이드♠,클로버♣)
 *denomination(끝수) 13가지 종류
 *숫자,알파벳
 *2~10, J(jack) Q(Queen) K(King) A(Ace)
 *
 *  
 */

public class DeckVO {
	
	private String suit;
	private String denomination;
	private int value;
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "리스트 [suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	
	

}
