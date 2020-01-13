package Telephone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelephoneNoTest
{

	@Test
	public void ValidNumber()
	{
		//Arrange
		String input = "+1 (608) 555-1212";
		String expectedResult = "+16085551212";
		TelephoneNumber cut = new TelephoneNumber(input);
		//Act
		String actualResult = cut.isValid();
		//Assert
		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void ()
	{
		//Arrange
		String input = "+1 (608) 555-1212";
		String expectedResult = "+16085551212";
		TelephoneNumber cut = new TelephoneNumber(input);
		//Act
		String actualResult = cut.isValid();
		//Assert
		assertEquals(expectedResult, actualResult);

	}

}
