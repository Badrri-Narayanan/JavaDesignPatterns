package designPatterns.behaviourPattern.chainOfResponsiblityPattern;

public abstract class DocumentHandler {
	DocumentHandler next;

	public DocumentHandler(DocumentHandler next) {
		this.next = next;
	}
	
	public void openDocument(String fileExtension) {
		if(next != null) {
			next.openDocument(fileExtension);
		}
	}
}
