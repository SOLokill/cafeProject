package Cafe;

import java.text.DecimalFormat;

public class cafeFinance {
	int cafecash;
	int coffeebeans;
	int water;
	int milk;
	String chcash;

	DecimalFormat dc = new DecimalFormat("###,###,###,###");

	public cafeFinance(int cafecash, int coffeebeans, int water, int milk, String chcash) {
		this.cafecash = cafecash;
		this.coffeebeans = coffeebeans;
		this.water = water;
		this.milk = milk;
		this.chcash = chcash;
	}
	public void cafebalance(cafeFinance caname) {
		String ch = dc.format(caname.cafecash);
		caname.chcash = ch;
		System.out.println("���� ī��ݰ� �ܾ��� "+ caname.chcash+"�� �Դϴ�.\n");
	}
	
}
