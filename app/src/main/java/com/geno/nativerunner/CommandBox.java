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
			new CommandParam("-b ", "", true),
			new CommandParam("-c ", "", true),
			new CommandParam("-s ", "", true),
			new CommandParam("-l"));

	public static final Command APPOPS = new Command("appops", "",
			new CommandParam("set ", "", true),
			new CommandParam("get ", "", true),
			new CommandParam("reset ", "", true));

	public static final Command APPWIDGET = new Command("appwidget", "",
			new CommandParam("grantbind --package ", "", true),
			new CommandParam("revokebind --package ", "", true));

	public static final Command ATRACE = new Command("atrace", "",
			new CommandParam("-a ", "enable app-level tracing for a comma separated list of cmdlines", true),
			new CommandParam("-b ", "use a trace buffer size of N KB", true),
			new CommandParam("-c", "trace into a circular buffer"),
			new CommandParam("-k ", "trace the listed kernel functions", true),
			new CommandParam("-s ", "sleep for N seconds before tracing [default 0]", true),
			new CommandParam("-t ", "trace for N seconds [default 5]", true),
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
			new CommandParam("--setbsz ", "Set block size", true),
			new CommandParam("--getsz", "Get device size in 512-byte sectors"),
			new CommandParam("--getsize", "Get device size in sectors (deprecated)"),
			new CommandParam("--getsize64", "Get device size in bytes"),
			new CommandParam("--flushbufs", "Flush buffers"),
			new CommandParam("--rereadpt", "Reread partition table"));

	public static final Command BMGR = new Command("bmgr", "",
			new CommandParam("backup ", "The 'backup' command schedules a backup pass for the named package." +
									   "Note that the backup pass will effectively be a no-op if the package" +
									   "does not actually have changed data to store.", true),
			new CommandParam("enable ", "The 'enable' command enables or disables the entire backup mechanism." +
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
			new CommandParam("transport ", "The 'transport' command designates the named transport as the currently" +
										  "active one.  This setting is persistent across reboots.", true),
			new CommandParam("restore ", "The 'restore' command when given just a restore token initiates a full-system" +
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
			new CommandParam("wipe ", "The 'wipe' command causes all backed-up data for the given package to be" +
									 "erased from the given transport's storage.  The next backup operation" +
									 "that the given application performs will rewrite its entire data set." +
									 "Transport names to use here are those reported by 'list transports'.", true),
			new CommandParam("fullbackup ", "The 'fullbackup' command induces a full-data stream backup for one or more" +
										   "packages.  The data is sent via the currently active transport.", true));

	public static final Command BRCTL = new Command("brctl", "",
			new CommandParam("addbr ", "add bridge", true),
			new CommandParam("delbr ", "delete bridge", true),
			new CommandParam("addif ", "add interface to bridge", true),
			new CommandParam("delif ", "delete interface from bridge", true),
			new CommandParam("hairpin ", "turn hairpin on/off", true),
			new CommandParam("setageing ", "set ageing time", true),
			new CommandParam("setbridgeprio ", "set bridge priority", true),
			new CommandParam("setfd ", "set bridge forward delay", true),
			new CommandParam("sethello ", "set hello time", true),
			new CommandParam("setmaxage ", "set max message age", true),
			new CommandParam("setpathcost ", "set path cost", true),
			new CommandParam("setportprio ", "set port priority", true),
			new CommandParam("show ", "show a list of bridges", true),
			new CommandParam("showmacs ", "show a list of mac addrs", true),
			new CommandParam("showstp ", "show bridge stp info", true),
			new CommandParam("stp ", "turn stp on/off", true));

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
			new CommandParam("insert --uri ", "<URI> a content provider URI.\n" +
									   "  <BINDING> binds a typed value to a column and is formatted:\n" +
									   "  <COLUMN_NAME>:<TYPE>:<COLUMN_VALUE> where:\n" +
									   "  <TYPE> specifies data type such as:\n" +
									   "  b - boolean, s - string, i - integer, l - long, f - float, d - double\n" +
									   "  Note: Omit the value for passing an empty string, e.g column:s:\n" +
									   "  Example:\n" +
									   "  # Add \"new_setting\" secure setting with value \"new_value\".\n" +
									   "  adb shell content insert --uri content://settings/secure --bind name:s:new_setting --bind value:s:new_value\n"),
			new CommandParam("update --uri ", "<WHERE> is a SQL style where clause in quotes (You have to escape single quotes - see example below).\n" +
											 "  Example:\n" +
											 "  # Change \"new_setting\" secure setting to \"newer_value\".\n" +
											 "  adb shell content update --uri content://settings/secure --bind value:s:newer_value --where \"name='new_setting'\""),
			new CommandParam("delete --uri ", "Example:\n" +
											 "  # Remove \"new_setting\" secure setting.\n" +
											 "  adb shell content delete --uri content://settings/secure --where \"name='new_setting'\""),
			new CommandParam("query --uri ", "<PROJECTION> is a list of colon separated column names and is formatted:\n" +
											"  <COLUMN_NAME>[:<COLUMN_NAME>...]\n" +
											"  <SORT_ORDER> is the order in which rows in the result should be sorted.\n" +
											"  Example:\n" +
											"  # Select \"name\" and \"value\" columns from secure settings where \"name\" is equal to \"new_setting\" and sort the result by name in ascending order.\n" +
											"  adb shell content query --uri content://settings/secure --projection name:value --where \"name='new_setting'\" --sort \"name ASC\""),
			new CommandParam("call --uri ", "<METHOD> is the name of a provider-defined method\n" +
										   "  <ARG> is an optional string argument\n" +
										   "  <BINDING> is like --bind above, typed data of the form <KEY>:{b,s,i,l,f,d}:<VAL>"),
			new CommandParam("read --uri ", "Example:\n" +
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
			new CommandParam("-F ", "use archive FILE instead of stdin/stdout", true),
			new CommandParam("-p ", "copy-pass mode, copy stdin file list to directory DEST", true),
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
			new CommandParam("--cacert ", "CA certificate to verify peer against (SSL)", true),
			new CommandParam("--capath ", "CA directory to verify peer against (SSL)", true),
			new CommandParam("-E", "--cert CERT[:PASSWD], Client certificate file and password (SSL)"),
			new CommandParam("--cert-status", "Verify the status of the server certificate (SSL)"),
			new CommandParam("--cert-type ", "Certificate file type (DER/PEM/ENG) (SSL)", true),
			new CommandParam("--ciphers ", "SSL ciphers to use (SSL)", true),
			new CommandParam("--compressed", "Request compressed response (using deflate or gzip)"),
			new CommandParam("-K ", "--config FILE, Read config from FILE", true),
			new CommandParam("--connect-timeout ", "Maximum time allowed for connection", true),
			new CommandParam("-C ", "--continue-at OFFSET, Resumed transfer OFFSET", true),
			new CommandParam("-b ", "--cookie STRING/FILE, Read cookies from STRING/FILE (H)"),
			new CommandParam("-c ", "--cookie-jar FILE, Write cookies to FILE after operation (H)", true),
			new CommandParam("--create-dirs", "Create necessary local directory hierarchy"),
			new CommandParam("--crlf", "Convert LF to CRLF in upload"),
			new CommandParam("--crlfile ", "Get a CRL list in PEM format from the given file", true),
			new CommandParam("-d ", "--data DATA, HTTP POST data (H)", true),
			new CommandParam("--data-raw ", "HTTP POST data, '@' allowed (H)", true),
			new CommandParam("--data-ascii ", "HTTP POST ASCII data (H)", true),
			new CommandParam("--data-binary ", "HTTP POST binary data (H)", true),
			new CommandParam("--data-urlencode ", "HTTP POST data url encoded (H)", true),
			new CommandParam("--delegation ", "GSS-API delegation permission", true),
			new CommandParam("--digest", "Use HTTP Digest Authentication (H)"),
			new CommandParam("--disable-eprt", "Inhibit using EPRT or LPRT (F)"),
			new CommandParam("--disable-epsv", "Inhibit using EPSV (F)"),
			new CommandParam("--dns-servers", "DNS server addrs to use: 1.1.1.1;2.2.2.2"),
			new CommandParam("--dns-interface", "Interface to use for DNS requests"),
			new CommandParam("--dns-ipv4-addr", "IPv4 address to use for DNS requests, dot notation"),
			new CommandParam("--dns-ipv6-addr ", "IPv6 address to use for DNS requests, dot notation"),
			new CommandParam("-D ", "--dump-header FILE, Write the headers to FILE", true),
			new CommandParam("--egd-file ", "EGD socket path for random data (SSL)", true),
			new CommandParam("--engine ", "Crypto engine (use \"--engine list\" for list) (SSL)", true),
			new CommandParam("-f", "--fail, Fail silently (no output at all) on HTTP errors (H)"),
			new CommandParam("--false-start", "Enable TLS False Start."),
			new CommandParam("-F ", "--form CONTENT, Specify HTTP multipart POST data (H)", true),
			new CommandParam("--form-string ", "Specify HTTP multipart POST data (H)", true),
			new CommandParam("--ftp-account", "Account data string (F)"),
			new CommandParam("--ftp-alternative-to-user ", "String to replace \"USER [name]\" (F)", true),
			new CommandParam("--ftp-create-dirs", "Create the remote dirs if not present (F)"),
			new CommandParam("--ftp-method [MULTICWD/NOCWD/SINGLECWD]", "Control CWD usage (F)"),
			new CommandParam("--ftp-pasv", "Use PASV/EPSV instead of PORT (F)"),
			new CommandParam("-P ", "--ftp-port ADR, Use PORT with given address instead of PASV (F)", true),
			new CommandParam("--ftp-skip-pasv-ip", "Skip the IP address for PASV (F)"),
			new CommandParam("--ftp-pret", "Send PRET before PASV (for drftpd) (F)"),
			new CommandParam("--ftp-ssl-ccc", "Send CCC after authenticating (F)"),
			new CommandParam("--ftp-ssl-ccc-mode ACTIVE/PASSIVE", "Set CCC mode (F)"),
			new CommandParam("--ftp-ssl-control", "Require SSL/TLS for FTP login, clear for transfer (F)"),
			new CommandParam("-G", "--get, Send the -d data with a HTTP GET (H)"),
			new CommandParam("-g", "--globoff, Disable URL sequences and ranges using {} and []"),
			new CommandParam("-H ", "--header LINE, Pass custom header LINE to server (H)", true),
			new CommandParam("-I", "--head, Show document info only"),
			new CommandParam("-h", "--help, This help text"),
			new CommandParam("--hostpubmd5 MD5", "Hex-encoded MD5 string of the host public key. (SSH)"),
			new CommandParam("-0", "--http1.0, Use HTTP 1.0 (H)"),
			new CommandParam("--http1.1", "Use HTTP 1.1 (H)"),
			new CommandParam("--http2", "Use HTTP 2 (H)"),
			new CommandParam("--ignore-content-length", "Ignore the HTTP Content-Length header"),
			new CommandParam("-i", "--include, Include protocol headers in the output (H/F)"),
			new CommandParam("-k", "--insecure, Allow connections to SSL sites without certs (H)"),
			new CommandParam("--interface ", "Use network INTERFACE (or address)", true),
			new CommandParam("-4", "--ipv4, Resolve name to IPv4 address"),
			new CommandParam("-6", "--ipv6, Resolve name to IPv6 address"),
			new CommandParam("-j", "--junk-session-cookies, Ignore session cookies read from file (H)"),
			new CommandParam("--keepalive-time ", "Wait SECONDS between keepalive probes", true),
			new CommandParam("--key ", "Private key file name (SSL/SSH)", true),
			new CommandParam("--key-type ", "Private key file type (DER/PEM/ENG) (SSL)", true),
			new CommandParam("--krb ", "Enable Kerberos with security LEVEL (F)", true),
			new CommandParam("--libcurl ", "Dump libcurl equivalent code of this command line", true),
			new CommandParam("--limit-rate ", "Limit transfer speed to RATE", true),
			new CommandParam("-l", "--list-only, List only mode (F/POP3)"),
			new CommandParam("--local-port ", "Force use of RANGE for local port numbers", true),
			new CommandParam("-L", "--location, Follow redirects (H)"),
			new CommandParam("--location-trusted ", " Like '--location', and send auth to other hosts (H)"),
			new CommandParam("--login-options ", "Server login options (IMAP, POP3, SMTP)", true),
			new CommandParam("-M", "--manual, Display the full manual"),
			new CommandParam("--mail-from ", "Mail from this address (SMTP)", true),
			new CommandParam("--mail-rcpt ", "Mail to this/these addresses (SMTP)", true),
			new CommandParam("--mail-auth ", "Originator address of the original email (SMTP)", true),
			new CommandParam("--max-filesize ", "Maximum file size to download (H/F)", true),
			new CommandParam("--max-redirs ", "Maximum number of redirects allowed (H)", true),
			new CommandParam("-m ", "--max-time SECONDS, Maximum time allowed for the transfer", true),
			new CommandParam("--metalink", "Process given URLs as metalink XML file"),
			new CommandParam("--negotiate", "Use HTTP Negotiate (SPNEGO) authentication (H)"),
			new CommandParam("-n", "--netrc, Must read .netrc for user name and password"),
			new CommandParam("--netrc-optional", "Use either .netrc or URL; overrides -n"),
			new CommandParam("--netrc-file ", "Specify FILE for netrc", true),
			new CommandParam(" -:", "--next, Allows the following URL to use a separate set of options"),
			new CommandParam("--no-alpn", "Disable the ALPN TLS extension (H)"),
			new CommandParam("-N", "--no-buffer, Disable buffering of the output stream"),
			new CommandParam("--no-keepalive", "Disable keepalive use on the connection"),
			new CommandParam("--no-npn", "Disable the NPN TLS extension (H)"),
			new CommandParam("--no-sessionid", "Disable SSL session-ID reusing (SSL)"),
			new CommandParam("--noproxy", "List of hosts which do not use proxy"),
			new CommandParam("--ntlm", "Use HTTP NTLM authentication (H)"),
			new CommandParam("--oauth2-bearer ", "OAuth 2 Bearer Token (IMAP, POP3, SMTP)", true),
			new CommandParam("-o ", "--output FILE, Write to FILE instead of stdout", true),
			new CommandParam("--pass ", "Pass phrase for the private key (SSL/SSH)", true),
			new CommandParam("--path-as-is", "Do not squash .. sequences in URL path"),
			new CommandParam("--pinnedpubkey ", "Public key (PEM/DER) to verify peer against (OpenSSL/GnuTLS/NSS/wolfSSL/CyaSSL/GSKit only)", true),
			new CommandParam("--post301", "Do not switch to GET after following a 301 redirect (H)"),
			new CommandParam("--post302", "Do not switch to GET after following a 302 redirect (H)"),
			new CommandParam("--post303", "Do not switch to GET after following a 303 redirect (H)"),
			new CommandParam(" -#", "--progress-bar, Display transfer progress as a progress bar"),
			new CommandParam("--proto ", "Enable/disable PROTOCOLS", true),
			new CommandParam("--proto-redir ", "Enable/disable PROTOCOLS on redirect", true),
			new CommandParam("-x", "--proxy [PROTOCOL://]HOST[:PORT], Use proxy on given port"),
			new CommandParam("--proxy-anyauth", "Pick \"any\" proxy authentication method (H)"),
			new CommandParam("--proxy-basic", "Use Basic authentication on the proxy (H)"),
			new CommandParam("--proxy-digest", "Use Digest authentication on the proxy (H)"),
			new CommandParam("--proxy-negotiate", "Use HTTP Negotiate (SPNEGO) authentication on the proxy (H)"),
			new CommandParam("--proxy-ntlm", "Use NTLM authentication on the proxy (H)"),
			new CommandParam("-U, ]", "--proxy-user USER[:PASSWORD, Proxy user and password"),
			new CommandParam("--proxy1.0 HOST[:PORT]", "Use HTTP/1.0 proxy on given port"),
			new CommandParam("-p", "--proxytunnel, Operate through a HTTP proxy tunnel (using CONNECT)"),
			new CommandParam("--pubkey ", "Public key file name (SSH)", true),
			new CommandParam("-Q ", "--quote CMD, Send command(s) to server before transfer (F/SFTP)", true),
			new CommandParam("--random-file ", "File for reading random data from (SSL)", true),
			new CommandParam("-r ", "--range RANGE, Retrieve only the bytes within RANGE", true),
			new CommandParam("--raw", "Do HTTP \"raw\"; no transfer decoding (H)"),
			new CommandParam("-e", "--referer, Referer URL (H)"),
			new CommandParam("-J", "--remote-header-name, Use the header-provided filename (H)"),
			new CommandParam("-O", "--remote-name, Write output to a file named as the remote file"),
			new CommandParam("--remote-name-all", "Use the remote file name for all URLs"),
			new CommandParam("-R", "--remote-time, Set the remote file's time on the local output"),
			new CommandParam("-X ", "--request COMMAND, Specify request command to use", true),
			new CommandParam("--resolve ", "HOST:PORT:ADDRESS, Force resolve of HOST:PORT to ADDRESS", true),
			new CommandParam("--retry ", "Retry request NUM times if transient problems occur", true),
			new CommandParam("--retry-delay ", "Wait SECONDS between retries", true),
			new CommandParam("--retry-max-time ", "Retry only within this period", true),
			new CommandParam("--sasl-ir", "Enable initial response in SASL authentication"),
			new CommandParam("-S", "--show-error, Show error. With -s, make curl show errors when they occur"),
			new CommandParam("-s", "--silent, Silent mode (don't output anything)"),
			new CommandParam("--socks4 HOST[:PORT]", "SOCKS4 proxy on given host + port"),
			new CommandParam("--socks4a HOST[:PORT] ", " SOCKS4a proxy on given host + port"),
			new CommandParam("--socks5 HOST[:PORT]", "SOCKS5 proxy on given host + port"),
			new CommandParam("--socks5-hostname HOST[:PORT]", "SOCKS5 proxy, pass host name to proxy"),
			new CommandParam("-Y ", "--speed-limit RATE, Stop transfers below RATE for 'speed-time' secs", true),
			new CommandParam("-y ", "--speed-time SECONDS, Trigger 'speed-limit' abort after SECONDS (default: 30)", true),
			new CommandParam("--ssl", "Try SSL/TLS (FTP, IMAP, POP3, SMTP)"),
			new CommandParam("--ssl-reqd", "Require SSL/TLS (FTP, IMAP, POP3, SMTP)"),
			new CommandParam("-2", "--sslv2, Use SSLv2 (SSL)"),
			new CommandParam("-3", "--sslv3, Use SSLv3 (SSL)"),
			new CommandParam("--ssl-allow-beast", "Allow security flaw to improve interop (SSL)"),
			new CommandParam("--stderr ", "Where to redirect stderr (use \"-\" for stdout)", true),
			new CommandParam("--tcp-nodelay", "Use the TCP_NODELAY option"),
			new CommandParam("-t", "--telnet-option OPT=VAL, Set telnet option"),
			new CommandParam("--tftp-blksize ", "Set TFTP BLKSIZE option (must be >512)", true),
			new CommandParam("-z ", "--time-cond TIME, Transfer based on a time condition", true),
			new CommandParam("-1", "--tlsv1, Use => TLSv1 (SSL)"),
			new CommandParam("--tlsv1.0", "Use TLSv1.0 (SSL)"),
			new CommandParam("--tlsv1.1", "Use TLSv1.1 (SSL)"),
			new CommandParam("--tlsv1.2", "Use TLSv1.2 (SSL)"),
			new CommandParam("--trace ", "Write a debug trace to FILE", true),
			new CommandParam("--trace-ascii ", "Like --trace, but without hex output", true),
			new CommandParam("--trace-time", "Add time stamps to trace/verbose output"),
			new CommandParam("--tr-encoding", "Request compressed transfer encoding (H)"),
			new CommandParam("-T ", "--upload-file FILE, Transfer FILE to destination", true),
			new CommandParam("--url ", "URL to work with", true),
			new CommandParam("-B", "--use-ascii, Use ASCII/text transfer"),
			new CommandParam("-u", "--user USER[:PASSWORD], user and password"),
			new CommandParam("--tlsuser ", "username", true),
			new CommandParam("--tlspassword ", "TLS password", true),
			new CommandParam("--tlsauthtype ", "TLS authentication type (default: SRP)", true),
			new CommandParam("--unix-socket ", "Connect through this Unix domain socket", true),
			new CommandParam("-A ", "--user-agent STRING, Send User-Agent STRING to server (H)", true),
			new CommandParam("-v", "--verbose, Make the operation more talkative"),
			new CommandParam("-V", "--version, Show version number and quit"),
			new CommandParam("-w ", "--write-out FORMAT, Use output FORMAT after completion", true),
			new CommandParam("--xattr", "Store metadata in extended file attributes"));

	public static final Command CUT = new Command("cut", "Print selected parts of lines from each FILE to standard output.",
			new CommandParam("-b ", "select only these bytes from LIST.", true),
			new CommandParam("-c ", "select only these characters from LIST.", true),
			new CommandParam("-f ", "select only these fields.", true),
			new CommandParam("-d ", "use DELIM instead of TAB for field delimiter.", true),
			new CommandParam("-s", "do not print lines not containing delimiters."),
			new CommandParam("-n", "don't split multibyte characters (Ignored)."));

	public static final Command DALVIKVM = new Command("dalvikvm", "",
			new CommandParam("-classpath ", "(-cp classpath)", true),
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
			new CommandParam("-ea ", "[:<package name>... |:<class name>]", true),
			new CommandParam("-da ", "[:<package name>... |:<class name>] (-enableassertions, -disableassertions)", true),
			new CommandParam("-esa"),
			new CommandParam("-dsa ", "(-enablesystemassertions, -disablesystemassertions)", true),
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
			new CommandParam("set-active-admin ", "Sets the given component as active admin for an existing user.", true),
			new CommandParam("set-device-owner ", "Sets the given component as active admin, and its package as device owner.", true),
			new CommandParam("set-profile-owner ", "Sets the given component as active admin and profile  owner for an existing user.", true));

	public static final Command DU = new Command("du", "",
			new CommandParam("-H"),
			new CommandParam("-L"),
			new CommandParam("-P"),
			new CommandParam("-a"),
			new CommandParam("-d ", "depth", true),
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
			new CommandParam("-A ", "--append chain, append to chain", true),
			new CommandParam("-D ", "--delete chain, delete matching rule from chain\n" +
								    "--delete chain rulenum, delete rule at position rulenum from chain", true),
			new CommandParam("-C ", "--change-counters chain [rulenum] pcnt bcnt, change counters of existing rule", true),
			new CommandParam("-I ", "--insert chain rulenum, insert rule at position rulenum in chain", true),
			new CommandParam("-L ", "--list [chain], list the rules in a chain or in all chains", true),
			new CommandParam("-F ", "--flush [chain], delete all rules in chain or in all chains", true),
			new CommandParam("--init-table ", "replace the kernel table with the initial table"),
			new CommandParam("-Z ", "--zero [chain], put counters on zero in chain or in all chains", true),
			new CommandParam("-P ", "--policy chain target, change policy on chain to target", true),
			new CommandParam("-N ", "--new-chain chain, create a user defined chain", true),
			new CommandParam("-E ", "--rename-chain old new, rename a chain", true),
			new CommandParam("-X ", "--delete-chain [chain], delete a user defined chain", true),
			new CommandParam("--atomic-commit", "update the kernel w/t table contained in <FILE>"),
			new CommandParam("--atomic-init", "put the initial kernel table into <FILE>"),
			new CommandParam("--atomic-save", "put the current kernel table into <FILE>"),
			new CommandParam("--atomic-file ", "set <FILE> to file", true));

	public static final Command ECHO = new Command("echo", "");

	public static final Command EFSKS = new Command("efsks", "Example usage: \n" +
															 "        sudo ./efsks -p /dev/ttyUSB0 -1 /dev/block/mmcblk0p10/ -2 /dev/block/mmcblk0p11/ -3 /dev/block/mmcblk0p12/ \n" +
															 "        sudo ./efsks -p /dev/ttyUSB0 -t 120 -w ./",
			new CommandParam("-p ", "--port ttyport, Device name for USB driver, i.e. /dev/ttyUSB0", true),
			new CommandParam("-t ", "--timeout value, in seconds, how long TTY device should wait", true),
			new CommandParam("-w ", "--where path, Where files from MDM are temporarily stored", true));

	public static final Command ENV = new Command("env", "Set the environment for command invocation.",
			new CommandParam("-i", "Clear existing environment"));

	public static final Command EXPAND = new Command("expand", "Expand tabs to spaces according to tabstops.",
			new CommandParam("-t ", "TABLIST\n" +
								   "Specify tab stops, either a single number instead of the default 8," +
								   "or a comma separated list of increasing numbers representing tabstop" +
								   "positions (absolute, not increments) with each additional tab beyound" +
								   "that becoming one space.\n", true));

	public static final Command EXPR = new Command("expr", "Evaluate expression and print result. For example, \"expr 1 + 2\".\n" +
														   "\n" +
														   "The supported operators are (grouped from highest to lowest priority):\n" +
														   "\n" +
														   "  ( )    :    * / %    + -    != <= < >= > =    &    |\n" +
														   "\n" +
														   "Each constant and operator must be a separate command line argument." +
														   "All operators are infix, meaning they expect a constant (or expression" +
														   "that resolves to a constant) on each side of the operator. Operators of" +
														   "the same priority (within each group above) are evaluated left to right." +
														   "Parentheses may be used (as separate arguments) to elevate the priority" +
														   "of expressions.\n" +
														   "\n" +
														   "Calling expr from a command shell requires a lot of \\( or '*' escaping\n" +
														   "to avoid interpreting shell control characters.\n" +
														   "\n" +
														   "The & and | operators are logical (not bitwise) and may operate on" +
														   "strings (a blank string is \"false\"). Comparison operators may also" +
														   "operate on strings (alphabetical sort).\n" +
														   "\n" +
														   "Constants may be strings or integers. Comparison, logical, and regex" +
														   "operators may operate on strings (a blank string is \"false\"), other" +
														   "operators require integers.\n");

	public static final Command FALLOCATE = new Command("fallocate", "Tell the filesystem to allocate space for a file.",
			new CommandParam("-l ", "size", true));

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
														   "Commands substitute \"{}\" with matched file. End with \";\" to run each file," +
														   "or \"+\" (next argument after \"{}\") to collect and run with multiple files.",
			new CommandParam("-H", "Follow command line symlinks"),
			new CommandParam("-L", "Follow all symlinks"));

	public static final Command FM_QSOC_PATCHES = new Command("fm_qsoc_patches", "fm_qsoc_patches <ChipVersion> <0, 1, 2 for normal/wa_enable/wa_disable> [true/false for Analogmode]");

	public static final Command FMCONFIG = new Command("fmconfig", "FM V4L2 device configuration application",
			new CommandParam("enable", "Open and intialize FM Radio device"),
			new CommandParam("disable", "CLose FM Radio device"),
			new CommandParam("setfreq ", "Set Frequency ex. setfreq 93500", true),
			new CommandParam("getconfig", "Get Current Configuration"),
			new CommandParam("seek ", "Seek <dir> ex. seek up", true),
			new CommandParam("scan ", "Scan for list of stations ex. scan up", true),
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

	public static final Command GETENFORCE = new Command("getenforce", "Shows whether SELinux is disabled, enforcing, or permissive.");

	public static final Command GETEVENT = new Command("getevent", "",
			new CommandParam("-t", "show time stamps"),
			new CommandParam("-n", "don't print newlines"),
			new CommandParam("-s", "print switch states for given bits"),
			new CommandParam("-S", "print all switch states"),
			new CommandParam("-v", "verbosity mask (errs=1, dev=2, name=4, info=8, vers=16, pos. events=32, props=64)"),
			new CommandParam("-d", "show HID descriptor, if available"),
			new CommandParam("-p", "show possible events (errs, dev, name, pos. events)"),
			new CommandParam("-i", "show all device info and possible events"),
			new CommandParam("-l", "label event types and names in plain text"),
			new CommandParam("-q", "quiet (clear verbosity mask)"),
			new CommandParam("-c", "print given number of events then exit"),
			new CommandParam("-r", "print rate events are received"));

	public static final Command GETPROP = new Command("getprop", "Gets an Android system property, or lists them all.");

	public static final Command GROUPS = new Command("groups", "Print the groups a user is in.");

	public static final Command HEAD = new Command("head", "Copy first lines from files to stdout. If no files listed, copy from" +
														   "stdin. Filename \"-\" is a synonym for stdin.",
			new CommandParam("-n ", "Number of lines to copy.", true));

	public static final Command HID = new Command("hid", "");

	public static final Command HOSTNAME = new Command("hostname", "Get/Set the current hostname");

	public static final Command IFCONFIG = new Command("ifconfig", "Display or configure network interface." +
																   "With no arguments, display active interfaces. First argument is interface" +
																   "to operate on, one argument by itself displays that interface.\n" +
																   "\n" +
																   "Additional arguments are actions to perform on the interface:\n" +
																   "\n" +
																   "ADDRESS[/NETMASK] - set IPv4 address (1.2.3.4/5)\n" +
																   "default - unset ipv4 address\n" +
																   "add|del ADDRESS[/PREFIXLEN] - add/remove IPv6 address (1111::8888/128)\n" +
																   "up - enable interface\n" +
																   "down - disable interface\n" +
																   "\n" +
																   "netmask|broadcast|pointopoint ADDRESS - set more IPv4 characteristics\n" +
																   "hw ether|infiniband ADDRESS - set LAN hardware address (AA:BB:CC...)\n" +
																   "txqueuelen LEN - number of buffered packets before output blocks\n" +
																   "mtu LEN - size of outgoing packets (Maximum Transmission Unit)\n" +
																   "\n" +
																   "Flags you can set on an interface (or -remove by prefixing with -):\n" +
																   "arp - don't use Address Resolution Protocol to map LAN routes\n" +
																   "promisc - don't discard packets that aren't to this LAN hardware address\n" +
																   "multicast - force interface into multicast mode if the driver doesn't\n" +
																   "allmulti - promisc for multicast packets\n" +
																   "\n" +
																   "Obsolete fields included for historical purposes:\n" +
																   "irq|io_addr|mem_start ADDR - micromanage obsolete hardware\n" +
																   "outfill|keepalive INTEGER - SLIP analog dialup line quality monitoring\n" +
																   "metric INTEGER - added to Linux 0.9.10 with comment \"never used\", still true\n",
			new CommandParam("-a", "Show all interfaces, not just active ones"));

	public static final Command ID = new Command("id", "Print user and group ID.",
			new CommandParam("-G", "Show only the group IDs"),
			new CommandParam("-Z Show only SELinux context", ""),
			new CommandParam("-g", "Show only the effective group ID"),
			new CommandParam("-n", "print names instead of numeric IDs (to be used with -Ggu)"),
			new CommandParam("-r", "Show real ID instead of effective ID"),
			new CommandParam("-u", "Show only the effective user ID"));

	public static final Command IFTOP = new Command("iftop", "",
			new CommandParam("-r ", "repeats", true),
			new CommandParam("-d ", "delay", true));

	public static final Command IME = new Command("ime", "",
			new CommandParam("list", "-a | -s, The list command prints all enabled input methods.  Use" +
									 "the -a option to see all input methods.  Use" +
									 "the -s option to see only a single summary line of each.", true),
			new CommandParam("enable", "ID, The enable command allows the given input method ID to be used.", true),
			new CommandParam("disable", "ID, The disable command disallows the given input method ID from use.", true),
			new CommandParam("set", "ID, The set command switches to the given input method ID.", true));

	public static final Command INOTIFYD = new Command("inofityd", "When a filesystem event matching MASK occurs to a FILE, run PROG as:\n" +
																   "\n" +
																   "  PROG EVENTS FILE [DIRFILE]\n" +
																   "\n" +
																   "If PROG is \"-\" events are sent to stdout.\n" +
																   "\n" +
																   "This file is:\n" +
																   "  a  accessed    c  modified    e  metadata change  w  closed (writable)\n" +
																   "  r  opened      D  deleted     M  moved            0  closed (unwritable)\n" +
																   "  u  unmounted   o  overflow    x  unwatchable\n" +
																   "\n" +
																   "A file in this directory is:\n" +
																   "  m  moved in    y  moved out   n  created          d  deleted\n" +
																   "\n" +
																   "When x event happens for all FILEs, inotifyd exits (after waiting for PROG).");

	public static final Command INPUT = new Command("input", "",
			new CommandParam("mouse"),
			new CommandParam("keyboard ", "keyevent [--longpress] <key code number or name>"),
			new CommandParam("joystick"),
			new CommandParam("touchnavigation"),
			new CommandParam("touchpad"),
			new CommandParam("trackball ", "press OR roll <dx> <dy>"),
			new CommandParam("stylus"),
			new CommandParam("dpad"),
			new CommandParam("touchscreen ", "text <string> OR tap <x> <y> OR swipe <x1> <y1> <x2> <y2> [duration(ms)]"),
			new CommandParam("gamepad"));

	public static final Command INSMOD = new Command("insmod", "");

	public static final Command IOCTL = new Command("ioctl", "",
			new CommandParam("-l ", "Length of io buffer", true),
			new CommandParam("-a ", "Size of each argument (1-8)", true),
			new CommandParam("-r", "Open device in read only mode"),
			new CommandParam("-d", "Direct argument (no iobuffer)"),
			new CommandParam("-h", "Print help"));

	public static final Command IONICE = new Command("ionice", "",
			new CommandParam("none ", "prio", true),
			new CommandParam("rt ", "prio", true),
			new CommandParam("be ", "prio", true),
			new CommandParam("idle ", "prio", true));

	public static final Command IP = new Command("ip", "",
			new CommandParam("-V", "Version"),
			new CommandParam("-s", "statistics"),
			new CommandParam("-d", "details"),
			new CommandParam("-r", "resolve"),
			new CommandParam("-f ", "family { inet | inet6 | ipx | dnet | link }", true),
			new CommandParam("-l ", "loops { maximum-addr-flush-attempts }", true),
			new CommandParam("-o", "oneline"),
			new CommandParam("-t", "timestamp"),
			new CommandParam("-b ", "batch [filename]", true),
			new CommandParam("-rc ", "vbuf [size]", true));

	public static final Command IP6TABLES = new Command("ip6tables", "Options:\n" +
																	 "    --ipv4      -4              Error (line is ignored by ip6tables-restore)\n" +
																	 "    --ipv6      -6              Nothing (line is ignored by iptables-restore)\n" +
																	 "[!] --protocol  -p proto        protocol: by number or name, eg. `tcp'\n" +
																	 "[!] --source    -s address[/mask][,...]\n" +
																	 "                                source specification\n" +
																	 "[!] --destination -d address[/mask][,...]\n" +
																	 "                                destination specification\n" +
																	 "[!] --in-interface -i input name[+]\n" +
																	 "                                network interface name ([+] for wildcard)\n" +
																	 "  --jump        -j target\n" +
																	 "                                target for rule (may load target extension)\n" +
																	 "  --goto        -g chain\n" +
																	 "                                jump to chain with no return\n" +
																	 "  --match       -m match\n" +
																	 "                                extended match (may load extension)\n" +
																	 "  --numeric     -n              numeric output of addresses and ports\n" +
																	 "[!] --out-interface -o output name[+]\n" +
																	 "                                network interface name ([+] for wildcard)\n" +
																	 "  --table       -t table        table to manipulate (default: `filter')\n" +
																	 "  --verbose     -v              verbose mode\n" +
																	 "  --wait        -w              wait for the xtables lock\n" +
																	 "  --line-numbers                print line numbers when listing\n" +
																	 "  --exact       -x              expand numbers (display exact values)\n" +
																	 "  --modprobe=<command>          try to insert modules using this command\n" +
																	 "  --set-counters PKTS BYTES     set the counter during insert/append\n" +
																	 "[!] --version   -V              print package version.\n",
			new CommandParam("-A ", "--append chain, Append to chain", true),
			new CommandParam("-C ", "--check chain, Check for the existence of a rule", true),
			new CommandParam("-D ", "--delete chain, Delete matching rule from chain", true),
			new CommandParam("-D ", "--delete chain rulenum, Delete rule rulenum (1 = first) from chain", true),
			new CommandParam("-I ", "--insert chain [rulenum], Insert in chain as rulenum (default 1=first)", true),
			new CommandParam("-R ", "--replace chain rulenum, Replace rule rulenum (1 = first) in chain", true),
			new CommandParam("-L ", "--list [chain [rulenum]], List the rules in a chain or all chains", true),
			new CommandParam("-S ", "--list-rules [chain [rulenum]], Print the rules in a chain or all chains", true),
			new CommandParam("-F ", "--flush [chain], Delete all rules in chain or all chains", true),
			new CommandParam("-Z ", "--zero [chain [rulenum]], Zero counters in chain or all chains", true),
			new CommandParam("-N ", "--new chain, Create a new user-defined chain", true),
			new CommandParam("-X ", "--delete-chain [chain], Delete a user-defined chain", true),
			new CommandParam("-P ", "--policy chain target, Change policy on chain to target", true),
			new CommandParam("-E ", "--rename-chain old-chain new-chain, Change chain name, (moving any references)", true));

	public static final Command IPTABLES = new Command("iptables", IP6TABLES.getDetail(), IP6TABLES.getParams());

	public static final Command KILL = new Command("kill", "",
			new CommandParam("-s ", "signame", true),
			new CommandParam("-signum"),
			new CommandParam("-signame"),
			new CommandParam("-l ", "exit_status ...", true));

	public static final Command LD_MC = new Command("ld.mc", "MCLinker",
			new CommandParam("--allow-multiple-definition", "Allow multiple definitions"),
			new CommandParam("-Bgroup", "Info the dynamic linker to lookup only inside the group", true),
			new CommandParam("-Bsymbolic", "Bind references within the shared library", true),
			new CommandParam("--dynamic-linker=", "Set the name of the dynamic linker", true),
			new CommandParam("--enable-new-dtags", "Enable use of DT_RUNPATH and DT_FLAGS"),
			new CommandParam("--entry=", "Use the explicit symbol as the entrance of your program", true),
			new CommandParam("--no-undefined", "Do not allow unresolved references"),
			new CommandParam("-soname=", "Set internal name of shared library", true),
			new CommandParam("--spare-dynamic-tags ", "Set the number of spare dynamic tags (DT_NULL)", true),
			new CommandParam("-z ", "Extensions for GNU ld compatibility", true),
			new CommandParam("--gc-sections", "Enable garbage collection of unused input sections"),
			new CommandParam("--icf-iterations ", "Set number of iterations to do ICF", true),
			new CommandParam("--icf=", "Identical Code Folding", true),
			new CommandParam("--ld-generated-unwind-info", "Request creation of unwind info for linker generated code sections like PLT"),
			new CommandParam("--no-gc-sections", "Disable garbage collection of unused input sections"),
			new CommandParam("--no-ld-generated-unwind-info", "Don't create unwind info for linker generated sections to save size"),
			new CommandParam("--no-print-gc-sections", "Do not list sections removed by garbage collection"),
			new CommandParam("--no-print-icf-sections", "Do not list sections folded by ICF"),
			new CommandParam("--print-gc-sections", "List all sections removed by garbage collection"),
			new CommandParam("--print-icf-sections", "List all sections folded by ICF"),
			new CommandParam("-Bdynamic", "Link against dynamic library"),
			new CommandParam("-Bstatic", "Link against static library"),
			new CommandParam("--build-id", "Request creation of .note.gnu.build-id ELF note section"),
			new CommandParam("--discard-all", "Discard all local symbols"),
			new CommandParam("--discard-debug", "Discard all temporary local symbols"),
			new CommandParam("--eh-frame-hdr", "Request creation of .eh_frame_hdr section and PT_GNU_EH_FRAME segment"),
			new CommandParam("--exclude-libs ", "Allow linking together mismatched input files", true),
			new CommandParam("--export-dynamic", "Export all dynamic symbols"),
			new CommandParam("--format=", "Specify the binary format for input object files that follow this option on the command line", true),
			new CommandParam("--hash-style=", "Set the type of linker's hash table(s)", true),
			new CommandParam("--nmagic", "Do not page align data"),
			new CommandParam("--no-export-dynamic", "Not export all dynamic symbols"),
			new CommandParam("--no-warn-mismatch", "Allow linking together mismatched input files"),
			new CommandParam("--oformat=", "Output format", true),
			new CommandParam("--omagic", "Do not page align data, do not make text readonly"),
			new CommandParam("-o ", "Output filename", true),
			new CommandParam("-pie", "Emit a position-independent executable file"),
			new CommandParam("--relocatable", "Generate relocatable output"),
			new CommandParam("-shared", "Create a shared library"),
			new CommandParam("--strip-all", "Omit all symbol information from the output file"),
			new CommandParam("--strip-debug", "Omit debugger symbol information from the output file"),
			new CommandParam("--add-needed", "Deprecated"),
			new CommandParam("--as-needed", "Add the dynamic libraries mentioned to DT_NEEDED where there is a non-weak undefined symbol reference from"),
			new CommandParam("--copy-dt-needed-entries", "Add the dynamic libraries mentioned to DT_NEEDED"),
			new CommandParam("--end-group", "Stop recording a group of archives"),
			new CommandParam("--library=", "Add the archive or object file specified by namespec to the list of files to link", true),
			new CommandParam("--no-add-needed", "Deprecated"),
			new CommandParam("--no-as-needed", "Turn off the effect of the --as-needed"),
			new CommandParam("--no-copy-dt-needed-entries", "Turn off the effect of the --copy-dt-needed-entries"),
			new CommandParam("--no-whole-archive", "Turn off the effect of the --whole-archive option"),
			new CommandParam("--script=", "Use the given file as the linker script", true),
			new CommandParam("--start-group", "Start to record a group of archives"),
			new CommandParam("--whole-archive", "Include every object file in the archive in the link"),
			new CommandParam("--colormc=", "Surround the result strings with the marker", true),
			new CommandParam("--error-limit=", "Set the maximum limit of errors", true),
			new CommandParam("--fatal-warnings", "Turn all warnings into errors"),
			new CommandParam("-help", "Display available options (to standard output)"),
			new CommandParam("--no-fatal-warnings", "Do not turn all warnings into errors"),
			new CommandParam("--trace", "Print the names of the input files as ld processes them"),
			new CommandParam("--verbose=", "Set linker diagnostic output level", true),
			new CommandParam("--version", "Display MCLinker version"),
			new CommandParam("--warn-shared-textrel", "Warn if there is a text relocation in the output shared object"),
			new CommandParam("--warning-limit=", "Set the maximum limit of warnings", true),
			new CommandParam("--defsym=", "Define a symbol", true),
			new CommandParam("--portable=", "Use a portable function for the symbol", true),
			new CommandParam("--section-start=", "Locate a output section at the given absolute address", true),
			new CommandParam("-Tbss=", "Set the address of the bss segment", true),
			new CommandParam("-Tdata=", "Set the address of the data segment", true),
			new CommandParam("-Ttext=", "Set the address of the text segment", true),
			new CommandParam("--wrap=", "Use a wrap function for the symbol", true),
			new CommandParam("--library-path=", "Add the given directory to the list of search paths", true),
			new CommandParam("-nostdlib", "Only search lib dirs explicitly specified on cmdline"),
			new CommandParam("-rpath-link=", "Add a directory to the link time library search path", true),
			new CommandParam("-rpath=", "Add a directory to the runtime library search path", true),
			new CommandParam("--sysroot=", "Use the given directory as the location of the sysroot", true),
			new CommandParam("-d", "Define common symbol"),
			new CommandParam("--undefined=", "Force symbol to be undefined in the output file", true),
			new CommandParam("--gpsize=", " Set the maximum size of objects to be optimized using GP", true),
			new CommandParam("-march=", "Architecture to generate code for", true),
			new CommandParam("-mcpu=", "Set a specific cpu type", true),
			new CommandParam("-mtriple=", "Override target triple for module", true),
			new CommandParam("-m ", "Set GNU linker emulation", true));

	public static final Command LN = new Command("ln", "Create a link between FROM and TO.\n" +
													   "With only one argument, create link in current directory.",
			new CommandParam("-s", "Create a symbolic link"),
			new CommandParam("-f", "Force the creation of the link, even if TO already exists"),
			new CommandParam("-n", "Symlink at destination treated as file"),
			new CommandParam("-v", "Verbose"));

	public static final Command LOAD_POLICY = new Command("load_policy", "Load the specified policy file.");

	public static final Command LOG = new Command("log", "",
			new CommandParam("-p ", "priorityChar, v,d,i,w,e", true),
			new CommandParam("-t ", "tag", true));

	public static final Command LOGCAT = new Command("logcat", "filterspecs are a series of \n" +
															   "  <tag>[:priority]\n" +
															   "\n" +
															   "where <tag> is a log component tag (or * for all) and priority is:\n" +
															   "  V    Verbose (default for <tag>)\n" +
															   "  D    Debug (default for '*')\n" +
															   "  I    Info\n" +
															   "  W    Warn\n" +
															   "  E    Error\n" +
															   "  F    Fatal\n" +
															   "  S    Silent (suppress all output)\n" +
															   "\n" +
															   "'*' by itself means '*:D' and <tag> by itself means <tag>:V.\n" +
															   "If no '*' filterspec or -s on command line, all filter defaults to '*:V'.\n" +
															   "eg: '*:S <tag>' prints only <tag>, '<tag>:S' suppresses all <tag> log messages.\n" +
															   "\n" +
															   "If not specified on the command line, filterspec is set from ANDROID_LOG_TAGS.\n" +
															   "\n" +
															   "If not specified with -v on command line, format is set from ANDROID_PRINTF_LOG\n" +
															   "or defaults to \"threadtime\"",
			new CommandParam("-s", "Set default filter to silent."),
			new CommandParam("-f ", "Log to file. Default is stdout", true),
			new CommandParam("-r <kbytes>", "Rotate log every kbytes. Requires -f", true),
			new CommandParam("-n <count>", "Sets max number of rotated logs to <count>, default 4", true),
			new CommandParam("-v <format>", "Sets the log print format, where <format> is:" +
											"brief color long printable process raw tag thread threadtime time usec", true),
			new CommandParam("-D", "print dividers between each log buffer"),
			new CommandParam("-c", "clear (flush) the entire log and exit"),
			new CommandParam("-d", "dump the log and then exit (don't block)"),
			new CommandParam("-t <count>", "print only the most recent <count> lines (implies -d)", true),
			new CommandParam("-t '<time>'", "print most recent lines since specified time (implies -d)", true),
			new CommandParam("-T <count>", "print only the most recent <count> lines (does not imply -d)", true),
			new CommandParam("-T '<time>'", "print most recent lines since specified time (not imply -d), " +
											"count is pure numerical, time is 'MM-DD hh:mm:ss.mmm'", true),
			new CommandParam("-g", "get the size of the log's ring buffer and exit"),
			new CommandParam("-L", "dump logs from prior to last reboot"),
			new CommandParam("-b ", "Request alternate ring buffer, 'main', 'system', 'radio'," +
									"'events', 'crash' or 'all'. Multiple -b parameters are" +
									"allowed and results are interleaved. The default is" +
									"-b main -b system -b crash.", true),
			new CommandParam("-B", "output the log in binary."),
			new CommandParam("-S", "output statistics."),
			new CommandParam("-G ", "set size of log ring buffer, may suffix with K or M.", true),
			new CommandParam("-p", "print prune white and ~black list. Service is specified as" +
								   "UID, UID/PID or /PID. Weighed for quicker pruning if prefix" +
								   "with ~, otherwise weighed for longevity if unadorned. All" +
								   "other pruning activity is oldest first. Special case ~!" +
								   "represents an automatic quicker pruning for the noisiest" +
								   "UID as determined by the current statistics."),
			new CommandParam("-P ", "set prune white and ~black list, using same format as printed above. Must be quoted.", true));

	public static final Command LOGNAME = new Command("logname", "Print the current user name.");

	public static final Command LOGWRAPPER = new Command("logwrapper", "Forks and executes BINARY ARGS, redirecting stdout and stderr to" +
																	   "the Android logging system. Tag is set to BINARY, priority is" +
																	   "always LOG_INFO.",

			new CommandParam("-a", "Causes logwrapper to do abbreviated logging."),
			new CommandParam("-d", "Causes logwrapper to SIGSEGV when BINARY terminates"),
			new CommandParam("-k", "Causes logwrapper to log to the kernel log instead of"));

	public static final Command LOSETUP = new Command("losetup", "Associate a loopback device with a file, or show current file (if any)" +
																 "associated with a loop device.",
			new CommandParam("-a", "Iterate through all loopback devices"),
			new CommandParam("-f", "Find first unused loop device (may create one)"),
			new CommandParam("-j ", "Iterate through all loopback devices associated with FILE", true),
			new CommandParam("-c", "Check capacity (file size changed)"),
			new CommandParam("-d ", "Detach loopback device", true),
			new CommandParam("-s", "Show device name (alias --show)"),
			new CommandParam("-o ", "Start assocation at OFFSET into FILE", true),
			new CommandParam("-r", "Read only"),
			new CommandParam("-S ", "Limit SIZE of loopback association (alias --sizelimit)", true));

	public static final Command LS = new Command("ls", "");

	public static final Command LSMOD = new Command("lsmod", "");

	public static final Command LSOF = new Command("lsof", "");

	public static final Command LSUSB = new Command("lsusb", "");

	public static final Command MAKE_EXT4FS = new Command("make_ext4fs", "",
			new CommandParam("-l ", "len", true),
			new CommandParam("-j ", "journal size", true),
			new CommandParam("-b ", "block size", true),
			new CommandParam("-g ", "blocks per group", true),
			new CommandParam("-i ", "inodes", true),
			new CommandParam("-I ", "inode size", true),
			new CommandParam("-L ", "label", true),
			new CommandParam("-f"),
			new CommandParam("-a ", "android mountpoint", true),
			new CommandParam("-u"),
			new CommandParam("-S ", "file_contexts", true),
			new CommandParam("-C", "fs_config", true),
			new CommandParam("-T ", "tinestamp", true),
			new CommandParam("-z"),
			new CommandParam("-s"),
			new CommandParam("-w"),
			new CommandParam("-c"),
			new CommandParam("-J"),
			new CommandParam("-v"),
			new CommandParam("-B ", "block_list_file", true));

	public static final Command MAKE_F2FS = new Command("make_f2fs", "",
			new CommandParam("-a", "heap-based alocation [default:1]", true),
			new CommandParam("-d", "debug level [default:0]", true),
			new CommandParam("-e", "[extension list] e.g. \"mp3,gif,mov\"", true),
			new CommandParam("-l", "label", true),
			new CommandParam("-o", "overprovision ratio [default:5]", true),
			new CommandParam("-s", "# of segments per section [default:1]", true),
			new CommandParam("-z", "# of sections per zone [default:1]", true),
			new CommandParam("-t", "0: nodiscard, 1: discard [default:1]", true));

	public static final Command MD5SUM = new Command("md5sum", "Calculate md5 hash for each input file, reading from stdin if none." +
															   "Output one hash (16 hex digits) for each input file, followed by filename.",
			new CommandParam("-b", "brief (hash only, no filename"));

	public static final Command MEDIA = new Command("media", "",
			new CommandParam("dispatch ", "dispatch a media key to the system.\n" +
										  "KEY may be: play, pause, play-pause, mute, headsethook," +
										  "stop, next, previous, rewind, record, fast-forword.", true),
			new CommandParam("list-sesstions", "print a list of the current sessions."),
			new CommandParam("monitor ", "monitor updates to the specified session. Use the tag from list-sessions.", true));

	public static final Command MKDIR = new Command("mkdir", "Create one or more directories",
			new CommandParam("-m ", "set permissions of directory to mode.", true),
			new CommandParam("-p", "make parent directories as needed."),
			new CommandParam("-v", "verbose"));

	public static final Command MKE2FS = new Command("mke2fs", "",
			new CommandParam("-c ", "filename", true),
			new CommandParam("-l ", "filename", true),
			new CommandParam("-b ", "block-size", true),
			new CommandParam("-C ", "cluster-size", true),
			new CommandParam("-i ", "bytes-per-inode", true),
			new CommandParam("-I ", "inode-size", true),
			new CommandParam("-J ", "journal-options", true),
			new CommandParam("-G ", "flex-group-size"),
			new CommandParam("-N ", "number-of-inodes", true),
			new CommandParam("-m ", "reserved-blocks-percentage", true),
			new CommandParam("-o ", "creator-os", true),
			new CommandParam("-g ", "blocks-per-group", true),
			new CommandParam("-L ", "volume-label", true),
			new CommandParam("-M ", "last-mounted-directory", true),
			new CommandParam("-O ", "feature[,...]", true),
			new CommandParam("-r ", "fs-revision", true),
			new CommandParam("-E ", "extended-option[,...]", true),
			new CommandParam("-t ", "fs-type", true),
			new CommandParam("-T ", "usage-type", true),
			new CommandParam("-U ", "UUID", true),
			new CommandParam("-j"),
			new CommandParam("-n"),
			new CommandParam("-q"),
			new CommandParam("-v"),
			new CommandParam("-D"),
			new CommandParam("-F"),
			new CommandParam("-K"),
			new CommandParam("-S"),
			new CommandParam("-V"));

	public static final Command MKNOD = new Command("mknod", "Create a special file NAME with a given type. TYPE is b for block device," +
															 "c or u for character device, p for named pipe (which ignores MAJOR/MINOR).",
			new CommandParam("-m", "Mode (file permissions) of new device, in octal or u+x format"));

	public static final Command MKSWAP = new Command("mkswap", "Sets up a Linux swap area on a device or file.");

	public static final Command MKTEMP = new Command("mktemp", "Safely create a new file \"DIR/TEMPLATE\" and print its name." +
															   "Each X in TEMPLATE is replaced with a random printable character. The" +
															   "default TEMPLATE is tmp.XXXXXX, and the default DIR is $TMPDIR if set," +
															   "else \"/tmp\".",
			new CommandParam("-d", "Create directory instead of file (--directory)"),
			new CommandParam("-p ", "Put new file in DIR", true),
			new CommandParam("-q", "Quiet, no error messages"));

	public static final Command MM_QJPEG_DEC_TEST = new Command("mm-qjpeg-dec-test", "Qualcomm Decoder test",
			new CommandParam("", "options", true),
			new CommandParam("-I ", "Path to the input file.", true),
			new CommandParam("-O ", "Path for the output file.", true),
			new CommandParam("-W ", "width", true),
			new CommandParam("-H ", "height", true),
			new CommandParam("-f ", "Output format: YCRCBLP_H2V2 (0 - Default), YCBCRLP_H2V2 (1), YCRCBLP_H2V1 (2), YCBCRLP_H2V1 (3), " +
									"YCRCBLP_H1V2 (4), YCBCRLP_H1V2 (5), YCRCBLP_H1V1 (6), YCBCRLP_H1V1 (7), MONOCHROME(8), " +
									"IYUV_H2V2 (9), YUV2_H2V2 (10), IYUV_H2V1 (11), YUV2_H2V1 (12), IYUV_H1V2 (13), YUV2_H1V2 (14), IYUV_H1V1 (15), YUV2_H1V1 (16)", true));

	public static final Command MM_QJPEG_ENC_TEST = new Command("mm-qjpeg-enc-test", "Qualcomm Encoder test",
			new CommandParam("", "options", true),
			new CommandParam("-I ", "Path to the input file.", true),
			new CommandParam("-O ", "Path for the output file.", true),
			new CommandParam("-W ", "Input image width.", true),
			new CommandParam("-H ", "Input image height.", true),
			new CommandParam("-Q ", "Image quality for compression.", true));

	public static final Command MM_QOMX_IDEC_TEST = new Command("mm-qomx-idec-test", "Decoder test",
			new CommandParam("-I ", "Path to the input file.", true),
			new CommandParam("-O ", "Path for the output file.", true),
			new CommandParam("-W ", "Default image width.", true),
			new CommandParam("-H ", "Default image height.", true),
			new CommandParam("-F ", "Default image format: YCRCBLP_H2V2 (0), YCBCRLP_H2V2 (1), YCRCBLP_H2V1 (2) YCBCRLP_H2V1 (3) " +
									"YCRCBLP_H1V2 (4), YCBCRLP_H1V2 (5), YCRCBLP_H1V1 (6) YCBCRLP_H1V1 (7) " +
									"IYUV_H2V2 (8), YUV2_H2V2 (9), IYUV_H2V1 (10) YUV2_H2V1 (11) " +
									"IYUV_H1V2 (12), YUV2_H1V2 (13), IYUV_H1V1 (14) YUV2_H1V1 (15) MONOCHROME (16)", true),
			new CommandParam("-r ", "Rotation (clockwise) in degrees", true),
			new CommandParam("-P ", "[0/1] Use PMEM buffers", true),
			new CommandParam("-u ", "Enable scale for Image. Make sure the scale parameters are supplied. Scale will not be applied if scale input dimensions dont match the actual image dimensions", true),
			new CommandParam("-m ", "Main input width.", true),
			new CommandParam("-n ", "Main input height.", true),
			new CommandParam("-x ", "Main horizontal offset.", true),
			new CommandParam("-y ", "Main vertical offset.", true),
			new CommandParam("-M ", "Main output width.", true),
			new CommandParam("-N ", "Main output height.", true),
			new CommandParam("-S ", "Scale factor used as a replacement for other scale parameters if the input size is unknown. 1)1/8 2)1/4 3)3/8 4)1/2 5)5/8 6)3/4 7)7/8", true),
			new CommandParam("-a ", "The duration before an abort is issued (i milliseconds).", true),
			new CommandParam("-c ", "Number of decoder instances", true),
			new CommandParam("-b ", "Number of back to back captures", true));

	public static final Command MM_QOMX_IENC_TEST = new Command("mm-qomx-ienc-test", "Encoder test",
			new CommandParam("-I ", "Path to the input file.", true),
			new CommandParam("-O ", "Path for the output file.", true),
			new CommandParam("-W ", "Input image width.", true),
			new CommandParam("-H ", "Input image height.", true),
			new CommandParam("-F ", "Input image format: \n" +
									"YCRCBLP_H2V2 (0), YCBCRLP_H2V2 (1), YCRCBLP_H2V1 (2) YCBCRLP_H2V1 (3)\n" +
									"YCRCBLP_H1V2 (4), YCBCRLP_H1V2 (5), YCRCBLP_H1V1 (6) YCBCRLP_H1V1 (7)\n" +
									"IYUV_H2V2 (8), YUV2_H2V2 (9), IYUV_H2V1 (10) YUV2_H2V1 (11),\n" +
									"IYUV_H1V2 (12), YUV2_H1V2 (13), IYUV_H1V1 (14), YUV2_H1V1 (15), MONOCHROME (16).", true),
			new CommandParam("-r ", "Rotation (clockwise) in degrees", true),
			new CommandParam("-t", "Encode thumbnail image as well. If turned on, the four arguments below should be supplied as well as thumbnail scale params."),
			new CommandParam("-i ", "Path to the input file for thumbnail.", true),
			new CommandParam("-w ", "Thumbnail image width.", true),
			new CommandParam("-h ", "Thumbnail image height.", true),
			new CommandParam("-f ", "Thumbnail image format: (same as main)", true),
			new CommandParam("-Q ", "Quality factor for main image (1-100).", true),
			new CommandParam("-p ", "Preference on which encoder to use(Software-ased or Hardware-accelerated).\n" +
									"HW preferred (0-default), HW only(1), SW peferred (2), SW only (3)", true),
			new CommandParam("-P ", "[0/1] Use PMEM buffers", true),
			new CommandParam("-u ", "Enable scale for Image. Make sure the scale parameters are supplied. Scale will not be applied if scale input dimensions dont match the actual image dimensions", true),
			new CommandParam("-m ", "Main input width.", true),
			new CommandParam("-n ", "Main input height.", true),
			new CommandParam("-x ", "Main horizontal offset.", true),
			new CommandParam("-y ", "Main vertical offset.", true),
			new CommandParam("-M ", "Main output width.", true),
			new CommandParam("-N ", "Main output height.", true),
			new CommandParam("-U", "Enable scale for Thumbnail. Make sure the scale parameters are supplied."),
			new CommandParam("-j ", "Thumbnail input width.", true),
			new CommandParam("-k ", "Thumbnail input height.", true),
			new CommandParam("-X ", "Thumbnail horizontal offset.", true),
			new CommandParam("-Y ", "Thumbnail vertical offset.", true),
			new CommandParam("-J ", "Thumbnail output width.", true),
			new CommandParam("-K ", "Thumbnail output height.", true),
			new CommandParam("-a ", "The duration before an abort is issued (i milliseconds).", true),
			new CommandParam("-R ", "Restart Inverval in number of MCUs"),
			new CommandParam("-c ", "Number of decoder instances", true),
			new CommandParam("-b ", "Number of burst mode captures", true));

	public static final Command MM_VDEC_OMX_TEST = new Command("mm-vdec-omx-test", "",
			new CommandParam("", "clip location", true),
			new CommandParam("", "codec_type", true),
			new CommandParam("", "input_type: 1. per AU(.dat), 2. arbitrary, 3.per NAL/frame", true),
			new CommandParam("", "output_type", true),
			new CommandParam("", "test_case, 1--> H264\n" +
								 " 2--> MP4\n" +
								 " 3--> H263\n" +
								 " 4--> VC1\n" +
								 " 5--> DivX\n" +
								 " 6--> MPEG2\n" +
								 " 7--> VP8\n" +
								 " 8--> HEVC\n" +
								 " 9--> HYBRID\n", true));

	public static final Command MODINFO = new Command("modinfo", "Display module fields for all specified modules, looking in" +
																 "<basedir>/lib/modules/<kernrelease>/ (kernrelease defaults to uname -r).",
			new CommandParam("-0"),
			new CommandParam("-b ", "basedir", true),
			new CommandParam("-k ", "kernelease", true),
			new CommandParam("-F ", "field", true));

	public static final Command MORE = new Command("more", "View FILE (or stdin) one screenful at a time.");

	public static final Command MOUNT = new Command("mount", "");

	public static final Command MOUNTPOINT = new Command("mountpoint", "",
			new CommandParam("-q", "Be quiet, return zero if directory is a mountpoint"),
			new CommandParam("-d", "Print major/minor device number of the directory"),
			new CommandParam("-x", "Print major/minor device number of the block device"));

	public static final Command MV = new Command("mv", "",
			new CommandParam("-f", "force copy by deleting destination file"),
			new CommandParam("-i", "interactive, prompt before overwriting existing DEST"),
			new CommandParam("-n", "no clobber (don't overwrite DEST)"),
			new CommandParam("-v", "verbose"));

	public static final Command N_SMUX = new Command("n_smux", "");

	public static final Command NANDREAD = new Command("nandread", "",
			new CommandParam("-d ", "Read from <dev>", true),
			new CommandParam("-f ", "Write to <file>", true),
			new CommandParam("-s ", "Number of spare bytes in file (default 64)", true),
			new CommandParam("-R", "Raw mode"),
			new CommandParam("-S ", "Start offset (default 0)", true),
			new CommandParam("-L ", "Length (default 0)", true),
			new CommandParam("-v", "Print info"),
			new CommandParam("-h", "Print help"));

	public static final Command NETSTAT = new Command("netstat", "Display networking information",
			new CommandParam("-r", "Display routing table."),
			new CommandParam("-a", "Display all sockets (Default: Connected)."),
			new CommandParam("-l", "Display listening server sockets."),
			new CommandParam("-t", "Display TCP sockets."),
			new CommandParam("-u", "Display UDP sockets."),
			new CommandParam("-w", "Display Raw sockets."),
			new CommandParam("-x", "Display Unix sockets."),
			new CommandParam("-e", "Display other/more information."),
			new CommandParam("-n", "Don't resolve names."),
			new CommandParam("-W", "Wide Display."),
			new CommandParam("-p", "Display PID/Program name for sockets."));

	public static final Command NEWFS_MSDOS = new Command("newfs_msdos", "",
			new CommandParam("-@", "create file system at specified offset", true),
			new CommandParam("-A", "Attempt to cluster align root directory", true),
			new CommandParam("-B", "get bootstrap from file", true),
			new CommandParam("-C", "create image file with specified size", true),
			new CommandParam("-F", "FAT type (12, 16, or 32)", true),
			new CommandParam("-I", "volume ID", true),
			new CommandParam("-L", "volume label", true),
			new CommandParam("-N", "don't create file system: just print out parameters", true),
			new CommandParam("-O", "OEM string", true),
			new CommandParam("-S", "bytes/sector", true),
			new CommandParam("-a", "sectors/FAT", true),
			new CommandParam("-b", "block size", true),
			new CommandParam("-c", "sectors/cluster", true),
			new CommandParam("-e", "root directory entries", true),
			new CommandParam("-f", "standard format", true),
			new CommandParam("-h", "drive heads", true),
			new CommandParam("-i", "file system info sector", true),
			new CommandParam("-k", "backup boot sector", true),
			new CommandParam("-m", "media descriptor", true),
			new CommandParam("-n", "number of FATs", true),
			new CommandParam("-o", "hidden sectors", true),
			new CommandParam("-r", "reserved sectors", true),
			new CommandParam("-s", "file system size (sectors)", true),
			new CommandParam("-u", "sectors/track", true));

	public static final Command NICE = new Command("nice", "Run a command line at an increased or decreased scheduling priority." +
														   "\n" +
														   "Higher numbers make a program yield more CPU time, from -20 (highest " +
														   "priority) to 19 (lowest).  By default processes inherit their parent's " +
														   "niceness (usually 0).  By default this command adds 10 to the parent's " +
														   "priority.  Only root can set a negative niceness level.",
			new CommandParam("-n ", "PRIORITY", true));

	public static final Command NL = new Command("nl", "Number lines of input.",
			new CommandParam("-E ", "Use extended regex syntax (when doing -b pREGEX)"),
			new CommandParam("-b ", "which lines to number: a (all) t (non-empty, default) pREGEX (pattern)", true),
			new CommandParam("-l ", "Only count last of this many consecutive blank lines", true),
			new CommandParam("-n ", "number STYLE: ln (left justified) rn (right justified) rz (zero pad)", true),
			new CommandParam("-s ", "Separator to use between number and line (instead of TAB)", true),
			new CommandParam("-w ", "Width of line numbers (default 6)", true));

	public static final Command NOHUP = new Command("nohup", "Run a command that survives the end of its terminal.\n" +
															 "Redirect tty on stdin to /dev/null, tty on stdout to \"nohup.out\".");

	public static final Command	OD = new Command("od", "",
			new CommandParam("-b"),
			new CommandParam("-c"),
			new CommandParam("-d"),
			new CommandParam("-o"),
			new CommandParam("-s"),
			new CommandParam("-x"),
			new CommandParam("-v"),
			new CommandParam("-A ", "Address base (decimal, octal, hexadecimal, none)", true),
			new CommandParam("-j ", "Skip this many bytes of input", true),
			new CommandParam("-N ", "Stop dumping after this many bytes", true),
			new CommandParam("-t ", "output type a(scii) c(har) d(ecimal) f(loat) o(ctal) u(nsigned) (he)x" +
									"plus optional size in bytes\n" +
									"aliases: -b=-t o1, -c=-t c, -d=-t u2, -o=-t o2, -s=-t d2, -x=-t x2\n", true),
			new CommandParam("-v", "Don't collapse repeated lines together"));

	public static final Command PASTE = new Command("paste", "Replace newlines in files.",
			new CommandParam("-d ", "list of delimiters to separate lines", true),
			new CommandParam("-s", "process files sequentially instead of in parallel"));

	public static final Command UNAME = new Command("uname", "Print system information.",
			new CommandParam("-s", "System name"),
			new CommandParam("-n", "Network (domain) name"),
			new CommandParam("-r", "Kernel Release number"),
			new CommandParam("-v", "Kernel Version"),
			new CommandParam("-m", "Machine (hardware) name"),
			new CommandParam("-a", "All of the above"));

	public static final Command PATCH = new Command("patch", "Apply a unified diff to one or more files.",
			new CommandParam("-i ", "Input file (defaults=stdin)", true),
			new CommandParam("-l", "Loose match (ignore whitespace)"),
			new CommandParam("-p ", "Number of '/' to strip from start of file paths (default=all)", true),
			new CommandParam("-R", "Reverse patch."),
			new CommandParam("-u", "Ignored (only handles \"unified\" diffs)"));

	public static final Command PATCHOAT = new Command("patchoat", "");

	public static final Command PERFD = new Command("perfd", "");

	public static final Command PGREP = new Command("pgrep", "",
			new CommandParam("-l", "Show command name too / List all signals"),
			new CommandParam("-f", "Match against entire command line"),
			new CommandParam("-n", "Show/Signal the newest process only"),
			new CommandParam("-o", "Show/Signal the oldest process only"),
			new CommandParam("-v", "Negate the match"),
			new CommandParam("-x", "Match whole name (not substring)"),
			new CommandParam("-s", "Match session ID (0 for current)", true),
			new CommandParam("-P", "Match parent process ID", true));

	public static final Command PIDOF = new Command("pidof", "Print the PIDs of all processes with the given names.",
			new CommandParam("-s", "single shot, only return one pid."),
			new CommandParam("-o", "omit PID(s)"));

	public static final Command PING = new Command("ping", "",
			new CommandParam("-a"),
			new CommandParam("-A"),
			new CommandParam("-b"),
			new CommandParam("-B"),
			new CommandParam("-d"),
			new CommandParam("-D"),
			new CommandParam("-f"),
			new CommandParam("-h"),
			new CommandParam("-L"),
			new CommandParam("-n"),
			new CommandParam("-O"),
			new CommandParam("-q"),
			new CommandParam("-r"),
			new CommandParam("-R"),
			new CommandParam("-U"),
			new CommandParam("-v"),
			new CommandParam("-V"),
			new CommandParam("-c ", "count", true),
			new CommandParam("-i ", "interval", true),
			new CommandParam("-I ", "interface", true),
			new CommandParam("-m ", "mark", true),
			new CommandParam("-M ", "pmtudisc_option", true),
			new CommandParam("-l ", "preload", true),
			new CommandParam("-p ", "pattern", true),
			new CommandParam("-Q ", "tos", true),
			new CommandParam("-s ", "packetsize", true),
			new CommandParam("-S ", "sndbuf", true),
			new CommandParam("-t ", "ttl", true),
			new CommandParam("-T ", "timestamp_option", true),
			new CommandParam("-w ", "deadline", true),
			new CommandParam("-W ", "timeout", true),
			new CommandParam("", "hop1 ...", true));

	public static final Command PING6 = new Command("ping6", PING.getDetail(), PING.getParams());

	public static final Command PKILL = new Command("pkill", PGREP.getDetail(), PGREP.getParams());

	public static final Command PMAP = new Command("pmap", "Reports the memory map of a process or processes.",
			new CommandParam("-x", "Show the extended format."),
			new CommandParam("-q", "Do not display some header/footer lines."));

	public static final Command PRINTENV = new Command("printenv", "Print environment variables.",
			new CommandParam("-0", "Use \\0 as delimiter instead of \\n"));

	public static final Command YES = new Command("yes", "");

	public static final Command NULL = new Command("", "", new CommandParam("", ""));
}
