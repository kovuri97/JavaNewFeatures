package com.app.command;

public class MenuOptions {
	private ActtionListenetCommand open;
	private ActtionListenetCommand save;
	public MenuOptions(ActtionListenetCommand open, ActtionListenetCommand save) {
		super();
		this.open = open;
		this.save = save;
	}
	public void clickOpen() {
		open.execute();
	}
	public void clickSave() {
		save.execute();
	}
}
