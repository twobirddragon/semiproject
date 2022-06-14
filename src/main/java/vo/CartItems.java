package vo;

import java.util.Date;

public class CartItems {

	private int cartItemNo;
	private int userNo;
	private int bookNo;
	private Date cartItemCreatedDate;
	
	public CartItems() {}

	public int getCartItemNo() {
		return cartItemNo;
	}

	public void setCartItemNo(int cartItemNo) {
		this.cartItemNo = cartItemNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public Date getCartItemCreatedDate() {
		return cartItemCreatedDate;
	}

	public void setCartItemCreatedDate(Date cartItemCreatedDate) {
		this.cartItemCreatedDate = cartItemCreatedDate;
	}
	
	
}
