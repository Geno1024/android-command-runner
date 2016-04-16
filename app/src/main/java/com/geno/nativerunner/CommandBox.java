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

	public static final Command CHROOT = new Command("chroot", "Run command within a new root directory. If no command, run /bin/sh.");

	public static final Command CKSUM = new Command("cksum", "For each file, output crc32 checksum value, length and name of file.\n" +
															 "If no files listed, copy from stdin.  Filename \"-\" is a synonym for stdin.",
			new CommandParam("-H", "Hexadecimal checksum (defaults to decimal)"),
			new CommandParam("-L", "Little endian (defaults to big endian)"),
			new CommandParam("-P", "Pre-inversion"),
			new CommandParam("-I", "Skip post-inversion"),
			new CommandParam("-N", "Do not include length in CRC calculation"));

	public static final Command CLEAR = new Command("clear", "");

	public static final Command CMP = new Command("cmp", "Compare the contents of two files.",
			new CommandParam("-l", "show all differing bytes"),
			new CommandParam("-s", "silent"));

	public static final Command COMM = new Command("comm", "Reads FILE1 and FILE2, which should be ordered, and produces three text\n" +
														   "columns as output: lines only in FILE1; lines only in FILE2; and lines\n" +
														   "in both files. Filename \"-\" is a synonym for stdin.",
			new CommandParam("-1", "suppress the output column of lines unique to FILE1"),
			new CommandParam("-2", "suppress the output column of lines unique to FILE2"),
			new CommandParam("-3", "suppress the output column of lines duplicated in FILE1 and FILE2"));

	public static final Command CONTENT = new Command("content", "",
			new CommandParam("insert --uri", "<URI> a content provider URI.\n" +
									   "  <BINDING> binds a typed value to a column and is formatted:\n" +
									   "  <COLUMN_NAME>:<TYPE>:<COLUMN_VALUE> where:\n" +
									   "  <TYPE> specifies data type such as:\n" +
									   "  b - boolean, s - string, i - integer, l - long, f - float, d - double\n" +
									   "  Note: Omit the value for passing an empty string, e.g column:s:\n" +
									   "  Example:\n" +
									   "  # Add \"new_setting\" secure setting with value \"new_value\".\n" +
									   "  adb shell content insert --uri content://settings/secure --bind name:s:new_setting --bind value:s:new_value\n"),
			new CommandParam("update --uri", "<WHERE> is a SQL style where clause in quotes (You have to escape single quotes - see example below).\n" +
											 "  Example:\n" +
											 "  # Change \"new_setting\" secure setting to \"newer_value\".\n" +
											 "  adb shell content update --uri content://settings/secure --bind value:s:newer_value --where \"name='new_setting'\""),
			new CommandParam("delete --uri", "Example:\n" +
											 "  # Remove \"new_setting\" secure setting.\n" +
											 "  adb shell content delete --uri content://settings/secure --where \"name='new_setting'\""),
			new CommandParam("query --uri", "<PROJECTION> is a list of colon separated column names and is formatted:\n" +
											"  <COLUMN_NAME>[:<COLUMN_NAME>...]\n" +
											"  <SORT_ORDER> is the order in which rows in the result should be sorted.\n" +
											"  Example:\n" +
											"  # Select \"name\" and \"value\" columns from secure settings where \"name\" is equal to \"new_setting\" and sort the result by name in ascending order.\n" +
											"  adb shell content query --uri content://settings/secure --projection name:value --where \"name='new_setting'\" --sort \"name ASC\""),
			new CommandParam("call --uri", "<METHOD> is the name of a provider-defined method\n" +
										   "  <ARG> is an optional string argument\n" +
										   "  <BINDING> is like --bind above, typed data of the form <KEY>:{b,s,i,l,f,d}:<VAL>"),
			new CommandParam("read --uri", "Example:\n" +
										   "  # cat default ringtone to a file, then pull to host\n" +
										   "  adb shell 'content read --uri content://settings/system/ringtone > /mnt/sdcard/tmp.ogg' && adb pull /mnt/sdcard/tmp.ogg"));

	public static final Command CP = new Command("cp", "Copy files from SOURCE to DEST. If more than one SOURCE, DEST must be a directory",
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

	public static final Command CPIO = new Command("cpio", "copy files into and out of a \"newc\" format cpio archive",
			new CommandParam("-F", "use archive FILE instead of stdin/stdout", true),
			new CommandParam("-p", "copy-pass mode, copy stdin file list to directory DEST", true),
			new CommandParam("-i", "extract from archive into file system (stdin=archive)"),
			new CommandParam("-o", "create archive (stdin=list of files, stdout=archive)"),
			new CommandParam("-t", "test files (list only, stdin=archive, stdout=list of files)"),
			new CommandParam("-v", "verbose (list files during create/extract)"));

	public static final Command CPLAY = new Command("cplay", "",
			new CommandParam("-c", "card number"),
			new CommandParam("-d", "device node"),
			new CommandParam("-b", "buffer size"),
			new CommandParam("-f", "fragments"),
			new CommandParam("-v", "verbose mode"),
			new CommandParam("-p", "pcm input"),
			new CommandParam("-h", "Prints this help list"));

	public static final Command CURL = new Command("curl", "",
			new CommandParam("-q", "Disable .curlrc (must be first parameter)"),
			new CommandParam("--anyauth", "Pick \"any\" authentication method (H)"),
			new CommandParam("-a", "--append, Append to target file when uploading (F/SFTP)"),
			new CommandParam("--basic", "Use HTTP Basic Authentication (H)"),
			new CommandParam("--cacert", "CA certificate to verify peer against (SSL)", true),
			new CommandParam("--capath", "CA directory to verify peer against (SSL)", true),
			new CommandParam("-E", "--cert CERT[:PASSWD], Client certificate file and password (SSL)"),
			new CommandParam("--cert-status", "Verify the status of the server certificate (SSL)"),
			new CommandParam("--cert-type", "Certificate file type (DER/PEM/ENG) (SSL)", true),
			new CommandParam("--ciphers", "SSL ciphers to use (SSL)", true),
			new CommandParam("--compressed", "Request compressed response (using deflate or gzip)"),
			new CommandParam("-K", "--config FILE, Read config from FILE", true),
			new CommandParam("--connect-timeout", "Maximum time allowed for connection", true),
			new CommandParam("-C", "--continue-at OFFSET, Resumed transfer OFFSET", true),
			new CommandParam("-b", "--cookie STRING/FILE, Read cookies from STRING/FILE (H)"),
			new CommandParam("-c", "--cookie-jar FILE, Write cookies to FILE after operation (H)", true),
			new CommandParam("--create-dirs", "Create necessary local directory hierarchy"),
			new CommandParam("--crlf", "Convert LF to CRLF in upload"),
			new CommandParam("--crlfile", "Get a CRL list in PEM format from the given file", true),
			new CommandParam("-d", "--data DATA, HTTP POST data (H)", true),
			new CommandParam("--data-raw", "HTTP POST data, '@' allowed (H)", true),
			new CommandParam("--data-ascii", "HTTP POST ASCII data (H)", true),
			new CommandParam("--data-binary", "HTTP POST binary data (H)", true),
			new CommandParam("--data-urlencode", "HTTP POST data url encoded (H)", true),
			new CommandParam("--delegation", "GSS-API delegation permission", true),
			new CommandParam("--digest", "Use HTTP Digest Authentication (H)"),
			new CommandParam("--disable-eprt", "Inhibit using EPRT or LPRT (F)"),
			new CommandParam("--disable-epsv", "Inhibit using EPSV (F)"),
			new CommandParam("--dns-servers", "DNS server addrs to use: 1.1.1.1;2.2.2.2"),
			new CommandParam("--dns-interface", "Interface to use for DNS requests"),
			new CommandParam("--dns-ipv4-addr", "IPv4 address to use for DNS requests, dot notation"),
			new CommandParam("--dns-ipv6-addr", "IPv6 address to use for DNS requests, dot notation"),
			new CommandParam("-D", "--dump-header FILE, Write the headers to FILE", true),
			new CommandParam("--egd-file", "EGD socket path for random data (SSL)", true),
			new CommandParam("--engine", "Crypto engine (use \"--engine list\" for list) (SSL)", true),
			new CommandParam("-f", "--fail, Fail silently (no output at all) on HTTP errors (H)"),
			new CommandParam("--false-start", "Enable TLS False Start."),
			new CommandParam("-F", "--form CONTENT, Specify HTTP multipart POST data (H)", true),
			new CommandParam("--form-string", "Specify HTTP multipart POST data (H)", true),
			new CommandParam("--ftp-account", "Account data string (F)"),
			new CommandParam("--ftp-alternative-to-user", "String to replace \"USER [name]\" (F)", true),
			new CommandParam("--ftp-create-dirs", "Create the remote dirs if not present (F)"),
			new CommandParam("--ftp-method [MULTICWD/NOCWD/SINGLECWD]", "Control CWD usage (F)"),
			new CommandParam("--ftp-pasv", "Use PASV/EPSV instead of PORT (F)"),
			new CommandParam("-P", "--ftp-port ADR, Use PORT with given address instead of PASV (F)", true),
			new CommandParam("--ftp-skip-pasv-ip", "Skip the IP address for PASV (F)"),
			new CommandParam("--ftp-pret", "Send PRET before PASV (for drftpd) (F)"),
			new CommandParam("--ftp-ssl-ccc", "Send CCC after authenticating (F)"),
			new CommandParam("--ftp-ssl-ccc-mode ACTIVE/PASSIVE", "Set CCC mode (F)"),
			new CommandParam("--ftp-ssl-control", "Require SSL/TLS for FTP login, clear for transfer (F)"),
			new CommandParam("-G", "--get, Send the -d data with a HTTP GET (H)"),
			new CommandParam("-g", "--globoff, Disable URL sequences and ranges using {} and []"),
			new CommandParam("-H", "--header LINE, Pass custom header LINE to server (H)", true),
			new CommandParam("-I", "--head, Show document info only"),
			new CommandParam("-h", "--help, This help text"),
			new CommandParam("--hostpubmd5 MD5", "Hex-encoded MD5 string of the host public key. (SSH)"),
			new CommandParam("-0", "--http1.0, Use HTTP 1.0 (H)"),
			new CommandParam("--http1.1", "Use HTTP 1.1 (H)"),
			new CommandParam("--http2", "Use HTTP 2 (H)"),
			new CommandParam("--ignore-content-length", "Ignore the HTTP Content-Length header"),
			new CommandParam("-i", "--include, Include protocol headers in the output (H/F)"),
			new CommandParam("-k", "--insecure, Allow connections to SSL sites without certs (H)"),
			new CommandParam("--interface", "Use network INTERFACE (or address)", true),
			new CommandParam("-4", "--ipv4, Resolve name to IPv4 address"),
			new CommandParam("-6", "--ipv6, Resolve name to IPv6 address"),
			new CommandParam("-j", "--junk-session-cookies, Ignore session cookies read from file (H)"),
			new CommandParam("--keepalive-time", "Wait SECONDS between keepalive probes", true),
			new CommandParam("--key", "Private key file name (SSL/SSH)", true),
			new CommandParam("--key-type", "Private key file type (DER/PEM/ENG) (SSL)", true),
			new CommandParam("--krb", "Enable Kerberos with security LEVEL (F)", true),
			new CommandParam("--libcurl", "Dump libcurl equivalent code of this command line", true),
			new CommandParam("--limit-rate", "Limit transfer speed to RATE", true),
			new CommandParam("-l", "--list-only, List only mode (F/POP3)"),
			new CommandParam("--local-port", "Force use of RANGE for local port numbers", true),
			new CommandParam("-L", "--location, Follow redirects (H)"),
			new CommandParam("--location-trusted ", " Like '--location', and send auth to other hosts (H)"),
			new CommandParam("--login-options", "Server login options (IMAP, POP3, SMTP)", true),
			new CommandParam("-M", "--manual, Display the full manual"),
			new CommandParam("--mail-from", "Mail from this address (SMTP)", true),
			new CommandParam("--mail-rcpt", "Mail to this/these addresses (SMTP)", true),
			new CommandParam("--mail-auth", "Originator address of the original email (SMTP)", true),
			new CommandParam("--max-filesize", "Maximum file size to download (H/F)", true),
			new CommandParam("--max-redirs", "Maximum number of redirects allowed (H)", true),
			new CommandParam("-m", "--max-time SECONDS, Maximum time allowed for the transfer", true),
			new CommandParam("--metalink", "Process given URLs as metalink XML file"),
			new CommandParam("--negotiate", "Use HTTP Negotiate (SPNEGO) authentication (H)"),
			new CommandParam("-n", "--netrc, Must read .netrc for user name and password"),
			new CommandParam("--netrc-optional", "Use either .netrc or URL; overrides -n"),
			new CommandParam("--netrc-file", "Specify FILE for netrc", true),
			new CommandParam(" -:", "--next, Allows the following URL to use a separate set of options"),
			new CommandParam("--no-alpn", "Disable the ALPN TLS extension (H)"),
			new CommandParam("-N", "--no-buffer, Disable buffering of the output stream"),
			new CommandParam("--no-keepalive", "Disable keepalive use on the connection"),
			new CommandParam("--no-npn", "Disable the NPN TLS extension (H)"),
			new CommandParam("--no-sessionid", "Disable SSL session-ID reusing (SSL)"),
			new CommandParam("--noproxy", "List of hosts which do not use proxy"),
			new CommandParam("--ntlm", "Use HTTP NTLM authentication (H)"),
			new CommandParam("--oauth2-bearer", "OAuth 2 Bearer Token (IMAP, POP3, SMTP)", true),
			new CommandParam("-o", "--output FILE, Write to FILE instead of stdout", true),
			new CommandParam("--pass", "Pass phrase for the private key (SSL/SSH)", true),
			new CommandParam("--path-as-is", "Do not squash .. sequences in URL path"),
			new CommandParam("--pinnedpubkey", "Public key (PEM/DER) to verify peer against (OpenSSL/GnuTLS/NSS/wolfSSL/CyaSSL/GSKit only)", true),
			new CommandParam("--post301", "Do not switch to GET after following a 301 redirect (H)"),
			new CommandParam("--post302", "Do not switch to GET after following a 302 redirect (H)"),
			new CommandParam("--post303", "Do not switch to GET after following a 303 redirect (H)"),
			new CommandParam(" -#", "--progress-bar, Display transfer progress as a progress bar"),
			new CommandParam("--proto", "Enable/disable PROTOCOLS", true),
			new CommandParam("--proto-redir", "Enable/disable PROTOCOLS on redirect", true),
			new CommandParam("-x", "--proxy [PROTOCOL://]HOST[:PORT], Use proxy on given port"),
			new CommandParam("--proxy-anyauth", "Pick \"any\" proxy authentication method (H)"),
			new CommandParam("--proxy-basic", "Use Basic authentication on the proxy (H)"),
			new CommandParam("--proxy-digest", "Use Digest authentication on the proxy (H)"),
			new CommandParam("--proxy-negotiate", "Use HTTP Negotiate (SPNEGO) authentication on the proxy (H)"),
			new CommandParam("--proxy-ntlm", "Use NTLM authentication on the proxy (H)"),
			new CommandParam("-U, ]", "--proxy-user USER[:PASSWORD, Proxy user and password"),
			new CommandParam("--proxy1.0 HOST[:PORT]", "Use HTTP/1.0 proxy on given port"),
			new CommandParam("-p", "--proxytunnel, Operate through a HTTP proxy tunnel (using CONNECT)"),
			new CommandParam("--pubkey", "Public key file name (SSH)", true),
			new CommandParam("-Q", "--quote CMD, Send command(s) to server before transfer (F/SFTP)", true),
			new CommandParam("--random-file", "File for reading random data from (SSL)", true),
			new CommandParam("-r", "--range RANGE, Retrieve only the bytes within RANGE", true),
			new CommandParam("--raw", "Do HTTP \"raw\"; no transfer decoding (H)"),
			new CommandParam("-e", "--referer, Referer URL (H)"),
			new CommandParam("-J", "--remote-header-name, Use the header-provided filename (H)"),
			new CommandParam("-O", "--remote-name, Write output to a file named as the remote file"),
			new CommandParam("--remote-name-all", "Use the remote file name for all URLs"),
			new CommandParam("-R", "--remote-time, Set the remote file's time on the local output"),
			new CommandParam("-X", "--request COMMAND, Specify request command to use", true),
			new CommandParam("--resolve HOST:PORT:ADDRESS", "Force resolve of HOST:PORT to ADDRESS"),
			new CommandParam("--retry", "Retry request NUM times if transient problems occur", true),
			new CommandParam("--retry-delay", "Wait SECONDS between retries", true),
			new CommandParam("--retry-max-time", "Retry only within this period", true),
			new CommandParam("--sasl-ir", "Enable initial response in SASL authentication"),
			new CommandParam("-S", "--show-error, Show error. With -s, make curl show errors when they occur"),
			new CommandParam("-s", "--silent, Silent mode (don't output anything)"),
			new CommandParam("--socks4 HOST[:PORT]", "SOCKS4 proxy on given host + port"),
			new CommandParam("--socks4a HOST[:PORT] ", " SOCKS4a proxy on given host + port"),
			new CommandParam("--socks5 HOST[:PORT]", "SOCKS5 proxy on given host + port"),
			new CommandParam("--socks5-hostname HOST[:PORT]", "SOCKS5 proxy, pass host name to proxy"),
			new CommandParam("-Y", "--speed-limit RATE, Stop transfers below RATE for 'speed-time' secs", true),
			new CommandParam("-y", "--speed-time SECONDS, Trigger 'speed-limit' abort after SECONDS (default: 30)", true),
			new CommandParam("--ssl", "Try SSL/TLS (FTP, IMAP, POP3, SMTP)"),
			new CommandParam("--ssl-reqd", "Require SSL/TLS (FTP, IMAP, POP3, SMTP)"),
			new CommandParam("-2", "--sslv2, Use SSLv2 (SSL)"),
			new CommandParam("-3", "--sslv3, Use SSLv3 (SSL)"),
			new CommandParam("--ssl-allow-beast", "Allow security flaw to improve interop (SSL)"),
			new CommandParam("--stderr", "Where to redirect stderr (use \"-\" for stdout)", true),
			new CommandParam("--tcp-nodelay", "Use the TCP_NODELAY option"),
			new CommandParam("-t", "--telnet-option OPT=VAL, Set telnet option"),
			new CommandParam("--tftp-blksize", "Set TFTP BLKSIZE option (must be >512)", true),
			new CommandParam("-z", "--time-cond TIME, Transfer based on a time condition", true),
			new CommandParam("-1", "--tlsv1, Use => TLSv1 (SSL)"),
			new CommandParam("--tlsv1.0", "Use TLSv1.0 (SSL)"),
			new CommandParam("--tlsv1.1", "Use TLSv1.1 (SSL)"),
			new CommandParam("--tlsv1.2", "Use TLSv1.2 (SSL)"),
			new CommandParam("--trace", "Write a debug trace to FILE", true),
			new CommandParam("--trace-ascii", "Like --trace, but without hex output", true),
			new CommandParam("--trace-time", "Add time stamps to trace/verbose output"),
			new CommandParam("--tr-encoding", "Request compressed transfer encoding (H)"),
			new CommandParam("-T", "--upload-file FILE, Transfer FILE to destination", true),
			new CommandParam("--url", "URL to work with", true),
			new CommandParam("-B", "--use-ascii, Use ASCII/text transfer"),
			new CommandParam("-u", "--user USER[:PASSWORD], user and password"),
			new CommandParam("--tlsuser", "username", true),
			new CommandParam("--tlspassword", "TLS password", true),
			new CommandParam("--tlsauthtype", "TLS authentication type (default: SRP)", true),
			new CommandParam("--unix-socket", "Connect through this Unix domain socket", true),
			new CommandParam("-A", "--user-agent STRING, Send User-Agent STRING to server (H)", true),
			new CommandParam("-v", "--verbose, Make the operation more talkative"),
			new CommandParam("-V", "--version, Show version number and quit"),
			new CommandParam("-w", "--write-out FORMAT, Use output FORMAT after completion", true),
			new CommandParam("--xattr", "Store metadata in extended file attributes"));

	public static final Command CUT = new Command("cut", "Print selected parts of lines from each FILE to standard output.",
			new CommandParam("-b", "select only these bytes from LIST.", true),
			new CommandParam("-c", "select only these characters from LIST.", true),
			new CommandParam("-f", "select only these fields.", true),
			new CommandParam("-d", "use DELIM instead of TAB for field delimiter.", true),
			new CommandParam("-s", "do not print lines not containing delimiters."),
			new CommandParam("-n", "don't split multibyte characters (Ignored)."));

	public static final Command DALVIKVM = new Command("dalvikvm", "",
			new CommandParam("-classpath classpath", "(-cp classpath)", true),
			new CommandParam("-Dproperty=", "value", true),
			new CommandParam("-verbose:", "('gc', 'jit', 'jni', or 'class')", true),
			new CommandParam("-showversion"),
			new CommandParam("-help"),
			new CommandParam("-agentlib:jdwp=", "options", true),
			new CommandParam("-Xrunjdwp:", "<options>", true),
			new CommandParam("-Xbootclasspath:", "bootclasspath", true),
			new CommandParam("-Xcheck:", "tag (e.g. 'jni')", true),
			new CommandParam("-XmsN ", "min heap, must be multiple of 1K, >= 1MB", true),
			new CommandParam("-XmxN ", "max heap, must be multiple of 1K, >= 2MB", true),
			new CommandParam("-XssN ", "stack size", true),
			new CommandParam("-Xint"),
			new CommandParam("-Xzygote"),
			new CommandParam("-Xjnitrace:", "substring (eg NativeClass or nativeMethod)", true),
			new CommandParam("-Xstacktracefile:", "<filename>", true),
			new CommandParam("-Xgc:", "[no]preverify", true),
			new CommandParam("-Xgc:", "[no]postverify", true),
			new CommandParam("-XX:HeapGrowthLimit=", "", true),
			new CommandParam("-XX:HeapMinFree=", "", true),
			new CommandParam("-XX:HeapMaxFree=", "", true),
			new CommandParam("-XX:NonMovingSpaceCapacity=", "", true),
			new CommandParam("-XX:HeapTargetUtilization=", "doublevalue", true),
			new CommandParam("-XX:ForegroundHeapGrowthMultiplier=", "doublevalue", true),
			new CommandParam("-XX:LowMemoryMode"),
			new CommandParam("-Xprofile:", "{threadcpuclock,wallclock,dualclock}", true),
			new CommandParam("-Xjitcodecachesize:", "N", true),
			new CommandParam("-Xjitthreshold:", "integervalue", true),
			new CommandParam("-Xgc:", "[no]preverify_rosalloc", true),
			new CommandParam("-Xgc:", "[no]postsweepingverify_rosalloc", true),
			new CommandParam("-Xgc:", "[no]postverify_rosalloc", true),
			new CommandParam("-Xgc:", "[no]presweepingverify", true),
			new CommandParam("-Ximage:", "filename", true),
			new CommandParam("-Xbootclasspath-locations:", "bootclasspath (override the dex locations of the -Xbootclasspath files)", true),
			new CommandParam("-XX:+DisableExplicitGC"),
			new CommandParam("-XX:ParallelGCThreads=", "integervalue", true),
			new CommandParam("-XX:ConcGCThreads=", "integervalue", true),
			new CommandParam("-XX:MaxSpinsBeforeThinLockInflation=", "integervalue", true),
			new CommandParam("-XX:LongPauseLogThreshold=", "integervalue", true),
			new CommandParam("-XX:LongGCLogThreshold=", "integervalue", true),
			new CommandParam("-XX:DumpGCPerformanceOnShutdown"),
			new CommandParam("-XX:DumpJITInfoOnShutdown"),
			new CommandParam("-XX:IgnoreMaxFootprint"),
			new CommandParam("-XX:UseTLAB"),
			new CommandParam("-XX:BackgroundGC=", "none", true),
			new CommandParam("-XX:LargeObjectSpace=", "{disabled,map,freelist}", true),
			new CommandParam("-XX:LargeObjectThreshold=", "N", true),
			new CommandParam("-Xmethod-trace"),
			new CommandParam("-Xmethod-trace-file:", "filename", true),
			new CommandParam("-Xmethod-trace-file-size:", "integervalue", true),
			new CommandParam("-Xenable-profiler"),
			new CommandParam("-Xprofile-filename:", "filename", true),
			new CommandParam("-Xprofile-period:", "integervalue", true),
			new CommandParam("-Xprofile-duration:", "integervalue", true),
			new CommandParam("-Xprofile-interval:", "integervalue", true),
			new CommandParam("-Xprofile-backoff:", "doublevalue", true),
			new CommandParam("-Xprofile-start-immediately"),
			new CommandParam("-Xprofile-top-k-threshold:", "doublevalue", true),
			new CommandParam("-Xprofile-top-k-change-threshold:", "doublevalue", true),
			new CommandParam("-Xprofile-type:", "{method,stack}", true),
			new CommandParam("-Xprofile-max-stack-depth:", "integervalue", true),
			new CommandParam("-Xcompiler:", "filename", true),
			new CommandParam("-Xcompiler-option", "dex2oat-option", true),
			new CommandParam("-Ximage-compiler-option", "dex2oat-option", true),
			new CommandParam("-Xpatchoat:", "filename", true),
			new CommandParam("-Xusejit:", "booleanvalue", true),
			new CommandParam("-X", "[no]relocate", true),
			new CommandParam("-X", "[no]dex2oat (Whether to invoke dex2oat on the application)", true),
			new CommandParam("-X", "[no]image-dex2oat (Whether to create and use a boot image)", true),
			new CommandParam("-Xno-dex-file-fallback", "(Don't fall back to dex files without oat files)"),
			new CommandParam("-ea", "[:<package name>... |:<class name>]", true),
			new CommandParam("-da", "[:<package name>... |:<class name>] (-enableassertions, -disableassertions)", true),
			new CommandParam("-esa"),
			new CommandParam("-dsa", "(-enablesystemassertions, -disablesystemassertions)", true),
			new CommandParam("-Xverify:", "{none,remote,all}", true),
			new CommandParam("-Xrs"),
			new CommandParam("-Xint:", "portable, fast, jit", true),
			new CommandParam("-Xdexopt:", "{none,verified,all,full}", true),
			new CommandParam("-Xnoquithandler"),
			new CommandParam("-Xjniopts:", "{warnonly,forcecopy}", true),
			new CommandParam("-Xjnigreflimit:", "integervalue", true),
			new CommandParam("-Xgc:", "[no]precise", true),
			new CommandParam("-Xgc:", "[no]verifycardtable", true),
			new CommandParam("-X", "[no]genregmap", true),
			new CommandParam("-Xverifyopt:", "[no]checkmon", true),
			new CommandParam("-Xcheckdexsum"),
			new CommandParam("-Xincludeselectedop"),
			new CommandParam("-Xjitop:", "hexopvalue[-endvalue][,hexopvalue[-endvalue]]*", true),
			new CommandParam("-Xincludeselectedmethod"),
			new CommandParam("-Xjitblocking"),
			new CommandParam("-Xjitmethod:", "signature[,signature]* (eg Ljava/lang/String\\;replace)", true),
			new CommandParam("-Xjitclass:", "classname[,classname]*", true),
			new CommandParam("-Xjitoffset:", "offset[,offset]", true),
			new CommandParam("-Xjitconfig:", "filename", true),
			new CommandParam("-Xjitcheckcg"),
			new CommandParam("-Xjitverbose"),
			new CommandParam("-Xjitprofile"),
			new CommandParam("-Xjitdisableopt"),
			new CommandParam("-Xjitsuspendpoll"),
			new CommandParam("-XX:mainThreadStackSize=", "N", true));

	public static final Command DALVIKVM32 = new Command("dalvikvm32", DALVIKVM.getDetail(), DALVIKVM.getParams());

	public static final Command DATE = new Command("date", "Set/get the current date/time. With no SET shows the current date.\n" +
														   "Default SET format is \"MMDDhhmm[[CC]YY][.ss]\", that's (2 digits each)\n" +
														   "month, day, hour (0-23), and minute. Optionally century, year, and second.\n",
			new CommandParam("-d", "Show DATE instead of current time (convert date format)"),
			new CommandParam("-r", "Use modification time of FILE instead of current date"),
			new CommandParam("-s", "+FORMAT for SET or -d (instead of MMDDhhmm[[CC]YY][.ss])" +
								   "+FORMAT specifies display format string using these escapes:\n" +
								   "\n" +
								   "%% literal %             %n newline              %t tab\n" +
								   "%S seconds (00-60)       %M minute (00-59)       %m month (01-12)\n" +
								   "%H hour (0-23)           %I hour (01-12)         %p AM/PM\n" +
								   "%y short year (00-99)    %Y year                 %C century\n" +
								   "%a short weekday name    %A weekday name         %u day of week (1-7, 1=mon)\n" +
								   "%b short month name      %B month name           %Z timezone name\n" +
								   "%j day of year (001-366) %d day of month (01-31) %e day of month ( 1-31)\n" +
								   "\n" +
								   "%U Week of year (0-53 start sunday)   %W Week of year (0-53 start monday)\n" +
								   "%V Week of year (1-53 start monday, week < 4 days not part of this year)\n" +
								   "\n" +
								   "%D = \"%m/%d/%y\"    %r = \"%I : %M : %S %p\"   %T = \"%H:%M:%S\"   %h = \"%b\"\n" +
								   "%x locale date     %X locale time           %c locale date/time", true),
			new CommandParam("-u", "Use UTC instead of current timezone"));

	public static final Command DF = new Command("df", "");

	public static final Command DIRNAME = new Command("dirname", "Show directory portion of path");

	public static final Command DMESG = new Command("dmesg", "Print or control the kernel ring buffer",
			new CommandParam("-c", "Clear the ring buffer after printing"),
			new CommandParam("-n", "Set kernel logging LEVEL (1-9)"),
			new CommandParam("-r", "Raw output (with <level markers>)"),
			new CommandParam("-s", "Show the last SIZE many bytes"),
			new CommandParam("-t", "Don't print kernel's timestamps"));

	public static final Command DOS2UNIX = new Command("dos2unix", "Convert newline format from dos \"\\r\\n\" to unix \"\\n\".\n" +
																   "If no files listed copy from stdin, \"-\" is a synonym for stdin.");

	public static final Command DPM = new Command("dpm", "",
			new CommandParam("set-active-admin", "Sets the given component as active admin for an existing user.", true),
			new CommandParam("set-device-owner", "Sets the given component as active admin, and its package as device owner.", true),
			new CommandParam("set-profile-owner", "Sets the given component as active admin and profile  owner for an existing user.", true));

	public static final Command DU = new Command("du", "",
			new CommandParam("-H"),
			new CommandParam("-L"),
			new CommandParam("-P"),
			new CommandParam("-a"),
			new CommandParam("-d", "depth", true),
			new CommandParam("-s"),
			new CommandParam("-c"),
			new CommandParam("-g"),
			new CommandParam("-h"),
			new CommandParam("-i"),
			new CommandParam("-k"),
			new CommandParam("-m"),
			new CommandParam("-n"),
			new CommandParam("-r"),
			new CommandParam("-x"));

	public static final Command DUMPE2FS = new Command("dumpe2fs", "",
			new CommandParam("-b"),
			new CommandParam("-f"),
			new CommandParam("-h"),
			new CommandParam("-i"),
			new CommandParam("-x"),
			new CommandParam("-V"),
			new CommandParam("-o superblock=", "<num>", true),
			new CommandParam("-o blocksize=", "<num>", true));

	public static final Command DUMPSYS = new Command("dumpsys", "");

	public static final Command EBTABLES = new Command("ebtables", "Options:\n" +
																   "--proto  -p [!] proto         : protocol hexadecimal, by name or LENGTH\n" +
																   "--src    -s [!] address[/mask]: source mac address\n" +
																   "--dst    -d [!] address[/mask]: destination mac address\n" +
																   "--in-if  -i [!] name[+]       : network input interface name\n" +
																   "--out-if -o [!] name[+]       : network output interface name\n" +
																   "--logical-in  [!] name[+]     : logical bridge input interface name\n" +
																   "--logical-out [!] name[+]     : logical bridge output interface name\n" +
																   "--set-counters -c chain\n" +
																   "          pcnt bcnt           : set the counters of the to be added rule\n" +
																   "--modprobe -M program         : try to insert modules using this program\n" +
																   "--concurrent                  : use a file lock to support concurrent scripts\n" +
																   "--version -V                  : print package version\n" +
																   "\n" +
																   "Environment variable:\n" +
																   "EBTABLES_ATOMIC_FILE          : if set <FILE> (see above) will equal its value\n" +
																   "\n" +
																   "Standard targets: DROP, ACCEPT, RETURN or CONTINUE;\n" +
																   "The target can also be a user defined chain.\n" +
																   "\n" +
																   "Supported chains for the filter table:\n" +
																   "INPUT FORWARD OUTPUT \n",
			new CommandParam("-A", "--append chain, append to chain", true),
			new CommandParam("-D", "--delete chain, delete matching rule from chain\n" +
								   "--delete chain rulenum, delete rule at position rulenum from chain", true),
			new CommandParam("-C", "--change-counters chain [rulenum] pcnt bcnt, change counters of existing rule", true),
			new CommandParam("-I", "--insert chain rulenum, insert rule at position rulenum in chain", true),
			new CommandParam("-L", "--list [chain], list the rules in a chain or in all chains", true),
			new CommandParam("-F", "--flush [chain], delete all rules in chain or in all chains", true),
			new CommandParam("--init-table", "replace the kernel table with the initial table"),
			new CommandParam("-Z", "--zero [chain], put counters on zero in chain or in all chains", true),
			new CommandParam("-P", "--policy chain target, change policy on chain to target", true),
			new CommandParam("-N", "--new-chain chain, create a user defined chain", true),
			new CommandParam("-E", "--rename-chain old new, rename a chain", true),
			new CommandParam("-X", "--delete-chain [chain], delete a user defined chain", true),
			new CommandParam("--atomic-commit", "update the kernel w/t table contained in <FILE>"),
			new CommandParam("--atomic-init", "put the initial kernel table into <FILE>"),
			new CommandParam("--atomic-save", "put the current kernel table into <FILE>"),
			new CommandParam("--atomic-file", "set <FILE> to file", true));

	public static final Command ECHO = new Command("echo", "");

	public static final Command EFSKS = new Command("efsks", "Example usage: \n" +
															 "        sudo ./efsks -p /dev/ttyUSB0 -1 /dev/block/mmcblk0p10/ -2 /dev/block/mmcblk0p11/ -3 /dev/block/mmcblk0p12/ \n" +
															 "        sudo ./efsks -p /dev/ttyUSB0 -t 120 -w ./",
			new CommandParam("-p", "--port ttyport, Device name for USB driver, i.e. /dev/ttyUSB0", true),
			new CommandParam("-t", "--timeout value, in seconds, how long TTY device should wait", true),
			new CommandParam("-w", "--where path, Where files from MDM are temporarily stored", true));

	public static final Command ENV = new Command("env", "Set the environment for command invocation.",
			new CommandParam("-i", "Clear existing environment"));

	public static final Command EXPAND = new Command("expand", "Expand tabs to spaces according to tabstops.",
			new CommandParam("-t", "TABLIST\n" +
								   "Specify tab stops, either a single number instead of the default 8,\n" +
								   "or a comma separated list of increasing numbers representing tabstop\n" +
								   "positions (absolute, not increments) with each additional tab beyound\n" +
								   "that becoming one space.\n", true));

	public static final Command EXPR = new Command("expr", "Evaluate expression and print result. For example, \"expr 1 + 2\".\n" +
														   "\n" +
														   "The supported operators are (grouped from highest to lowest priority):\n" +
														   "\n" +
														   "  ( )    :    * / %    + -    != <= < >= > =    &    |\n" +
														   "\n" +
														   "Each constant and operator must be a separate command line argument.\n" +
														   "All operators are infix, meaning they expect a constant (or expression\n" +
														   "that resolves to a constant) on each side of the operator. Operators of\n" +
														   "the same priority (within each group above) are evaluated left to right.\n" +
														   "Parentheses may be used (as separate arguments) to elevate the priority\n" +
														   "of expressions.\n" +
														   "\n" +
														   "Calling expr from a command shell requires a lot of \\( or '*' escaping\n" +
														   "to avoid interpreting shell control characters.\n" +
														   "\n" +
														   "The & and | operators are logical (not bitwise) and may operate on\n" +
														   "strings (a blank string is \"false\"). Comparison operators may also\n" +
														   "operate on strings (alphabetical sort).\n" +
														   "\n" +
														   "Constants may be strings or integers. Comparison, logical, and regex\n" +
														   "operators may operate on strings (a blank string is \"false\"), other\n" +
														   "operators require integers.\n");

	public static final Command FALLOCATE = new Command("fallocate", "Tell the filesystem to allocate space for a file.",
			new CommandParam("-l", "size", true));

	public static final Command FALSE = new Command("false", "");

	public static final Command FIND = new Command("find", "Search directories for matching files.\n" +
														   "Default: search \".\" match all -print all matches.\n" +
														   "Match filters:\n" +
														   "-name  PATTERN filename with wildcards   -iname      case insensitive -name\n" +
														   "-path  PATTERN path name with wildcards  -ipath      case insensitive -path\n" +
														   "-user  UNAME   belongs to user UNAME     -nouser     user not in /etc/passwd\n" +
														   "-group GROUP   belongs to group GROUP    -nogroup    group not in /etc/group\n" +
														   "-perm  [-]MODE permissons (-=at least)   -prune      ignore contents of dir\n" +
														   "-size  N[c]    512 byte blocks (c=bytes) -xdev       stay in this filesystem\n" +
														   "-links N       hardlink count            -atime N    accessed N days ago\n" +
														   "-ctime N       created N days ago        -mtime N    modified N days ago\n" +
														   "-newer FILE    newer mtime than FILE     -mindepth # at least # dirs down\n" +
														   "-depth         ignore contents of dir    -maxdepth # at most # dirs down\n" +
														   "-type [bcdflps] (block, char, dir, file, symlink, pipe, socket)\n" +
						/*This should be optimized.*/	   "\n" +
														   "Numbers N may be prefixed by a - (less than) or + (greater than):\n" +
														   "\n" +
														   "Combine matches with:\n" +
														   "!, -a, -o, ( )    not, and, or, group expressions\n" +
														   "\n" +
														   "Actions:\n" +
														   "-print   Print match with newline  -print0    Print match with null\n" +
														   "-exec    Run command with path     -execdir   Run command in file's dir\n" +
														   "-ok      Ask before exec           -okdir     Ask before execdir\n" +
														   "\n" +
														   "Commands substitute \"{}\" with matched file. End with \";\" to run each file,\n" +
														   "or \"+\" (next argument after \"{}\") to collect and run with multiple files.",
			new CommandParam("-H", "Follow command line symlinks"),
			new CommandParam("-L", "Follow all symlinks"));

	public static final Command FM_QSOC_PATCHES = new Command("fm_qsoc_patches", "fm_qsoc_patches <ChipVersion> <0, 1, 2 for normal/wa_enable/wa_disable> [true/false for Analogmode]");

	public static final Command FMCONFIG = new Command("fmconfig", "FM V4L2 device configuration application",
			new CommandParam("enable", "Open and intialize FM Radio device"),
			new CommandParam("disable", "CLose FM Radio device"),
			new CommandParam("setfreq", "Set Frequency ex. setfreq 93500", true),
			new CommandParam("getconfig", "Get Current Configuration"),
			new CommandParam("seek", "Seek <dir> ex. seek up", true),
			new CommandParam("scan", "Scan for list of stations ex. scan up", true),
			new CommandParam("searchlist", "Search a list of stations"),
			new CommandParam("quit", "Quit application"));

	public static final Command FREE = new Command("free", "Display the total, free and used amount of physical memory and swap space.",
			new CommandParam("-b", "Output units (default)"),
			new CommandParam("-k", "Output units"),
			new CommandParam("-m", "Output units"),
			new CommandParam("-g", "Output units"),
			new CommandParam("-t", "Output units"));

	public static final Command FTMDAEMON = new Command("ftmdaemon", "",
			new CommandParam("-n", "--nodaemon, do not run as a daemon"),
			new CommandParam("-d", "show more debug messages (-dd for even more)"),
			new CommandParam("-b", "--board-type, Board Type"),
			new CommandParam("--help", "display this help and exit"));

	public static final Command UNAME = new Command("uname", "Print system information.",
			new CommandParam("-s", "System name"),
			new CommandParam("-n", "Network (domain) name"),
			new CommandParam("-r", "Kernel Release number"),
			new CommandParam("-v", "Kernel Version"),
			new CommandParam("-m", "Machine (hardware) name"),
			new CommandParam("-a", "All of the above"));

	public static final Command NULL = new Command("", "", new CommandParam("", ""));
}
