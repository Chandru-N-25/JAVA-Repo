import java.io.*;

class FileExample {
	public static void main(String args[]) throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("F:\\Dev\\JAVA-Repo\\Praticed codes\\test.txt"));
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("F:\\Dev\\JAVA-Repo\\Praticed codes\\copytext.txt"));
		String count;
		while ((count = dis.readLine()) != null) {
			String data = count.toUpperCase();
			System.out.println(data);
			dos.writeBytes(data + ",");
		}
		dis.close();
		dos.close();
	}
}