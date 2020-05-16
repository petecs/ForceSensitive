/**
* A basic class ForceSensitive class that inherits from the basic Person class.
*
* @author	Peter Akala
* @version	2.0
*
*/

// using Code Complete naming conventions
// camelCasing for variables; PascalCasing for functions/methods, classes, namespaces
// underscore + camelCasing for class variables, fields,class members ~ anything belonging to the class except functions/methods
// 		underscores make it east to differentiate from local variables
//		allows me to use the same names for parameters and class members without confusing them
//		allows me to not have to use "this.variableName = variableName" statements

// @TODO - get all of the values for the _allForcePowersArray into an ArrayList in a better way; for loop did not work
// @TODO - switch to using enumerated types

import java.util.Arrays;
import java.util.ArrayList;

public class ForceSensitive extends Person
{
	private String _alignment;
	private String[] _alignmentArray = {"Light", "Dark", "Force Adept"};
	private ArrayList<String> _alignmentList = new ArrayList<>(Arrays.asList(_alignmentArray));

	private String _affiliation;
	private String[] _affiliationArray = {"Jedi", "Sith", "none"};
	private ArrayList<String> _affiliationList = new ArrayList<>(Arrays.asList(_affiliationArray));

	private String _forcePower;
	
	private String[] _forcePowersLight = {"Force Blinding", "Force Heal", "Force Stun", "Mind Trick", "none"};
	private ArrayList<String> _forcePowersLightList = new ArrayList<>(Arrays.asList(_forcePowersLight));
	
	private String[] _forcePowersDark = {"Force Choke", "Force Corrupt", "Force Crush", "Force Lightning", "none"};
	private ArrayList<String> _forcePowersDarkList = new ArrayList<>(Arrays.asList(_forcePowersDark));
	
	private String[] _forcePowersNeutral = {"Force Jump", "Force Push", "Force Speed", "Force Stealth", "none"};
	private ArrayList<String> _forcePowersNeutralList = new ArrayList<>(Arrays.asList(_forcePowersNeutral));

	// @TODO - get all of the values for the _allForcePowersArray into an ArrayList in a better way; for loop did not work
	private String[] _allForcePowersArray = {"Force Blinding", "Force Heal", "Force Stun", "Mind Trick", "Force Choke", "Force Corrupt", "Force Crush", "Force Lightning", 
											"Force Jump", "Force Push", "Force Speed", "Force Stealth", "none"};
	private ArrayList<String> _allForcePowersList = new ArrayList<>(Arrays.asList(_allForcePowersArray));

	private String _lightSaberColor;
	private String[] _saberColors = {"blue", "green", "purple", "red", "white", "yellow", "none"};
	private ArrayList _saberColorsList = new ArrayList<>(Arrays.asList(_saberColors));


	// constructors
	/**
	* No argument constructor that creates a generic ForceSensitive object
	*/
	public ForceSensitive()
	{
		//super();
		super();
		_alignment = "Force Adept";
		_affiliation = "none";
		_forcePower = "none";
		_lightSaberColor = "none";
	}

	/**
	* A constructor that creates a ForceSensitive object with the most common attributes set at construction time.
	*
	* @param 	firstN 		The first or given name of the new ForceSensitive object
	* @param	lastN		The last or family name of the new ForceSensitive object
	* @param	gender 		The gender or sex of the new ForceSensitive object
	* @param	age 		The age in years of the new ForceSensitive object (age must be a positive integer less than 128)
	* @param	alignment 	The Force alignment of the new ForceSensitive object (valid alignments are "Light", "Dark", and "Force Adept")
	* @param	affiliation	The affiliation of the new ForceSensitive object (valid affiliations are "Jedi", "Sith", and "none")
	* @throws	IllegalArgumentException Thrown if the passed in gender is not "male", "female", or "unspecified" 
	*				if the age is negative, if the alignment is not "Light", "Dark", or "Force Adept", or if the affiliation is not "Jedi", "Sith", or "none"
	*/
	public ForceSensitive(String firstN, String lastN, String gender, byte age, String alignment, String affiliation)
	{
		super(firstN, lastN, gender, age);

		// validate alingment and set if valid
		_alignment = ValidateAlignmentConstructor(alignment);

		// validate affiliation and set if valid
		_affiliation = ValidateAffiliationConstructor(affiliation);

		// initialize remaining variables to avoid NullPointerException later on
		_forcePower = "none";
		_lightSaberColor = "none";
	}

