package UndoCommand;

import java.io.File;

public class MakeDir {
	public void createDir(String name) {
		File dir = new File(name);
		dir.mkdir();
		System.out.println(name + "���ļ��д����ɹ�");
	}
	
	public void deleteDir(String name) {
		File dir = new File(name);
		dir.delete();
		System.out.println(name + "���ļ��г����ɹ�");
	}
}
