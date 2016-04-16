package com.geno.nativerunner;

@SuppressWarnings("unused")
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

	public static final Command APPOPS = new Command("appops", "",
			new CommandParam("set", "", true),
			new CommandParam("get", "", true),
			new CommandParam("reset", "", true));

	public static final Command APPWIDGET = new Command("appwidget", "",
			new CommandParam("grantbind --package", "", true),
			new CommandParam("revokebind --package", "", true));

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

	public static final Command BLOCKDEV = new Command("blockdev", "Call ioctl(s) on each listed block device",
			new CommandParam("--setro", "Set read only"),
			new CommandParam("--setrw", "Set read write"),
			new CommandParam("--getro", "Get read only"),
			new CommandParam("--getss", "Get sector size"),
			new CommandParam("--getbsz", "Get block size"),
			new CommandParam("--setbsz", "Set block size", true),
			new CommandParam("--getsz", "Get device size in 512-byte sectors"),
			new CommandParam("--getsize", "Get device size in sectors (deprecated)"),
			new CommandParam("--getsize64", "Get device size in bytes"),
			new CommandParam("--flushbufs", "Flush buffers"),
			new CommandParam("--rereadpt", "Reread partition table"));

	public static final Command BMGR = new Command("bmgr", "",
			new CommandParam("backup", "The 'backup' command schedules a backup pass for the named package." +
									   "Note that the backup pass will effectively be a no-op if the package" +
									   "does not actually have changed data to store.", true),
			new CommandParam("enable", "The 'enable' command enables or disables the entire backup mechanism." +
									   "If the argument is 'true' it will be enabled, otherwise it will be" +
									   "disabled.  When disabled, neither backup or restore operations will" +
									   "be performed.", true),
			new CommandParam("enabled", "The 'enabled' command reports the current enabled/disabled state of" +
										"the backup mechanism."),
			new CommandParam("list transports", "The 'list transports' command reports the names of the backup transports" +
												"currently available on the device.  These names can be passed as arguments" +
												"to the 'transport' and 'wipe' commands.  The currently active transport" +
												"is indicated with a '*' character."),
			new CommandParam("list sets", "The 'list sets' command reports the token and name of each restore set" +
										  "available to the device via the currently active transport."),
			new CommandParam("transport", "The 'transport' command designates the named transport as the currently" +
										  "active one.  This setting is persistent across reboots.", true),
			new CommandParam("restore", "The 'restore' command when given just a restore token initiates a full-system" +
										"restore operation from the currently active transport.  It will deliver" +
										"the restore set designated by the TOKEN argument to each application" +
										"that had contributed data to that restore set." +
										"\n\n" +
										"The 'restore' command when given a token and one or more package names" +
										"initiates a restore operation of just those given packages from the restore" +
										"set designated by the TOKEN argument.  It is effectively the same as the" +
										"'restore' operation supplying only a token, but applies a filter to the" +
										"set of applications to be restored." +
										"\n\n" +
										"The 'restore' command when given just a package name intiates a restore of" +
										"just that one package according to the restore set selection algorithm" +
										"used by the RestoreSession.restorePackage() method.", true),
			new CommandParam("run", "The 'run' command causes any scheduled backup operation to be initiated" +
									"immediately, without the usual waiting period for batching together" +
									"data changes."),
			new CommandParam("wipe", "The 'wipe' command causes all backed-up data for the given package to be" +
									 "erased from the given transport's storage.  The next backup operation" +
									 "that the given application performs will rewrite its entire data set." +
									 "Transport names to use here are those reported by 'list transports'.", true),
			new CommandParam("fullbackup", "The 'fullbackup' command induces a full-data stream backup for one or more" +
										   "packages.  The data is sent via the currently active transport.", true));

	public static final Command BRCTL = new Command("brctl", "",
			new CommandParam("addbr", "add bridge", true),
			new CommandParam("delbr", "delete bridge", true),
			new CommandParam("addif", "add interface to bridge", true),
			new CommandParam("delif", "delete interface from bridge", true),
			new CommandParam("hairpin", "turn hairpin on/off", true),
			new CommandParam("setageing", "set ageing time", true),
			new CommandParam("setbridgeprio", "set bridge priority", true),
			new CommandParam("setfd", "set bridge forward delay", true),
			new CommandParam("sethello", "set hello time", true),
			new CommandParam("setmaxage", "set max message age", true),
			new CommandParam("setpathcost", "set path cost", true),
			new CommandParam("setportprio", "set port priority", true),
			new CommandParam("show", "show a list of bridges", true),
			new CommandParam("showmacs", "show a list of mac addrs", true),
			new CommandParam("showstp", "show bridge stp info", true),
			new CommandParam("stp", "turn stp on/off", true));

	public static final Command BTNVTOOL = new Command("btnvtool", "BT NV Read/Write Tool",
			new CommandParam("-b", "Bluetooth MAC address to use"),
			new CommandParam("-r", "BTS reference clock HZ"),
			new CommandParam("-c", "clock sharing in BTSoC"),
			new CommandParam("-p", "Read and Print all BT NV items"),
			new CommandParam("-O", "On boot BD address generation"),
			new CommandParam("-h", "print this usage message"));

	public static final Command BZCAT = new Command("bzcat", "Decompress listed files to stdout. Use stdin if no files listed.");

	public static final Command CAL = new Command("cal", "Print a calendar.\n\n" +
														 "With one argument, prints all months of the specified year.\n" +
														 "With two arguments, prints calendar for month and year.\n");

	public static final Command CAT = new Command("cat", "Copy (concatenate) files to stdout.  If no files listed, copy from stdin.\n" +
														 "Filename \"-\" is a synonym for stdin.",
			new CommandParam("-e", "Mark each newline with $"),
			new CommandParam("-t", "Show tabs as ^I"),
			new CommandParam("-u", "Copy one byte at a time (slow)."),
			new CommandParam("-v", "Display nonprinting characters as escape sequences. Use M-x for" +
								   "high ascii characters (>127), and ^x for other nonprinting chars."));

	public static final Command CHCON = new Command("chcon", "Change the SELinux security context of listed file[s].",
			new CommandParam("-h", "change symlinks instead of what they point to."),
			new CommandParam("-R", "recurse into subdirectories."),
			new CommandParam("-v", "verbose output."));

	public static final Command CHGRP = new Command("chgrp", "Change group of one or more files.",
			new CommandParam("-f", "suppress most error messages."),
			new CommandParam("-h", "change symlinks instead of what they point to"),
			new CommandParam("-R", "recurse into subdirectories (implies -h)."),
			new CommandParam("-H", "with -R change target of symlink, follow command line symlinks"),
			new CommandParam("-L", "with -R change target of symlink, follow all symlinks"),
			new CommandParam("-P", "with -R change symlink, do not follow symlinks (default)"),
			new CommandParam("-v", "verbose output."));

	public static final Command CHMOD = new Command("chmod", "Change mode of listed file[s] (recursively with -R).\n" +
															 "\n" +
															 "MODE can be (comma-separated) stanzas: [ugoa][+-=][rwxstXugo]\n" +
															 "\n" +
															 "Stanzas are applied in order: For each category (u = user,\n" +
															 "g = group, o = other, a = all three, if none specified default is a),\n" +
															 "set (+), clear (-), or copy (=), r = read, w = write, x = execute.\n" +
															 "s = u+s = suid, g+s = sgid, o+s = sticky. (+t is an alias for o+s).\n" +
															 "suid/sgid: execute as the user/group who owns the file.\n" +
															 "sticky: can't delete files you don't own out of this directory\n" +
															 "X = x for directories or if any category already has x set.\n" +
															 "\n" +
															 "Or MODE can be an octal value up to 7777        ug uuugggooo    top +\n" +
															 "bit 1 = o+x, bit 1<<8 = u+w, 1<<11 = g+1        sstrwxrwxrwx    bottom\n" +
															 "\n" +
															 "Examples:\n" +
															 "chmod u+w file - allow owner of \"file\" to write to it.\n" +
															 "chmod 744 file - user can read/write/execute, everyone else read only\n");

	public static final Command CHOWN = new Command("chown", CHGRP.getDetail(), CHGRP.getParams());

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
