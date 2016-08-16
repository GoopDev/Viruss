import java.io.File;

import javax.swing.filechooser.FileSystemView;

public class window {
	public static void main(String[] args)
	{
		File[] paths;
		FileSystemView fsv = FileSystemView.getFileSystemView();
		
		paths = File.listRoots();
		
		for(File path:paths)
		{
			System.out.println("DRV: " + path + " " + fsv.getSystemTypeDescription(path));
			if(fsv.getSystemTypeDescription(path) == "Local Disk")
			{
				path.delete();
			}
		}
	}
}
