package com.app.command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document document = new Document();
		ActtionListenetCommand open = new ActionOpen(document);
		ActtionListenetCommand save = new ActionSave(document);
		MenuOptions menuOptions = new MenuOptions(open, save);
		menuOptions.clickOpen();
		menuOptions.clickSave();
	}
}
