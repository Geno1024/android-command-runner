package com.geno.nativerunner;

public final class CommandBox
{
	public static final Command ACPI = new Command("acpi", "Show status of power sources and thermal devices.",
			new CommandParam("-a", "show power adapters"),
			new CommandParam("-b", "show batteries"),
			new CommandParam("-c", "show cooling device state"),
			new CommandParam("-t", "show temperatures"),
			new CommandParam("-V", "show everything"));

	public static final Command NULL = new Command("", "", new CommandParam("", ""));
}
