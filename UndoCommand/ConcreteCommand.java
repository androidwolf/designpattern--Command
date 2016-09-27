package UndoCommand;

import java.util.ArrayList;

public class ConcreteCommand implements Command {
	ArrayList<String> dirNameList;
	MakeDir makeDir;

	public ConcreteCommand(MakeDir makeDir) {
		dirNameList = new ArrayList<String>();
		this.makeDir = makeDir;
	}

	@Override
	public void execute(String name) {
		makeDir.createDir(name);
		dirNameList.add(name);
	}

	@Override
	public void undo() {
		if (dirNameList.size() > 0) {
			int m = dirNameList.size();
			String str = dirNameList.get(m - 1);
			makeDir.deleteDir(str);
			dirNameList.remove(m - 1);
		} else
			System.out.println("没有需要撤销的操作");
	}

}
