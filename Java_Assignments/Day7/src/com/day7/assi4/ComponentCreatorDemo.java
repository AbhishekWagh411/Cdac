package com.day7.assi4;

public class ComponentCreatorDemo {

	public static void main(String[] args) {
		WindowsUIComponentCreator wui = new WindowsUIComponentCreator();
		LinuxUIComponentCreator lui= new LinuxUIComponentCreator();
		MacUIComponentCreator mui = new MacUIComponentCreator();
		System.out.println(wui.createUIComponent(new Button()).getUI());
		System.out.println(lui.createUIComponent(new TextField()).getUI());
		System.out.println(mui.createUIComponent(new CheckBox()).getUI());
		
	}

}
