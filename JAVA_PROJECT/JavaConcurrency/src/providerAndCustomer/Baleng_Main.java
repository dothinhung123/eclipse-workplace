//package providerAndCustomer;
//
//public class Baleng_Main {
///*
// * Sender and Reciever or Provier and Consumer
// * the sender send the data packet for Reciever
// * however the reciever can recieve data until the 
// * sender process data packet
// * the same with the sender 
// * the sender can send the data packet for receiver only when 
// * the reciver has processed the data currently 
// * wait():suspend a thread
// * notify():wake a thread up
// */
//	public static void main(String[]  args) {
//		Data data = new Data();
//		Thread sender = new Thread(new Sender(data));
//		Thread reciever = new Thread(new Reciever(data));
//		sender.start();
//		reciever.start();
//	}
//}
