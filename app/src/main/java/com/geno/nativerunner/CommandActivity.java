package com.geno.nativerunner;

import android.app.*;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class CommandActivity extends Activity
{
	public static final String TAG = "CommandActivity";
	public String command;
	public TextView title;
	public EditText cmd;
	public LinearLayout param;
	public Button exec;
	public /*TextView*/ LinearLayout out;
	//public ArrayList<Integer> errorSize;
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
		out = (/*TextView*/ LinearLayout) findViewById(R.id.output);
		setTitle(command);
		title.setText(command);
		addParam(param, command);
		exec.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View p1)
				{
					//out.setText("");
					out.removeAllViews();
					try
					{
						Log.d(TAG, command + " " + getCmd() + " " + cmd.getText().toString());
						Process p = Runtime.getRuntime().exec(command + " " + getCmd() + " " + cmd.getText().toString());
						int exitVal = p.waitFor();
						BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
						BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
						String l;
						/*String li = "", le = "";
						while ((li = bri.readLine()) != null || (le = bre.readLine()) != null)
						{
							if
						}*/
						while ((l = bri.readLine()) != null)
						{
							TextView t = new TextView(CommandActivity.this);
							t.setText(l);
							t.setTextColor(Color.BLACK);
							t.setTypeface(Typeface.MONOSPACE);
							t.setTextIsSelectable(true);
							out.addView(t);
						}
						while ((l = bre.readLine()) != null)
						{
							TextView t = new TextView(CommandActivity.this);
							t.setText(l);
							t.setTextColor(Color.RED);
							t.setTypeface(Typeface.MONOSPACE);
							t.setTextIsSelectable(true);
							out.addView(t);
						}
						setTitle(String.format(Locale.getDefault(), "Process exited with status %d", exitVal));
					}
					catch (Exception e)
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
			case "blockdev":		c = CommandBox.BLOCKDEV;		break;
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
