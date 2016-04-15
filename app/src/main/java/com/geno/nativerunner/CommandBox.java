package com.geno.nativerunner;

public final class CommandBox
{
	public static final Command ACPI = new Command("acpi", "Show status of power sources and thermal devices.",
			new CommandParam("-a", "show power adapters"),
			new CommandParam("-b", "show batteries"),
			new CommandParam("-c", "show cooling device state"),
			new CommandParam("-t", "show temperatures"),
			new CommandParam("-V", "show everything"));

	public static final Command APPLYPATCH = new Command("applypatch", "",
			new CommandParam("-b", "", true),
			new CommandParam("-c", "", true),
			new CommandParam("-s", "", true),
			new CommandParam("-l"));

	public static final Command ATRACE = new Command("atrace", "",
			new CommandParam("-a", "enable app-level tracing for a comma separated list of cmdlines", true),
			new CommandParam("-b", "use a trace buffer size of N KB", true),
			new CommandParam("-c", "trace into a circular buffer"),
			new CommandParam("-k", "trace the listed kernel functions", true),
			new CommandParam("-s", "sleep for N seconds before tracing [default 0]", true),
			new CommandParam("-t", "trace for N seconds [default 5]", true),
			new CommandParam("-z", "compress the trace dump"),
			new CommandParam("--async_start", "start circular trace and return immediatly"),
			new CommandParam("--async_dump", "dump the current contents of circular trace buffer"),
			new CommandParam("--async_stop", "stop tracing and dump the current contents of circular trace buffer"),
			new CommandParam("--list_categories", "list the available tracing categories"));

	public static final Command BASENAME = new Command("basename", "Return non-directory portion of a pathname removing suffix");

	public static final Command CP = new Command("cp", "Copy files from SOURCE to DEST. If more than one SOUNCE, DEST must be a directory",
			new CommandParam("-F", "delete any existing destination file first (--remove-destination)"),
			new CommandParam("-H", "Follow symlinks listed on command line"),
			new CommandParam("-L", "Follow all symlinks"),
			new CommandParam("-P", "Do not follow symlinks [default]"),
			new CommandParam("-R", "recurse into subdirectories (DEST must be a directory)"),
			new CommandParam("-a", "same as -dpr"),
			new CommandParam("-d", "don't dereference symlinks"),
			new CommandParam("-f", "delete destination files we can't write to"),
			new CommandParam("-i", "interactive, prompt before overwriting existing DEST"),
			new CommandParam("-l", "hard link instead of copy"),
			new CommandParam("-n", "no clobber (don't overwrite DEST)"),
			new CommandParam("-p", "preserve timestamps, ownership, and permissions"),
			new CommandParam("-r", "synonym for -R"),
			new CommandParam("-s", "symlink instead of copy"),
			new CommandParam("-v", "verbose"));

	public static final Command UNAME = new Command("uname", "Print system information.",
			new CommandParam("-s", "System name"),
			new CommandParam("-n", "Network (domain) name"),
			new CommandParam("-r", "Kernel Release number"),
			new CommandParam("-v", "Kernel Version"),
			new CommandParam("-m", "Machine (hardware) name"),
			new CommandParam("-a", "All of the above"));

	public static final Command NULL = new Command("", "", new CommandParam("", ""));
}
