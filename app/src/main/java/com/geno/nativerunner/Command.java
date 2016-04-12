package com.geno.nativerunner;

import android.app.*;
import android.os.Bundle;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class Command extends Activity
{
	public String command;
	public TextView title;
	public EditText cmd;
	public GridLayout param;
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
		param = (GridLayout) findViewById(R.id.params);
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
						BufferedReader br = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(command + " " + cmd.getText().toString() + " " + getCmd(param)).getInputStream()));
						String l;
						while ((l = br.readLine()) != null)
						{
							out.setText(out.getText() + l + "\n");
						}
					}
					catch (IOException e)
					{}
				}
			});
	}
	
	public void addParam(GridLayout paramTable, String cmd)
	{
		String[] param;
		switch(cmd)
		{
			case "acpi":
				param = new String[]{"-a", "-b", "-c", "-t", "-V"};
				break;
			case "uname":
				param = new String[]{"-s", "-n", "-r", "-v", "-m", "-a"};
				break;
			case "busybox ls":
				param = new String[]{"-1", "-A", "-a", "-C", "-x", "-d", "-L", "-H", "-R", "-F", "-p", "-l", "-i", "-n", "-s", "-e", "-h", "-r", "-S", "-X", "-v", "-c", "-t", "-u"};
				break;
			default:
				param = new String[0];
		}
		for (String para : param)
		{
			ToggleButton s = new ToggleButton(this);
			s.setText(para);
			s.setTextOn(para);
			s.setTextOff(para);
			s.setAllCaps(false);
			paramTable.addView(s);
		}
	}
	
	public String getCmd(GridLayout paramTable)
	{
		String res = "";
		for (int i = 0; i < paramTable.getChildCount(); i++)
		{
			ToggleButton t = (ToggleButton) paramTable.getChildAt(i);
			res += t.isChecked() ? t.getText().toString() + " " : "";
		}
		return res;
	}
}