	/**
	* A constructor that creates a ForceSensitive object with all of the attributes set at construction time.
	*
	* @param 	firstN 				The first or given name of the new ForceSensitive object
	* @param	lastN				The last or family name of the new ForceSensitive object
	* @param	middleN				The The middle name of the new ForceSensitive object
	* @param	title				The courtesy title of the new ForceSensitive object (valid values are "Mr", "Mrs", "Miss", "Ms", and "Dr")
	* @param	suffix				The name suffix of the new ForceSensitive object (valid values are "Jr", "II", "III", "IV", and "PhD")
	* @param	gender 				The gender or sex of the new ForceSensitive object
	* @param	age 				The age in years of the new ForceSensitive object (age must be a positive integer less than 128)
	* @param	alignment 			The Force alignment of the new ForceSensitive object (valid alignments are "Light", "Dark", and "Force Adept")
	* @param	affiliation			The affiliation of the new ForceSensitive object (valid affiliations are "Jedi", "Sith", and "none")
	* @param	forcePower			The Force power of the new ForceSensitive object.
	* 								<p><i>Note:</i></p><i>Valid Light Force Powers are {"Force Blinding", "Force Heal", "Force Stun", "Mind Trick"}</i>
	*								<p><i>Valid Dark Force Powers are {"Force Choke", "Force Corrupt", "Force Crush", "Force Lightning"}</i></p>
	*								<p><i>Valid Neutral Force Powers are {"Force Jump", "Force Push", "Force Speed", "Force Stealth"}</i></p>
	* @param	lightSaberColor		The lightsaber color of the new ForceSensitive object.
	*								<p><i>Note: Valid lightsaber colors are {"blue", "green", "purple", "red", "white", "yellow"}</i></p>
	* @throws	IllegalArgumentException Thrown if the passed in gender is not "male", "female", or "unspecified", if the age is negative, if the alignment is not "Light", "Dark", or "Force Adept",
	*										or if the affiliation is not "Jedi", "Sith", or "none", or if the lightsaber color is not "blue", "green", "purple", "red", "white", or "yellow"
	*/
	public ForceSensitive(String firstN, String lastN, String middleN, String title, String suffix, String gender, byte age, String alignment, String affiliation, String forcePower, String lightSaberColor)
	{
		super(firstN, lastN, middleN, title, suffix, gender, age);

		// alignment
		_alignment = ValidateAlignmentConstructor(alignment);

		// affiliation; check alignment for compatible value
		_affiliation = ValidateAffiliationConstructor(affiliation);

		// forcePower
		_forcePower = ValidateForcePowerConstructor(forcePower);

		// lightSaberColor
		_lightSaberColor = ValidateLightSaberColor(lightSaberColor);

	}


	// alignment accessor (getter) and mutator (setter)
	/**
	* A method to retreive the alignment of this ForceSensitive object
	*
	* @return	_alignment	The alignment of this ForceSensitive object
	*/
	public String GetAlignment()
	{
		return _alignment;
	}
	/**
	* A set method that sets the ForceSensitive object's alignment (valid values are "Light", "Dark", and "Force Adept")
	*
	* @param	alignment					The alignment of the ForceSensitive object
	* @throws	IllegalArgumentException	Thrown if the passed in alignment is invalid; ForceSensitive object cannot have Light alignment with Sith affiliation or Dark alignment with Jedi affiliation
	*/
	public void SetAlignment(String alignment)
	{
		// validate alignment and set alignment attribute if valid
		if (ValidateSetAlignment(alignment))
		{
			if (alignment.equals("Light") && !GetAffiliation().equals("Sith") && (_forcePowersLightList.contains(GetForcePower()) || _forcePowersNeutralList.contains(GetForcePower())))
			{
				_alignment = alignment;
			}
			else if (alignment.equals("Dark") && !GetAffiliation().equals("Jedi") && (_forcePowersDarkList.contains(GetForcePower()) || _forcePowersNeutralList.contains(GetForcePower())))
			{
				_alignment = alignment;
			}
			else if (alignment.equals("Force Adept") && _affiliationList.contains(GetAffiliation()) && _allForcePowersList.contains(GetForcePower()))
			{
				_alignment = alignment;
			}
		}
	}

