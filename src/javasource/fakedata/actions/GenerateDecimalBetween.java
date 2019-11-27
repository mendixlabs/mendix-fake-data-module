// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package fakedata.actions;

import java.math.BigDecimal;
import java.util.Random;
import com.github.javafaker.Faker;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class GenerateDecimalBetween extends CustomJavaAction<java.math.BigDecimal>
{
	private java.lang.Long Min;
	private java.lang.Long Max;
	private java.lang.Long NumberOfDecimals;

	public GenerateDecimalBetween(IContext context, java.lang.Long Min, java.lang.Long Max, java.lang.Long NumberOfDecimals)
	{
		super(context);
		this.Min = Min;
		this.Max = Max;
		this.NumberOfDecimals = NumberOfDecimals;
	}

	@java.lang.Override
	public java.math.BigDecimal executeAction() throws Exception
	{
		// BEGIN USER CODE
		Random random = new Random(this.getContext().getRequestStartTime());
		Faker faker = new Faker(random);
		
		Long min = (this.Min > this.Max) ? this.Max : this.Min;
		Long max = (this.Max < this.Min) ? this.Min : this.Max;
		double result = faker.number().randomDouble(this.NumberOfDecimals.intValue(), min, max);
		return BigDecimal.valueOf(result);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GenerateDecimalBetween";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
