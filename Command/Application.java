package Command;

public class Application {

	public static void main(String[] args) {
		CompanyArmy 三连 = new CompanyArmy();
		Command command = new ConcreteCommand(三连);
		ArmySuperior 指挥官 = new ArmySuperior();
		指挥官.setCommand(command);
		指挥官.startExecuteCommand();
	}

}
