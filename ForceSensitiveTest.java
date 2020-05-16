
public class ForceSensitiveTest
{
	public static void main(String[] args)
	{
		System.out.println("Default Constructor");
		ForceSensitive sensitiveDefault = new ForceSensitive();
		System.out.println(sensitiveDefault);
		sensitiveDefault.setFirstName("Anakin");
		sensitiveDefault.setMiddleName("Luke");
		sensitiveDefault.setLastName("Skywalker");
		sensitiveDefault.setGender("male");
		System.out.println(sensitiveDefault);
		sensitiveDefault.SetAlignment("Light");
		sensitiveDefault.SetAffiliation("Jedi");
		sensitiveDefault.SetForcePower("Force Jump");
		sensitiveDefault.SetLightSaberColor("blue");
		System.out.println(sensitiveDefault);
		System.out.println();
		System.out.println(sensitiveDefault.getFirstName());
		System.out.println(sensitiveDefault.getMiddleName());
		System.out.println(sensitiveDefault.getLastName());
		System.out.println(sensitiveDefault.getCourtesyTitle());
		System.out.println(sensitiveDefault.getGender());
		System.out.println(sensitiveDefault.getAge());
		System.out.println(sensitiveDefault.GetAlignment());
		System.out.println(sensitiveDefault.GetAffiliation());
		System.out.println(sensitiveDefault.GetForcePower());
		System.out.println(sensitiveDefault.GetLightSaberColor());
		System.out.println();
		System.out.println();

		// errors - remove comments to get exceptions
		//sensitiveDefault.SetAlignment("Dark");
		//sensitiveDefault.SetAffiliation("Sith");
		//sensitiveDefault.SetForcePower("Force Choke");
		//sensitiveDefault.SetLightSaberColor("purple");

		System.out.println("Constructor # 1");
		ForceSensitive sensitiveOne = new ForceSensitive("Darth", "Maul", "male", (byte)100, "Dark", "Sith");
		System.out.println(sensitiveOne);
		System.out.println(sensitiveOne.getFirstName());
		sensitiveOne.setFirstName("Anakin");
		sensitiveOne.setMiddleName("Luke");
		sensitiveOne.setLastName("Skywalker");
		sensitiveOne.setGender("male");
		System.out.println(sensitiveOne);
		System.out.println();
		System.out.println();

		// errors - remove comments to get exceptions
		//sensitiveOne.SetAlignment("Light");
		//sensitiveOne.SetAffiliation("Jedi");

		System.out.println("Constructor # 2");
		ForceSensitive sensitiveTwo = new ForceSensitive("Darth", "Maul", "Death", "Mr", "Jr", "male", (byte)100, "Dark", "Sith", "Force Crush", "red");
		System.out.println(sensitiveTwo);
		System.out.println(sensitiveTwo.getFirstName());
		sensitiveTwo.setFirstName("Anakin");
		sensitiveTwo.setMiddleName("Luke");
		sensitiveTwo.setLastName("Skywalker");
		sensitiveTwo.setGender("female");
		System.out.println(sensitiveOne);

		sensitiveTwo.SetForcePower("Force Jump");

		// error - remove comments to get exceptions
		//sensitiveTwo.SetLightSaberColor("purple");

		sensitiveTwo.SetLightSaberColor("green");
		
		System.out.println(sensitiveTwo);
		System.out.println();
		System.out.println(sensitiveTwo.getFirstName());
		System.out.println(sensitiveTwo.getMiddleName());
		System.out.println(sensitiveTwo.getLastName());
		System.out.println(sensitiveTwo.getCourtesyTitle());
		System.out.println(sensitiveTwo.getGender());
		System.out.println(sensitiveTwo.getAge());
		System.out.println(sensitiveTwo.GetAlignment());
		System.out.println(sensitiveTwo.GetAffiliation());
		System.out.println(sensitiveTwo.GetForcePower());
		System.out.println(sensitiveTwo.GetLightSaberColor());
		System.out.println();
	}
}