	// affiliation accessor (getter) and mutator (setter)
	/**
	* A method to retreive the affiliation of this ForceSensitive object
	*
	* @return	_affiliation The affiliation of this ForceSensitive object
	*/
	public String GetAffiliation()
	{
		return _affiliation;
	}
	/**
	* A set method that sets the ForceSensitive object's affiliation (valid values are "Jedi", "Sith", and "none")
	*
	* @param	affiliation					The affiliation of the ForceSensitive object
	* @throws	IllegalArgumentException	Thrown if the passed in affiliation is invalid; ForceSensitive object cannot have Jedi affiliation with Dark alignment or Sith affiliation with Light affiliation
	*/
	public void SetAffiliation(String affiliation)
	{
		// validate affiliation value and set affiliation attribute if valid
		if (ValidateSetAffiliation(affiliation))
		{
			if (GetAlignment().equals("Light") && (affiliation.equals("Jedi") || affiliation.equals("none")))
			{
				_affiliation = affiliation;
			}
			else if (GetAlignment().equals("Dark") && (affiliation.equals("Sith") || affiliation.equals("none")))
			{
				_affiliation = affiliation;
			}
			else if (GetAlignment().equals("Force Adept") && _affiliationList.contains(affiliation))
			{
				_affiliation = affiliation;
			}
		}
	}

