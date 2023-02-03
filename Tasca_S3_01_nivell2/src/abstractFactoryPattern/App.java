package abstractFactoryPattern;

public class App {

	public static void main(String[] args) {

		Agenda_AbstractFactory ag = FactoryProducer.getFactory("PhoneNumber");
		PhoneNumber pn = ag.getPhoneNumber("Belgium");
		pn.addPhoneNumber("Remí", "34982145");
		
		Agenda_AbstractFactory ag1 = FactoryProducer.getFactory("PhoneNumber");
		PhoneNumber pn1 = ag1.getPhoneNumber("Switzerland");
		pn1.addPhoneNumber("Sophie", "56989182");
		
		Agenda_AbstractFactory ag2 = FactoryProducer.getFactory("Address");
		Address ad = ag2.getAddress("Germany");
		ad.addAddress("Alexander", "Spreuerhofstraße 57", "72764");
		
		Agenda_AbstractFactory ag3 = FactoryProducer.getFactory("Address");
		Address ad1 = ag3.getAddress("Belgium");
		ad1.addAddress("Charlotte", "Rue du Trône 133", "1050");
		
	}

}
