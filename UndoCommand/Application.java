package UndoCommand;

public class Application {

	public static void main(String[] args) {
		MakeDir makeDir = new MakeDir();
		Command command = new ConcreteCommand(makeDir);
		RequestMakedir requestMakedir = new RequestMakedir();
		requestMakedir.setCommand(command);
		requestMakedir.startExecuteCommand("yxx");
		requestMakedir.startExecuteCommand("yn");
		requestMakedir.undoCommand();
	}

}
