package pack;
import java.io.File;
import java.io.IOException;

public class printFileTree
{
static int count=0;

	public static void main(String[] args) 
	{
		File f = null;
		File[] dirs;
		//f = new File("C:/Sivakumar/ASU/Resumes");
		printFileTree("E:/a");
	}

	public static void printFileTree(String path)
	{
		File f = null;
		File[] dirs;
		String fullpath,canonpath;
		f= new File(path);
		dirs = f.listFiles();
	//count=0;
		for(File current:dirs)
		{	
			try {
				canonpath=current.getCanonicalPath();
				fullpath=String.valueOf(current);
				int slashindex=fullpath.lastIndexOf('/');
				fullpath=fullpath.substring(slashindex+1);
				if(path.contains(canonpath))
				{
					
					System.out.println(fullpath);
				}
				
				else if(current.isDirectory())
				{	count++;
				int x=count;
					while(x>0){System.out.print(" ");
					x--;
						
						}
					fullpath=fullpath + '/';
					System.out.println(fullpath);
					printFileTree(String.valueOf(current));
				}
				else
				{
					count++;
					int x=count;
					while(x>0){System.out.print(" ");
					x--;
						
						}
					System.out.println(fullpath);
				}
			} catch (IOException e) {
				e.printStackTrace();
				}
			//fullpath=String.valueOf(current);
			
		}
	}
}
