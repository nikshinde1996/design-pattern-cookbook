
public interface FileSystemReceiver {
	void openFile();
	void closeFile();
	void writeFile();
}

class UnixFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Opening file in UNIX OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in UNIX OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in UNIX OS");
	}
}

class WindowsFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Opening file in Windows OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in Windows OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in Windows OS");
	}
}