package com.geno.nativerunner;

import android.app.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.view.View.*;

public class MainActivity extends Activity 
{
	public LinearLayout internal, busybox, external;
	public String[] internalCommands, busyboxCommands, externalCommands;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		ScrollView totalContent = new ScrollView(this);
		LinearLayout total = new LinearLayout(this);
		internal = new LinearLayout(this);
		busybox = new LinearLayout(this);
		external = new LinearLayout(this);
		total.setOrientation(LinearLayout.VERTICAL);
		internal.setOrientation(LinearLayout.VERTICAL);
		busybox.setOrientation(LinearLayout.VERTICAL);
		external.setOrientation(LinearLayout.VERTICAL);
		TextView internalD = new TextView(this);
		TextView busyboxD = new TextView(this);
		TextView externalD = new TextView(this);
		internalD.setText("Internal");
		busyboxD.setText("Busybox");
		externalD.setText("External");
		internalD.setTextSize(20);
		busyboxD.setTextSize(20);
		externalD.setTextSize(20);
		internalD.setGravity(Gravity.CENTER);
		busyboxD.setGravity(Gravity.CENTER);
		externalD.setGravity(Gravity.CENTER);
		internal.addView(internalD, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		busybox.addView(busyboxD, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		external.addView(externalD, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		total.addView(internal, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		total.addView(busybox, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		total.addView(external, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		totalContent.addView(total);
		setContentView(totalContent);
		internalCommands = new String[]
				{
						"acpi",
						"applypatch",
						"appops",
						"appwidget",
						"atrace",
						"basename",
						"blockdev",
						"bmgr",
						"brctl",
						"btnvtool",
						"bzcat",
						"cal",
						"cat",
						"chcon",
						"chgrp",
						"chmod",
						"chown",
						"chroot",
						"cksum",
						"clear",
						"cmp",
						"comm",
						"content",
						"cp",
						"cpio",
						"cplay",
						"curl",
						"cut",
						"dalvikvm",
						"date",
						"df",
						"dirname",
						"dmesg",
						"dos2unix",
						"dpm",
						"du",
						"dumpe2fs",
						"dumpsys",
						"uname",
				};
		busyboxCommands = new String[]
				{
						"ls",
				};
		externalCommands = new String[]
				{

				};
		addCommands(internal, internalCommands);
		addCommands(busybox, busyboxCommands);
		addCommands(external, externalCommands);
	}

	public void addCommands(final ViewGroup toAdd, final String[] commands)
	{
		for (String command : commands)
			addCommand(toAdd, command);
	}
	
	public void addCommand(final ViewGroup toAdd, final String command)
	{
		Button b = new Button(this);
		b.setText(command);
		b.setAllCaps(false);
		b.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View p1)
				{
					String cmdclazz;
					if (toAdd == busybox) cmdclazz = "busybox ";
					else cmdclazz = "";
					startActivity(new Intent(MainActivity.this, CommandActivity.class).putExtra("command", cmdclazz + command));
				}
			});
		b.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
		toAdd.addView(b);
	}
}
