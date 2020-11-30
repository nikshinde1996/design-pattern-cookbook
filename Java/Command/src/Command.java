
public interface Command {
	void execute();
	
	// could add undo/redo methods here
}

class OpenFileCommand implements Command {
	private FileSystemReceiver fileSystemReceiver;
	
	public OpenFileCommand(FileSystemReceiver fsr) {
		this.fileSystemReceiver = fsr;
	}

	@Override
	public void execute() {
		// save previous state in case of undo
		this.fileSystemReceiver.openFile();
	}
}

class WriteFileCommand implements Command {
	private FileSystemReceiver fileSystemReceiver;
	
	public WriteFileCommand(FileSystemReceiver fsr) {
		this.fileSystemReceiver = fsr;
	}

	@Override
	public void execute() {
		// save previous state in case of undo
		this.fileSystemReceiver.writeFile();
	}
}

class CloseFileCommand implements Command {
	private FileSystemReceiver fileSystemReceiver;
	
	public CloseFileCommand(FileSystemReceiver fsr) {
		this.fileSystemReceiver = fsr;
	}

	@Override
	public void execute() {
		// save previous state in case of undo
		this.fileSystemReceiver.closeFile();
	}
}