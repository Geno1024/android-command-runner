package com.geno.nativerunner;

import android.app.*;
import android.os.*;
import android.widget.*;

public class Command extends Activity
{
	public String command;
	public TextView title;
	public EditText cmd;
	public GridLayout param;
	public Button exec;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.command);
		command = getIntent().getStringExtra("command");
		setTitle(command);
		
	}
}
