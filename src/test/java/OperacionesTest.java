
import static org.junit.Assert.*;

import org.junit.Test;


public class OperacionesTest {

	@Test
	public void suma() {
		
		String dato1 = "XLIX"; 
		String dato2 = "DLXXXI"; 
		String resul = "";
		
		Operaciones oper = new Operaciones();
	
		resul=oper.suma(dato1, dato2);
		
		assertEquals("DCXXX", resul);
	}
	
	@Test
    public void resta() {
		
		String dato1 = "CCXIV"; 
		String dato2 = "CXXXIV"; 
		String resul = "";
		
		Operaciones oper = new Operaciones();
	
		resul=oper.resta(dato1, dato2);
		
		assertEquals("LXXX", resul);
	}
	
	@Test
    public void multiplicacion() {
		
		String dato1 = "CXLVII"; 
		String dato2 = "III";
		String resul = "";
		
		Operaciones oper = new Operaciones();
	
		resul=oper.multi(dato1, dato2);
		
		assertEquals("CDXLI", resul);
	}
	
	@Test
    public void division() {
		
		String dato1 = "MMMDCXII"; 
		String dato2 = "IV";
		String resul = "";
		
		Operaciones oper = new Operaciones();
	
		resul=oper.divsion(dato1, dato2);
		
		assertEquals("CMIII", resul);
	}
	

}
