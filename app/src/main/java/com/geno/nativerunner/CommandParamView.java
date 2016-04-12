package com.geno.nativerunner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class CommandParamView extends LinearLayout
{
	private CommandParam param;
	private ToggleButton paramSwitch;
	private TextView detailText;
	private EditText more;

	public CommandParam getParam()
	{
		return param;
	}

	public void setParam(CommandParam param)
	{
		this.param = param;
	}

	public CommandParamView(Context context, CommandParam param)
	{
		this(context);
		this.param = param;
		View v = View.inflate(context, R.layout.commandparamview, this);
		paramSwitch = (ToggleButton) v.findViewById(R.id.paramSwitch);
		detailText = (TextView) v.findViewById(R.id.detailText);
		more = (EditText) v.findViewById(R.id.more);
		paramSwitch.setText(param.getParam());
		paramSwitch.setTextOn(param.getParam());
		paramSwitch.setTextOff(param.getParam());
		detailText.setText(param.getDetail());
		if (param.hasMore())
		{
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
	}

	public CommandParamView(Context context)
	{
		super(context);
	}

	public CommandParamView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
	}

	public CommandParamView(Context context, AttributeSet attrs, int defStyleAttr)
	{
		super(context, attrs, defStyleAttr);
	}

	@Override
	public String toString()
	{
		return paramSwitch.isChecked() ? (param.getParam() + (param.hasMore() ? more.getText().toString() : "")) : "";
	}
}
