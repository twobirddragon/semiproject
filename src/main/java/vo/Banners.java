package vo;

import java.util.Date;

public class Banners {

	private int no;
	private String imageName;
	private Date showBeginDate;
	private Date showEndDate;
	
	public Banners () {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Date getShowBeginDate() {
		return showBeginDate;
	}

	public void setShowBeginDate(Date showBeginDate) {
		this.showBeginDate = showBeginDate;
	}

	public Date getShowEndDate() {
		return showEndDate;
	}

	public void setShowEndDate(Date showEndDate) {
		this.showEndDate = showEndDate;
	}
	
	
}
