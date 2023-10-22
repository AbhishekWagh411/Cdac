package com.day7.assi4;

public abstract class UIComponentCreator {
	public void show(UIComponent ui)
	{
		UIComponent comp=createUIComponent(ui);
		add(comp);
	}
	public void add(UIComponent component)
	{
		System.out.println("Added the component\t"+component);
	}
	public abstract UIComponent createUIComponent(UIComponent ui);

}

