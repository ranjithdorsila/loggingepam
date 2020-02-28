package loggingepam;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {
	 @Test
	    public void testingConstructionCost()
	    {
	    	ConstructionCost  constructioncostofhouse=new ConstructionCost("normal",30,"no");
	    	double res=constructioncostofhouse.estimatingCostOfConstruction();
	        assertEquals(36000,res,0);
	    }
	    @Test
	    public void testingSimpleInerest()
	    {
	    	CalculatingInterest  interest=new CalculatingInterest(1000,2,3);
	    	double res=interest.calculatingSimpleInterest();
	        assertEquals(60,res,0);
	    }
	    @Test
	    public void testingCompoundInerest()
	    {
	    	CalculatingInterest  interest=new CalculatingInterest(1000,1,3);
	    	double res=interest.calculatingCompoundInterest();
	        assertEquals(30,res,1);
	    }
}
