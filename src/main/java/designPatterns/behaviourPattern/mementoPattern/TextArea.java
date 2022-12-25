package designPatterns.behaviourPattern.mementoPattern;

public class TextArea {
	private String text;

	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public Memento takeSnapshot() {
		return new Memento(text);
	}
	
	public void restore(Memento memento) {
		text = memento.getSavedText();
	}

	// must be a nested and immutable class
	public class Memento {
		private final String text;
		
		public Memento(String text) {
			this.text = text;
		}
		
		private String getSavedText() {
			return text;
		}
	}
}
