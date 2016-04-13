package com.geno.nativerunner;

public class CommandParam
{
	private String param;
	private String detail;
	private boolean hasMore;

	public String getParam()
	{
		return param;
	}

	public void setParam(String param)
	{
		this.param = param;
	}

	public String getDetail()
	{
		return detail;
	}

	public void setDetail(String detail)
	{
		this.detail = detail;
	}

	public boolean hasMore()
	{
		return hasMore;
	}

	public void setHasMore(boolean hasMore)
	{
		this.hasMore = hasMore;
	}

	public CommandParam()
	{
		this("");
	}

	public CommandParam(String param)
	{
		this(param, "");
	}

	public CommandParam(String param, String detail)
	{
		this(param, detail, false);
	}

	public CommandParam(String param, String detail, boolean hasMore)
	{
		this.param = param;
		this.detail = detail;
		this.hasMore = hasMore;
	}
}
