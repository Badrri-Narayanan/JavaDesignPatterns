package designPatterns.behaviourPattern.chainOfResponsiblityPattern;

public class TextDocumentHandler extends DocumentHandler {

	public TextDocumentHandler(DocumentHandler next) {
		super(next);
	}

	@Override
	public void openDocument(String fileExtension) {
		if(fileExtension.equals("txt"))
			System.out.println("Opening the Text document...");
		else
			super.openDocument(fileExtension);
	}

}
