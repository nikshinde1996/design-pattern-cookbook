
public class Client {
	public static void main(String args[]) {
		// create the receiver
		FileSystemReceiver fsr = FileSystemReceiverUtil.getFileSystemReceiver();
		
		// create the command with associated receiver
		OpenFileCommand ofc = new OpenFileCommand(fsr);
		
		// creating the invoker and associating with it
		FileInvoker fileInvoker = new FileInvoker(ofc);
		
		// perform an action
		fileInvoker.execute();
		
		WriteFileCommand wfc = new WriteFileCommand(fsr);
		fileInvoker = new FileInvoker(wfc);
		fileInvoker.execute();
		
		CloseFileCommand cfc = new CloseFileCommand(fsr);
		fileInvoker = new FileInvoker(cfc);
		fileInvoker.execute();
	}
}
