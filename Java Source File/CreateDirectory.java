import java.io.*;

class CreateDirectory{
		public static void main(String args[]){
			String dir = "F:/Dev/JAVA-Repo/Praticed codes/text";
			File f = new File(dir);
			f.mkdirs();
		}
}