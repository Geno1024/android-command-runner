package com.geno.nativerunner;

import android.app.*;
import android.os.Bundle;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class CommandActivity extends Activity
{
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
						BufferedReader br = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(command + " " + cmd.getText().toString() + " "/* + getCmd(param)*/).getInputStream()));
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
			case "acpi":
				c = CommandBox.ACPI;
				break;
			/*case "uname":
				param = new String[]{"-s", "-n", "-r", "-v", "-m", "-a"};
				break;
			case "busybox ls":
				param = new String[]{"-1", "-A", "-a", "-C", "-x", "-d", "-L", "-H", "-R", "-F", "-p", "-l", "-i", "-n", "-s", "-e", "-h", "-r", "-S", "-X", "-v", "-c", "-t", "-u"};
				break;
			default:
				param = new String[0];*/
			default:
				c = CommandBox.NULL;
		}
		for (CommandParam p : c.getParams())
		{
			LinearLayout l = new LinearLayout(this);
			ToggleButton paramSwitch = new ToggleButton(this);
			paramSwitch.setText(p.getParam());
			paramSwitch.setTextOn(p.getParam());
			paramSwitch.setTextOff(p.getParam());
			l.addView(paramSwitch);
			final TextView detailText = new TextView(this);
			detailText.setText(p.getDetail());
			l.addView(detailText);
			if (p.hasMore())
			{
				final EditText more = new EditText(this);
				more.setVisibility(View.GONE);
				l.addView(more);
				paramSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
				{
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
					{
						more.setVisibility(isChecked ? View.VISIBLE : View.GONE);
						detailText.setVisibility(isChecked ? View.GONE : View.VISIBLE);
					}
				});
			}
			paramTable.addView(l);
		}
		/*
		for (int i = 0; i < param.length; i++)
		{
			LinearLayout l = new LinearLayout(this);
			ToggleButton s = new ToggleButton(this);
			s.setText(param[i]);
			s.setTextOn(param[i]);
			s.setTextOff(param[i]);
			s.setAllCaps(false);
			l.addView(s);
			/*TextView t = new TextView(this);
			t.setText(detail[i]);
			if (hasMore[i])
			{
				EditText e = new EditText(this);
				s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
				{
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
					{

					}
				});
			}*/
			/*paramTable.addView(l);
		}*/
	}
	
	/*public String getCmd(LinearLayout paramTable)
	{
		String res = "";
		for (int i = 0; i < paramTable.getChildCount(); i++)
		{
			ToggleButton t = (ToggleButton) paramTable.getChildAt(i);
			res += t.isChecked() ? t.getText().toString() + " " : "";
		}
		return res;
	}*/
}
