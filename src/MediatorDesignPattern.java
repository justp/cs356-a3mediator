public class MediatorDesignPattern {
	public static void main(String args[]) {

		IATCMediator atcMediator = new ATCMediator();
		Flight sparrow101 = new Flight(atcMediator);
		Runway mainRunway = new Runway(atcMediator);
		atcMediator.registerFlight(sparrow101);
		atcMediator.registerRunway(mainRunway);
		sparrow101.getReady();
		mainRunway.land();
		sparrow101.land();
		
		System.out.println();
		
		IATCMediator atcMediator2 = new ATCMediator();
		Flight sparrow1012 = new Flight(atcMediator2);
		atcMediator2.registerFlight(sparrow1012);
		sparrow1012.getReady();
		sparrow1012.land();
		Runway mainRunway2 = new Runway(atcMediator2);
		atcMediator2.registerRunway(mainRunway2);
		mainRunway2.land();
		sparrow1012.land();
	}
}