package activity2;

public class Free {
	private double distance;
	private double fee;
	
public Free(double distance,double fee) throws IllegalArgumentException {
	while(distance>10 && distance>0) {
		this.distance = distance;
		this.fee = fee;
	}
	throw new IllegalArgumentException("your varialbe is not right");
	}



public double getDistance() {
	return distance;
}

public void setDistance(double distance) {
	this.distance = distance;
}



public double getFee() {
	return fee;
}



public void setFee(double fee) {
	if(distance==1 ) {
		fee = distance*15000;
	}
	else if(distance>2 && distance<10) {
		fee = distance*12000;
	}
	else if(distance>11) {
		fee = distance*11000;
		}
		
	}


}
