

public class Operaciones {	
	
	Partes oper = new Partes();
	String numero="";
	int resulFin=0; int num1=0; int num2=0;	
	
	public int verificar(String dato){
		int num = 0;
		if(dato.charAt(0)=='I' || dato.charAt(0)=='V'){
			num = oper.unidades(dato);}
		if(dato.charAt(0)=='X' || dato.charAt(0)=='L'){
			num = oper.decena(dato);}
		if(dato.charAt(0)=='C' || dato.charAt(0)=='D'){
			num = oper.centena(dato);}
		if(dato.charAt(0)=='M'){
			num = oper.miles(dato);}
		return num;
	}
	
	public String suma(String dato1, String dato2) {
		
		num1=verificar(dato1);
		num2=verificar(dato2);
		resulFin=num1+num2;
		numero=aNumRomano(resulFin);
		return numero;
	}
	
	public String resta(String dato1, String dato2) {

		num1=verificar(dato1);
		num2=verificar(dato2);
		resulFin=num1-num2;
		numero=aNumRomano(resulFin);
		return numero;
	}
	
	public String multi(String dato1, String dato2) {

		num1=verificar(dato1);
		num2=verificar(dato2);
		resulFin=num1*num2;
		numero=aNumRomano(resulFin);
		return numero;
	}
	
	public String divsion(String dato1, String dato2) {

		num1=verificar(dato1);
		num2=verificar(dato2);
		resulFin=num1/num2;
		numero=aNumRomano(resulFin);
		return numero;
	}
	
	public String aNumRomano(int num){
		String numRomano="";
		
		int i, miles, centenas, decenas, unidades;
	  
		miles = num / 1000;
	    centenas = num / 100 % 10;
	    decenas = num / 10 % 10;
	    unidades = num % 10;
	    
	    for(i=0; i<miles; i++){
	    	numRomano=numRomano+"M";
	    }
	    
	    if(centenas==9){
			numRomano=numRomano+"CM";
		}else if(centenas>=5){
			numRomano=numRomano+"D";
			for(i=6; i<=centenas; i++){
				numRomano=numRomano+"C";
			}}else if(centenas==4){
				numRomano=numRomano+"CD";
			}else if (centenas<4){
				for(i=1; i<=centenas; i++){
					numRomano=numRomano+"C";
		}}
	    
	    if(decenas==9){
			numRomano=numRomano+"XC";
		}else if(decenas>=5){
			numRomano=numRomano+"L";
			for(i=6; i<=decenas; i++){
				numRomano=numRomano+"X";
			}}else if(decenas==4){
				numRomano=numRomano+"XL";
			}else if (decenas<4){
				for(i=1; i<=decenas; i++){
					numRomano=numRomano+"X";
		}}
	    	
		if(unidades==9){
			numRomano=numRomano+"IX";
		}else if(unidades>=5){
			numRomano=numRomano+"V";
			for(i=6; i<=unidades; i++){
				numRomano=numRomano+"I";
			}}else if(unidades==4){
				numRomano=numRomano+"IV";
			}else if (unidades<4){
				for(i=1; i<=unidades; i++){
					numRomano=numRomano+"I";}
			}				
		return numRomano;
	}
}
	
