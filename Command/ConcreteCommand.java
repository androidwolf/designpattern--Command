package Command;

public class ConcreteCommand implements Command {

	CompanyArmy army;
	
	public ConcreteCommand(CompanyArmy army) {
		this.army = army;
	}

	@Override
	public void execute() {
		army.sneakAttack();
	}

}
