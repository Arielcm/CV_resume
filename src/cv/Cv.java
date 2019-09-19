package cv;

public class Cv {

	private static void personal_information() {
		String full_name="Meza Cristian Ariel";
		String phone_number = "3624-302186";
		String email="cristian87ariel@gmail.com";
		String title="Senior Programming Technician";
		String linkedin="https://www.linkedin.com/in/cristian-meza-71263979/";
		String github="https://github.com/Arielcm";
		System.out.format("Name: %s\n"
				+ "Phone Number: %s\n"
				+ "Email: %s\n"
				+ "Title: %s\n"
				+ "Linkedin: %s\n"
				+ "GitHub: %s\n", full_name,phone_number,email,title,linkedin,github);
		
	}
	
	private static void courses() {
		System.out.println("Name\t\t\t\tState\n"
				+ "Automation Test\t\t\tIn Progress\n"
				+ "ABAP developer\t\t\tComplete\n"
				+ "Expert in PHP and MySQL\t\tComplete\n"
				+ "Web design\t\t\tComplete");
	}
	
	private static void skills() {
		String english="English\t\t\tPre intermediater";
		String programming_languages="Java\t\t\tIntermediate\n"
				+ "PHP\t\t\tIntermediate\n"
				+ "C#\t\t\tIntermediate\n"
				+ "JavaScript\t\tInitial";
		String database="SQL Server\t\tIntermediate\n"
				+ "MySQL\t\t\tIntermediate";
		String others="HTML and CSS\t\tIntermediate";
		System.out.format("Skill\t\t\tLevel\n\n"
				+ "%s\n\n"
				+ "Programming Languages\n%s\n\n"
				+ "Database\n%s\n\n"
				+ "Others\n%s\n",english,programming_languages,database,others);
	}

	public static void main(String[] args) {
		System.out.println("********************PERSONAL INFORMATION**********************\n");
		personal_information();
		System.out.println("\n************************COURSES*****************************\n");
		courses();
		System.out.println("\n************************SKILLS******************************\n");
		skills();

	}

}
