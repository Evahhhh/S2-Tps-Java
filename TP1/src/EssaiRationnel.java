/**
 * This class test Rationnel.java
 * @author Eve-anne Offredi
*/

public class EssaiRationnel{
	public static void main(String[] args){
		//test constructeur reduit, pgcd et toString
		System.out.println("Test constructeur,pgcd , toString et reduit");
		
		//test d'un cas normal
		System.out.println("Cas normaux :");
		Rationnel n1 = new Rationnel(9,-18);
		String n1Res = n1.toString();
		String n1Rep = "-1/2";
		System.out.println(n1Res);
		if(n1Res.equals(n1Rep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n2 = new Rationnel(1,-1);
		String n2Res = n2.toString();
		String n2Rep = "-1/1";
		if(n2Res.equals(n2Rep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n3 = new Rationnel(10,5);
		String n3Res = n3.toString();
		String n3Rep = "2/1";
		if(n3Res.equals(n3Rep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n4 = new Rationnel(12,0);
		String n4Res = n4.toString();
		String n4Rep = "12/1";
		if(n4Res.equals(n4Rep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		//////////////////////////////////////////////////////////////////////////
		//test inverse
		System.out.println();
		System.out.println("Test inverse");
		
		//test d'un cas normal
		System.out.println("Cas normal");
		Rationnel n1Inv = n1.inverse();
		String n1InvRes = n1Inv.toString();
		String n1InvRep = "-2/1";
		if(n1InvRes.equals(n1InvRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n2Inv = n2.inverse();
		String n2InvRes = n2Inv.toString();
		String n2InvRep = "-1/1";
		System.out.println(n2InvRes);
		if(n2InvRes.equals(n2InvRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n3Inv = n3.inverse();
		String n3InvRes = n3Inv.toString();
		String n3InvRep = "1/2";
		System.out.println(n3InvRes);
		if(n3InvRes.equals(n3InvRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n4Inv = n4.inverse();
		String n4InvRes = n4Inv.toString();
		String n4InvRep = "1/12";
		System.out.println(n4InvRes);
		if(n4InvRes.equals(n4InvRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		///a///////////////////////////////////////////////////////////////////////
		//test ajoute
		System.out.println();
		System.out.println("Test ajoute");
		
		//test d'un cas normal
		System.out.println("Cas normal");
		Rationnel n1Ajt = n1.ajoute(n1Inv);
		String n1AjtRes = n1Ajt.toString();
		String n1AjtRep = "-5/2";
		if(n1AjtRes.equals(n1AjtRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n2Ajt = n2.ajoute(n1);
		String n2AjtRes = n2Ajt.toString();
		String n2AjtRep = "-3/2";
		if(n2AjtRes.equals(n2AjtRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n3Ajt = n3.ajoute(n2Inv);
		String n3AjtRes = n3Ajt.toString();
		String n3AjtRep = "1/1";
		if(n3AjtRes.equals(n3AjtRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n4Ajt = n4.ajoute(n4Inv);
		String n4AjtRes = n4Ajt.toString();
		String n4AjtRep = "145/12";
		if(n4AjtRes.equals(n4AjtRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		//test d'un null
		System.out.println("Cas limite : null");
		if(n1.ajoute(null)==null) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		//////////////////////////////////////////////////////////////////////////
		//test soustrait
		System.out.println();
		System.out.println("Test soustrait");
		
		//test d'un cas normal
		System.out.println("Cas normal");
		Rationnel n1Sous = n1.soustrait(n1Inv);
		String n1SousRes = n1Sous.toString();
		String n1SousRep = "-3/2";
		if(n1SousRes.equals(n1SousRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n2Sous = n2.soustrait(n1Inv);
		String n2SousRes = n2Sous.toString();
		String n2SousRep = "-1/1";
		if(n2SousRes.equals(n2SousRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n3Sous = n3.soustrait(n3Inv);
		String n3SousRes = n3Sous.toString();
		String n3SousRep = "-3/2";
		if(n3SousRes.equals(n3SousRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n4Sous = n4.soustrait(n3);
		String n4SousRes = n4Sous.toString();
		String n4SousRep = "-10/1";
		if(n4SousRes.equals(n4SousRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		//test d'un null
		System.out.println("Cas limite : null");
		if(n1.soustrait(null)==null) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		//////////////////////////////////////////////////////////////////////////
		//test multiplie
		System.out.println();
		System.out.println("Test multiplie");
		
		//test d'un cas normal
		System.out.println("Cas normal");
		Rationnel n1Mult = n1.multiplie(n1Inv);
		String n1MultRes = n1Mult.toString();
		String n1MultRep = "1/1";
		if(n1MultRes.equals(n1MultRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n2Mult = n2.multiplie(n2Inv);
		String n2MultRes = n2Mult.toString();
		String n2MultRep = "1/1";
		if(n2MultRes.equals(n2MultRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n3Mult = n3.multiplie(n2);
		String n3MultRes = n3Mult.toString();
		String n3MultRep = "-2/1";
		if(n3MultRes.equals(n3MultRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		Rationnel n4Mult = n4.multiplie(n3);
		String n4MultRes = n4Mult.toString();
		String n4MultRep = "24/1";
		if(n4MultRes.equals(n4MultRep)) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		//test d'un null
		System.out.println("Cas limite : null");
		if(n1.multiplie(null)==null) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		/////////////////////////////////////////////////////////////////////////
		//test egale
		System.out.println();
		System.out.println("Test egale");
		
		//test d'un cas normal
		System.out.println("Cas normal");
		
		//test de deux rationnels différents
		boolean egl = n1.egale(n1Inv);
		boolean n1EglRes = false;
		if(egl==n1EglRes) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		//test de deux mêmes rationnels
		boolean egl2 = n1.egale(n1);
		n1EglRes = true;
		if(egl2==n1EglRes) System.out.println("Test OK");
		else System.out.println("Erreur du test");
		
		//test d'un null
		System.out.println("Cas limite : null");
		if(n1.egale(null)==null) System.out.println("Test OK");
		else System.out.println("Erreur du test");
	}
}
