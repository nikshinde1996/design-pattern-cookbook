
public class FileWriterUtil {
	 private String fileName;
	 private StringBuilder content;
	 
	 public FileWriterUtil(String fileName) {
		 this.fileName = fileName;
		 this.content = new StringBuilder();
	 }
	 
	 @Override
	 public String toString() {
		 return this.content.toString();
	 }
	 
	 public void write(String str) {
		 this.content.append(str);
	 }
	 
	 // creates the Memento
	 public Memento save() {
		 return new Memento(this.fileName, this.content);
	 }
	 
	 
	 // restores the earlier part
	 public void undoToLastSave(Object obj) {
		 Memento memento = (Memento) obj;
		 this.fileName = memento.fileName;
		 this.content = memento.content;
	 }
	 
	 
	 private class Memento {
		public String fileName; 
		public StringBuilder content;
			
		public Memento(String fileName, StringBuilder content) {
			this.fileName = fileName;
			
			// notice the deep copy for the content so that memento and FileWriterUtil
			// don't refer to the same object.
			this.content = new StringBuilder(content);
		}
	}
}
