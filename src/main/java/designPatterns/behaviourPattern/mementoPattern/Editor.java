package designPatterns.behaviourPattern.mementoPattern;

import java.util.Stack;

import designPatterns.behaviourPattern.mementoPattern.TextArea.Memento;

public class Editor {
	private Stack<Memento> history;
	private TextArea textArea;
	
	public Editor() {
		history = new Stack<>();
		textArea = new TextArea();
	}
	
	public void write(String text) {
		textArea.setText(text);
		history.add(textArea.takeSnapshot());
	}
	
	public void undo() {
		System.out.println("Undoing...");
		history.pop();
		textArea.restore(history.peek());
	}
	
	public String getContent() {
		return textArea.getText();
	}
}
