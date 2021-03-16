package com.app.command;

public class ActionOpen implements ActtionListenetCommand{
	private Document document;
	
	public ActionOpen(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		document.open();
	}

}