	// forcePower accessor (getter) and mutator (setter)
	/**
	* A method to retreive the Force power of this ForceSensitive object
	*
	* @return	_forcePower The Force power of this ForceSensitive object
	*/
	public String GetForcePower()
	{
		return _forcePower;
	}
	/**
	* A set method that sets the ForceSensitive object's affiliation (valid values are "Jedi", "Sith", and "none")
	*
	* @param	forcePower					The forcePower of the ForceSensitive object
	* @throws	IllegalArgumentException	Thrown if the passed in Force power is invalid; ForceSensitive object cannot have Light Force Powers with Dark alingment or Sith affiliation
	*										or Dark Force Powers with Light alignment or Jedi affiliation
	*/
	public void SetForcePower(String forcePower)
	{
		if (ValidateSetForcePower(forcePower))
		{
			if (GetAlignment().equals("Light") && (_forcePowersLightList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
			{
				_forcePower = forcePower;
			}
			else if (GetAlignment().equals("Dark") && (_forcePowersDarkList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
			{
				_forcePower = forcePower;
			}
			else if (GetAlignment().equals("Force Adept") && (_allForcePowersList.contains(forcePower)))
			{
				_forcePower = forcePower;
			}
		}
	}

	// lightSaberColor accessor (getter) and mutator (setter)
	/**
	* A method to retreive the lightsaber color of this ForceSensitive object
	*
	* @return	_lightSaberColor The lightsaber color of this ForceSensitive object
	*/
	public String GetLightSaberColor()
	{
		return _lightSaberColor;
	}
	/**
	* A set method that sets the ForceSensitive object's affiliation (valid values are "Jedi", "Sith", and "none")
	*
	* @param	lightSaberColor				The lightsaber color of the ForceSensitive object
	* @throws	IllegalArgumentException	Thrown if the passed in lightsaber color is invalid; ForceSensitive object can only have light saber colors of "blue", "green", "red", "white",
	*										, "yellow", and "purple". ForceSensitive object can only have a lightsaber color of "purple" if the first name is "Samuel", the middle name is "L" or "L."
	*										, and the last name is "Jackson"
	*/
	public void SetLightSaberColor(String lightSaberColor)
	{
		_lightSaberColor = ValidateLightSaberColor(lightSaberColor);
	}


	/*
	* private class methods
	*/
	private String ValidateAlignmentConstructor(String alignment)
	{
		if (alignment.equals("Light") || alignment.equals("Dark") || alignment.equals("Force Adept"))
		{
			return alignment;
		}
		else
		{
			throw new IllegalArgumentException("Alignment must be \"Light\", \"Dark\", or \"Force Adept\"");
		}
	}

	private String ValidateAffiliationConstructor(String affiliation)
	{
		if (GetAlignment().equals("Light") && (affiliation.equals("Jedi") || affiliation.equals("none")))
		{
			affiliation = affiliation;
		}
		else if (GetAlignment().equals("Dark") && (affiliation.equals("Sith") || affiliation.equals("none")))
		{
			affiliation = affiliation;
		}
		else if (GetAlignment().equals("Force Adept") && (affiliation.equals("Jedi") || affiliation.equals("Sith") || affiliation.equals("none")))
		{
			affiliation = affiliation;
		}
		else if (GetAlignment().equals("Light") && affiliation.equals("Sith"))
		{
			throw new IllegalArgumentException("Light alignment can only have affiliation of \"Jedi\" or \"none\"");
		}
		else if (GetAlignment().equals("Dark") && affiliation.equals("Jedi"))
		{
			throw new IllegalArgumentException("Dark alignment can only have affiliation of \"Sith\" or \"none\"");
		}
		else if (GetAlignment().equals("Force Adept") && !(affiliation.equals("Jedi") || affiliation.equals("Sith") || affiliation.equals("none")))
		{
			throw new IllegalArgumentException("Force Adept alignment can only have affiliation of \"Jedi\", \"Sith\", or \"none\"");
		}
		else if (!(_affiliationList.contains(affiliation)))
		{
			throw new IllegalArgumentException("Affiliation can only be \"Jedi\", \"Sith\", or \"none\"");
		}

		return affiliation;
	}

	private String ValidateForcePowerConstructor(String forcePower)
	{
		if (GetAlignment().equals("Light") && (_forcePowersLightList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			forcePower = forcePower;
		}
		else if (GetAlignment().equals("Dark") && (_forcePowersDarkList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			forcePower = forcePower;
		}
		else if (GetAlignment().equals("Force Adept") && (_forcePowersLightList.contains(forcePower) || _forcePowersDarkList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			forcePower = forcePower;
		}
		else if (GetAlignment().equals("Light") && !(_forcePowersLightList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Light alignment cannot have Dark Force Powers.\nLight Force Powers: " + Arrays.toString(_forcePowersLight) + "\nNeutral Force Powers: "
				+ Arrays.toString(_forcePowersNeutral));
		}
		else if (GetAlignment().equals("Dark") && !(_forcePowersDarkList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Dark alignment cannot have Light Force Powers\nDark Force Powers: " + Arrays.toString(_forcePowersDark) + "\nNeutral Force Powers: "
				+ Arrays.toString(_forcePowersNeutral));
		}
		else if (GetAlignment().equals("Force Adept") && !(_forcePowersLightList.contains(forcePower) || _forcePowersDarkList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Force Adept alignment can have the following powers:\nLight Force Powers: " + Arrays.toString(_forcePowersLight) + "\nDark Force Powers :"
				+ Arrays.toString(_forcePowersDark) + "\nNeutral Force Powers: " + Arrays.toString(_forcePowersNeutral));
		}
		else if (!(_allForcePowersList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Force Power must be one of the following:\nLight Force Powers: " + Arrays.toString(_forcePowersLight) + "\nDark Force Powers :"
				+ Arrays.toString(_forcePowersDark) + "\nNeutral Force Powers: " + Arrays.toString(_forcePowersNeutral));
		}

		return forcePower;
	}

	private String ValidateLightSaberColor(String lightSaberColor)
	{
		if (_saberColorsList.contains(lightSaberColor) && lightSaberColor != "purple")
		{
			lightSaberColor = lightSaberColor;
		}
		else if (lightSaberColor.equals("purple") && (getFirstName().equals("Samuel") && getLastName().equals("Jackson") && (getMiddleName().equals("L") || getMiddleName().equals("L."))))
		{
			lightSaberColor = lightSaberColor;
		}
		else if (lightSaberColor.equals("purple") && !(getFirstName().equals("Samuel") && getLastName().equals("Jackson") && (getMiddleName().equals("L") || getMiddleName().equals("L."))))
		{
			throw new IllegalArgumentException("Only person's named \"Samuel L Jackson\" can have a purple lightsaber");
		}
		else if (!(_saberColorsList.contains(lightSaberColor)))
		{
			throw new IllegalArgumentException("Lightsabers can only have the colors: " + Arrays.toString(_saberColors));
		}

		return lightSaberColor;
	}

	private boolean ValidateSetAlignment(String alignment)
	{
		if (alignment.equals("Light") && GetAffiliation().equals("Sith"))
		{
			throw new IllegalArgumentException("Light alignment can only be affiliated with \"Jedi\" or\"Force Adept\"");
		}
		else if (alignment.equals("Dark") && GetAffiliation().equals("Jedi"))
		{
			throw new IllegalArgumentException("Dark alignment can only be affiliated with \"Sith\" or\"Force Adept\"");
		}
		else if (alignment.equals("Force Adept") && !(_affiliationList.contains(GetAffiliation())))
		{
			throw new IllegalArgumentException("Force Adept alignment can only be affiliated with \"Jedi\", \"Sith\", or \"none\"");
		}
		else if (GetAlignment().equals("Light") && !(_forcePowersLightList.contains(GetForcePower()) || _forcePowersNeutralList.contains(GetForcePower())))
		{
			throw new IllegalArgumentException("Light alignment cannot have Dark Force Powers");
		}
		else if (GetAlignment().equals("Dark") && !(_forcePowersDarkList.contains(GetForcePower()) || _forcePowersNeutralList.contains(GetForcePower())))
		{
			throw new IllegalArgumentException("Dark alignment cannot have Light Force Powers");
		}
		else if (GetAlignment().equals("Force Adept") && !(_allForcePowersList.contains(GetForcePower())))
		{
			throw new IllegalArgumentException("Dark alignment cannot have Light Force Powers");
		}
		else if (!(_alignmentList.contains(alignment)))
		{
			throw new IllegalArgumentException("Alignment must be \"Light\", \"Dark\", or \"Force Adept\"");
		}

		return true;
	}

	private boolean ValidateSetAffiliation(String affiliation)
	{
		if (GetAlignment().equals("Light") && affiliation.equals("Sith"))
		{
			throw new IllegalArgumentException("Light alignment can only have affiliation of \"Jedi\" or \"none\"");
		}
		else if (GetAlignment().equals("Dark") && affiliation.equals("Jedi"))
		{
			throw new IllegalArgumentException("Dark alignment can only have affiliation of \"Sith\" or \"none\"");
		}
		else if (GetAlignment().equals("Force Adept") && !(_affiliationList.contains(affiliation)))
		{
			throw new IllegalArgumentException("Force Adept alignment can only have affiliation of \"Jedi\", \"Sith\", or \"none\"");
		}
		else if (affiliation.equals("Jedi") && !(_forcePowersLightList.contains(GetForcePower()) || _forcePowersNeutralList.contains(GetForcePower())))
		{
			throw new IllegalArgumentException("Jedi affiliation cannot have Dark Force Powers\nLight Force Powers: " + Arrays.toString(_forcePowersLight) + "\nNeutral Force Powers: "
				+ Arrays.toString(_forcePowersNeutral));
		}
		else if (affiliation.equals("Sith") && !(_forcePowersDarkList.contains(GetForcePower()) || _forcePowersNeutralList.contains(GetForcePower())))
		{
			throw new IllegalArgumentException("Sith affiliation cannot have Light Force Powers\nDark Force Powers: " + Arrays.toString(_forcePowersDark) + "\nNeutral Force Powers: "
				+ Arrays.toString(_forcePowersNeutral));
		}
		else if (affiliation.equals("None") && !(_allForcePowersList.contains(GetForcePower())))
		{
			throw new IllegalArgumentException("An affiliation of \"None\" can have the following powers: " + Arrays.toString(_allForcePowersArray));
		}
		else if (!(_affiliationList.contains(affiliation)))
		{
			throw new IllegalArgumentException("Affiliation must be \"Jedi\", \"Sith\", or \"None\"");
		}

		return true;
	}

	private boolean ValidateSetForcePower(String forcePower)
	{
		if (GetAlignment().equals("Light") && !(_forcePowersLightList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Light alignment can only have Light or Neutral Force powers.\nLight Force Powers: " + Arrays.toString(_forcePowersLight) + "\nNeutral Force Powers: "
				+ Arrays.toString(_forcePowersNeutral));
		}
		else if (GetAlignment().equals("Dark") && !(_forcePowersDarkList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Dark alignment can only have Dark or Neutral Force powers.\nDark Force Powers: " + Arrays.toString(_forcePowersDark) + "\nNeutral Force Powers: "
				+ Arrays.toString(_forcePowersNeutral));
		}
		else if (GetAlignment().equals("Force Adept") && !(_allForcePowersList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Force Adept alignment can have the following powers:\nLight Force Powers: " + Arrays.toString(_forcePowersLight) + "\nDark Force Powers :"
				+ Arrays.toString(_forcePowersDark) + "\nNeutral Force Powers: " + Arrays.toString(_forcePowersNeutral));
		}
		else if (GetAffiliation().equals("Jedi") && !(_forcePowersLightList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Jedi affiliation can only have Light or Neutral Force powers.\nLight Force Powers: " + Arrays.toString(_forcePowersLight) + "\nNeutral Force Powers: "
				+ Arrays.toString(_forcePowersNeutral));
		}
		else if (GetAffiliation().equals("Sith") && !(_forcePowersDarkList.contains(forcePower) || _forcePowersNeutralList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Sith affiliation can only have Dark or Neutral Force powers.\nDark Force Powers: " + Arrays.toString(_forcePowersDark) + "\nNeutral Force Powers: "
				+ Arrays.toString(_forcePowersNeutral));
		}
		else if (GetAffiliation().equals("None") && !(_allForcePowersList.contains(forcePower)))
		{
			throw new IllegalArgumentException("An affiliation of \"None\" can have the following powers: " + Arrays.toString(_allForcePowersArray));
		}
		else if (!(_allForcePowersList.contains(forcePower)))
		{
			throw new IllegalArgumentException("Force Power must be one of the following:\nLight Force Powers: " + Arrays.toString(_forcePowersLight) + "\nDark Force Powers :"
				+ Arrays.toString(_forcePowersDark) + "\nNeutral Force Powers: " + Arrays.toString(_forcePowersNeutral));
		}

		return true;
	}

	/*
	* @Override methods
	*/

	/**
	* A method to display the state of this ForceSensitive object
	* @return	str		A string displaying the values of First Name, Middle Name, Last Name, Alignment, Affiliation, Force Power, and Light Saber Color of this ForceSensitive object.
	*/
	@Override
	public String toString()
	{
		String str = String.format("\nFirst Name: " + getFirstName() + "\nMiddle Name: " + getMiddleName() + "\nLast Name: " + getLastName() + "\nAlignment: " + _alignment + "\nAffiliation: " + _affiliation
			+ "\nForce Power: " + _forcePower + "\nLight Saber Color: " + _lightSaberColor);

		return str;
	}

	/**
	* A method to set the value of this Person object's given name
	*<p><i>Note: overrides setFirstName in Person class in order to check for invalid name/lightsaber color combination</i></p>
	*
	* @param fN		The first or given name of this Person object
	*/
	@Override
	public void setFirstName(String fN)
	{
		if (fN != "Samuel" && (GetLightSaberColor().equals("purple")))
		{
			throw new IllegalArgumentException("Only person's named \"Samuel L Jackson\" can have a purple lightsaber");
		}
		else
		{
			super.setFirstName(fN);
		}
	}

	/**
	* A method to set the value of this Person object's given name
	*<p><i>Note: overrides setLastName in Person class in order to check for invalid name/lightsaber color combination</i></p>
	*
	* @param lN		The last or family name of this Person object
	*/
	@Override
	public void setLastName(String lN)
	{
		if (lN != "Jackson" && (GetLightSaberColor().equals("purple")))
		{
			throw new IllegalArgumentException("Only person's named \"Samuel L Jackson\" can have a purple lightsaber");
		}
		else
		{
			super.setLastName(lN);
		}
	}

	/**
	* A method to set the value of this Person object's given name
	*<p><i>Note: overrides setMiddleName in Person class in order to check for invalid name/lightsaber color combination</i></p>
	*
	* @param mN		The middle name of this Person object
	*/
	@Override
	public void setMiddleName(String mN)
	{
		if (mN != "L" && mN != "L." && GetLightSaberColor().equals("purple"))
		{
			throw new IllegalArgumentException("Only person's named \"Samuel L Jackson\" can have a purple lightsaber");
		}
		else
		{
			super.setMiddleName(mN);
		}
	}
}