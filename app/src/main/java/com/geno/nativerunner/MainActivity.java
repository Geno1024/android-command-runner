package com.geno.nativerunner;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.view.View.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		LinearLayout l = new LinearLayout(this);
		l.setOrientation(LinearLayout.VERTICAL);
		setContentView(l);
		addCommand(l, "ls");
    }
	
	public void addCommand(ViewGroup toAdd, final String command)
	{
		Button b = new Button(this);
		b.setText(command);
		b.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View p1)
				{
					startActivity(new Intent(MainActivity.this, Command.class).putExtra("command", command));
				}
			});
		b.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
		toAdd.addView(b);
	}
}
