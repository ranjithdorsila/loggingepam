package loggingepam;
import org.apache.log4j.Logger;
public class ConstructionCost {
	static final Logger l=Logger.getLogger("Sample.class");
	String stnadard_of_material;
	double area_of_house,cost_estimated;
	String automated_home;
	ConstructionCost(String stnadard_of_material,double area_of_house,String automated_home)
	{
		l.info("entered into calculting cost");
		this.stnadard_of_material=stnadard_of_material;
		this.area_of_house=area_of_house;
		this.automated_home=automated_home;
	}
	double estimatingCostOfConstruction()
	{
		if(stnadard_of_material.equals("normal"))
		{
			cost_estimated=1200*area_of_house;
		}
		else if(stnadard_of_material.equals("above"))
		{
			cost_estimated=1500*area_of_house;
		}
		else if(stnadard_of_material.equals("high"))
		{
			if(automated_home.equals("yes"))
			{
				cost_estimated=2500*area_of_house;
			}
			else
			{
				cost_estimated=1800*area_of_house;
			}
		}
		return cost_estimated;
	}

}
