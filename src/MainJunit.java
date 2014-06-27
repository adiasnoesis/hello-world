import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MainJunit {

	private Main m;
	
	   @Before
	   public void setUp() throws Exception 
	   {
	      m = new Main();
	   }

	   @Test
	   public void testHelloEmpty() 
	   {
	      assertEquals(m.getName(),"");
	      assertEquals(m.getMessage(),"Hello!");
	   }
		
	   @Test
	   public void testHelloWorld() 
	   {
	      m.setName("World");
	      assertEquals(m.getName(),"World");
	      assertEquals(m.getMessage(),"Hello World!");
	   }
	
	

}
