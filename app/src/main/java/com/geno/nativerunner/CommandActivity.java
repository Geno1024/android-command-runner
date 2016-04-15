package com.geno.nativerunner;

import android.app.*;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class CommandActivity extends Activity
{
	public static final String TAG = "CommandActivity";
	public String command;
	public TextView title;
	public EditText cmd;
	public LinearLayout param;
	public Button exec;
	public TextView out;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.command);
		command = getIntent().getStringExtra("command").trim();
		title = (TextView) findViewById(R.id.cmdName);
		cmd = (EditText) findViewById(R.id.input);
		param = (LinearLayout) findViewById(R.id.params);
		exec = (Button) findViewById(R.id.exec);
		out = (TextView) findViewById(R.id.output);
		setTitle(command);
		title.setText(command);
		addParam(param, command);
		exec.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View p1)
				{
					out.setText("");
					try
					{
						Log.d(TAG, command + " " + getCmd() + " " + cmd.getText().toString());
						BufferedReader br = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(command + " " + getCmd() + " " + cmd.getText().toString()).getInputStream()));
						String l;
						while ((l = br.readLine()) != null)
						{
							out.setText(out.getText() + l + "\n");
						}
					}
					catch (IOException e)
					{e.printStackTrace();}
				}
			});
	}
	
	public void addParam(LinearLayout paramTable, String cmd)
	{
		Command c;
		switch(cmd)
		{
			case "acpi":			c = CommandBox.ACPI; 			break;
			case "applypatch":		c = CommandBox.APPLYPATCH;		break;
			case "atrace":			c = CommandBox.ATRACE;			break;
			case "basename":		c = CommandBox.BASENAME;		break;
			case "cp":				c = CommandBox.CP;				break;
			case "uname":			c = CommandBox.UNAME;			break;
			default:				c = CommandBox.NULL;
		}
		for (CommandParam p : c.getParams())
		{
			paramTable.addView(new CommandParamView(this, p));
		}
	}

	public String getCmd()
	{
		String cmd = "";
		for (int i = 0; i < param.getChildCount(); i++)
			cmd += param.getChildAt(i).toString() + " ";
		return cmd;
	}
}
