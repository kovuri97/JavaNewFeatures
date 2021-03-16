package com.app.command;

public class ActionSave implements ActtionListenetCommand{
private Document document;
	
	public ActionSave(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		document.save();
	}
}
