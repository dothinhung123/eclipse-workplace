package tutorial1;

public class activity1 {


private double salePrice;
public activity1(double salePrice) {
	super();
	this.salePrice = Math.floor(salePrice*100)/100;
}
public double getSalePrice() {
	return salePrice;
}
public void setSalePrice(double salePrice) {
	this.salePrice = salePrice;
}


}
