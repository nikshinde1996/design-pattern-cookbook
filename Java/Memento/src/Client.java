
public class Client {
	public static void main(String args[]) {
		FileWriterCaretaker careTaker = new FileWriterCaretaker();
		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
		
		fileWriter.write("Initial set of data: hello world");
		
		System.out.println("FileWriter : " + fileWriter + "\n\n");
		
		// save the file
		careTaker.save(fileWriter);
		
		// update the content
		fileWriter.write(" Updated:: Second set of data: hello world");
		
		System.out.println("FileWriter : " + fileWriter + "\n\n");
		
		careTaker.undo(fileWriter);
		
		System.out.println("FileWriter : " + fileWriter + "\n\n");
	}
}
