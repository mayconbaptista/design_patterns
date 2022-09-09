
public class Main {
	public static void main (String [] args) {
		
		// Maycon Douglas Batista dos Santos – 11921BSI209, Sávio Dias Araújo - 11921BSI234
		
		Forno forno = new Forno();
		OnForno onForno = new OnForno(forno);
		OffForno offForno = new OffForno(forno);
		FornoSetTemperatura fornoSetTemperatura = new FornoSetTemperatura(forno); 
		FornoSetTimer fornoSetTimer = new FornoSetTimer(forno);
		
		Controle controleForno = new Controle();
		controleForno.setCommand(onForno, 0);
		controleForno.setCommand(offForno, 1);
		controleForno.setCommand(fornoSetTemperatura, 2);
		controleForno.setCommand(fornoSetTimer, 3);
		
		
		ArCondicionado ar = new ArCondicionado();
		OnArCondicionado onAr = new OnArCondicionado(ar);
		OffArCondicionado offAr = new OffArCondicionado(ar);
		ArCondicionadoSetTemperatura arSetTemperatura = new ArCondicionadoSetTemperatura(ar);
		
		Controle controleAr = new Controle(); 
		controleAr.setCommand(onAr, 0);
		controleAr.setCommand(offAr, 1);
		controleAr.setCommand(arSetTemperatura, 2);
		
		AparelhoDeSom som = new AparelhoDeSom ();
		OnAparelhoDeSom onSom = new OnAparelhoDeSom(som);
		OffAparelhoDeSom offSom = new OffAparelhoDeSom(som);
		AparelhoDeSomSetVolume somSetVolume = new AparelhoDeSomSetVolume(som);
		
		Controle controleSom = new Controle();
		controleSom.setCommand(onSom, 0);
		controleSom.setCommand(offSom, 1);
		controleSom.setCommand(somSetVolume, 2);
		
		
		
		PanelaEletrica panela = new PanelaEletrica();
		OnPanelaEletrica onPanela = new OnPanelaEletrica(panela);
		
		Controle controlePanela = new Controle();
		controlePanela.setCommand(onPanela, 0);
		
		controleForno.PressBTN(0);
		controleForno.PressBTN(1);
		controleForno.PressBTN(2);
		controleForno.PressBTN(3);
		
		controleAr.PressBTN(0);
		controleAr.PressBTN(1);
		controleAr.PressBTN(2);
		
		controleSom.PressBTN(0);
		controleSom.PressBTN(1);
		controleSom.PressBTN(2);
		
		controlePanela.PressBTN(0);
		
	}
}
