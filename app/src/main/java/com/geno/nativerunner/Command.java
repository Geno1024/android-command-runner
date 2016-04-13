package com.geno.nativerunner;

public class Command
{
	private String command;
	private String detail;
	private CommandParam[] params;

	public int getParamLength()
	{
		return params.length;
	}

	public String getCommand()
	{
		return command;
	}

	public void setCommand(String command)
	{
		this.command = command;
	}

	public String getDetail()
	{
		return detail;
	}

	public void setDetail(String detail)
	{
		this.detail = detail;
	}

	public CommandParam[] getParams()
	{
		return params;
	}

	public void setParams(CommandParam[] params)
	{
		this.params = params;
	}

	public Command(String command, String detail, CommandParam...params)
	{
		this.command = command;
		this.detail = detail;
		this.params = params;
	}

	@Override
	public String toString()
	{
		return "Command{" +
			   "command='" + command + '\'' +
			   ", detail='" + detail + '\'' +
			   '}';
	}
}
