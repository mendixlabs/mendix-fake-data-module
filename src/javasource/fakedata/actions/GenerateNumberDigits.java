// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package fakedata.actions;

import java.util.Random;
import com.github.javafaker.Faker;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class GenerateNumberDigits extends CustomJavaAction<java.lang.Long>
{
	private java.lang.Long NumberOfDigits;
	private java.lang.Boolean Strict;

	public GenerateNumberDigits(IContext context, java.lang.Long NumberOfDigits, java.lang.Boolean Strict)
	{
		super(context);
		this.NumberOfDigits = NumberOfDigits;
		this.Strict = Strict;
	}

	@java.lang.Override
	public java.lang.Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		Random random = new Random(this.getContext().getRequestStartTime());
		Faker faker = new Faker(random);
		
		return faker.number().randomNumber(this.NumberOfDigits.intValue(), this.Strict);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GenerateNumberDigits";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
