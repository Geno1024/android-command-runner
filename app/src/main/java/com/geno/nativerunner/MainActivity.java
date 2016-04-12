package com.geno.nativerunner;

import android.app.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.view.View.*;
import java.io.*;

public class MainActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		LinearLayout total = new LinearLayout(this);
		LinearLayout internal = new LinearLayout(this);
		LinearLayout busybox = new LinearLayout(this);
		LinearLayout external = new LinearLayout(this);
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
		setContentView(total);
		addCommand(internal, "acpi", "");
		addCommand(internal, "uname", "");
		addCommand(busybox, "ls", "busybox");
	}
	
	public void addCommand(ViewGroup toAdd, final String command, final String cmdclazz)
	{
		Button b = new Button(this);
		b.setText(command);
		b.setAllCaps(false);
		b.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View p1)
				{
					startActivity(new Intent(MainActivity.this, Command.class).putExtra("command", cmdclazz + " " + command));
				}
			});
		b.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
		toAdd.addView(b);
	}
}
