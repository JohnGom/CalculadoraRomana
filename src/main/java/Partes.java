
public class Partes {
	
	    char[] carac1;
	    String[] division;
	public int unidades(String rom){
		int rel=0;
		int i;
		
		carac1 = rom.toCharArray();
		
		if(carac1[0]=='I' && rom!="IX" && rom!="IV"){
			for(i=1; i<=carac1.length; i++){
				rel=i;}
		}if(rom.equals("IX")){rel=9;
		}if(rom.equals("IV")){rel=4;
		}if(carac1[0]=='V'){
			for(i=1; i<=carac1.length; i++){
				rel=i+4;}}		
	return rel;
	}
	
	public int decena(String rom){
		int rel=0; int unid=0; int dece=0;
		int i;
		String decena="";
		String uni = "";
		int pos1=rom.indexOf("I");
	    int pos2=rom.indexOf("V");
		
		if((pos1!=-1 && pos2==-1) || (pos1!=-1 && pos1<pos2)){
		rom = new StringBuilder(rom).insert(pos1, '-').toString();
		division = rom.split("-");
		decena = division[0];
		uni = division[1];
		}
		if((pos2!=-1 && pos2<pos1) || (pos2!=-1 && pos1==-1)){
			rom = new StringBuilder(rom).insert(pos2, '-').toString();
			division = rom.split("-");
			decena = division[0];
			uni = division[1];
		}
		
		unid = unidades(uni);
		carac1 = decena.toCharArray();
		if(carac1[0]=='X' && decena!="XL" && decena!="XC"){
			for(i=1; i<=carac1.length; i++){
				dece=i*10;}
		}if(decena.equals("XL")){dece=40;}
		if(decena.equals("XC")){dece=90;}
		if(carac1[0]=='L'){
			for(i=1; i<=carac1.length; i++){
				dece=(i+4)*10;
				}
			}
		rel = dece+unid;
	return rel;
	
	}
	
	public int centena(String rom){
		int rel=0; int dece=0; int cent=0;
		int i;
		String centena="";
		String decen = "";
		int pos1=rom.indexOf("X");
	    int pos2=rom.indexOf("L");
		
		if((pos1!=-1 && pos2==-1) || (pos1!=-1 && pos1<pos2)){
		rom = new StringBuilder(rom).insert(pos1, '-').toString();
		division = rom.split("-");
		centena = division[0];
		decen = division[1];
		}
		if((pos2!=-1 && pos2<pos1) || (pos2!=-1 && pos1==-1)){
			rom = new StringBuilder(rom).insert(pos2, '-').toString();
			division = rom.split("-");
			centena = division[0];
			decen = division[1];
		}
		
		dece = decena(decen);
		
		carac1 = centena.toCharArray();
		if(carac1[0]=='C' && centena!="CD" && centena!="CM"){
			for(i=1; i<=carac1.length; i++){
				cent=i*100;}
		}if(centena.equals("CD")){cent=400;}
		if(centena.equals("CM")){cent=900;}
		if(carac1[0]=='D'){
			for(i=1; i<=carac1.length; i++){
				cent=(i+4)*100;
				}
			}
		rel = dece+cent;
	return rel;
	
	}
	public int miles(String rom){
		int rel=0; int cent=0; int mil=0;
		int i;
		String centena="";
		String miles = "";
		int pos1=rom.indexOf("C");
	    int pos2=rom.indexOf("D");
		
		if((pos1!=-1 && pos2==-1) || (pos1!=-1 && pos1<pos2)){
		rom = new StringBuilder(rom).insert(pos1, '-').toString();
		division = rom.split("-");
		miles = division[0];
		centena = division[1];
		}
		if((pos2!=-1 && pos2<pos1) || (pos2!=-1 && pos1==-1)){
			rom = new StringBuilder(rom).insert(pos2, '-').toString();
			division = rom.split("-");
			miles = division[0];
			centena = division[1];
		}
		
		cent = centena(centena);
		carac1 = miles.toCharArray();
		if(carac1[0]=='M'){
			for(i=1; i<=carac1.length; i++){
				mil=i*1000;}
		}
		rel = cent+mil;
	return rel;
}
}

