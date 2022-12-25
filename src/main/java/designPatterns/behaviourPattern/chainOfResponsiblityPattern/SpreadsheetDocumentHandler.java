package designPatterns.behaviourPattern.chainOfResponsiblityPattern;

public class SpreadsheetDocumentHandler extends DocumentHandler {

	public SpreadsheetDocumentHandler(DocumentHandler next) {
		super(next);
	}

	@Override
	public void openDocument(String fileExtension) {
		if(fileExtension.equals("xlsx"))
			System.out.println("Opening the Spreadsheet document...");
		else
			super.openDocument(fileExtension);
	}

}
