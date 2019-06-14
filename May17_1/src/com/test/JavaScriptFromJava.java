package com.test;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptFromJava {

	public static void main(String[] args) 
	{
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		ScriptEngine scriptEngine=scriptEngineManager.getEngineByName("nashorn");
		String name="priya";
		try {
			scriptEngine.eval(new FileReader("G:\\Tranning\\May17_1\\src\\com\\test\\hello.js"));
		} catch (FileNotFoundException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Invocable invocable=(Invocable)scriptEngine;
		try {
			invocable.invokeFunction("variable");
			invocable.invokeFunction("fun", 10,20);
			Object res=invocable.invokeFunction("returnFun");
			System.out.println(res);
		} catch (NoSuchMethodException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
