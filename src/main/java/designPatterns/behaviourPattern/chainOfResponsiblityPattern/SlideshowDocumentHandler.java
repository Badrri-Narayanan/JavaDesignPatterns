package designPatterns.behaviourPattern.chainOfResponsiblityPattern;

public class SlideshowDocumentHandler extends DocumentHandler {

	public SlideshowDocumentHandler(DocumentHandler next) {
		super(next);
	}

	@Override
	public void openDocument(String fileExtension) {
		if(fileExtension.equals("ppt"))
			System.out.println("Opening the Slideshow document...");
		else
			super.openDocument(fileExtension);
	}

}
