
# bsd needs the static lib.
EXTRA_OECONF_remove = "--disable-static"

# package up everybody
FILES_liblzma = "${libdir}/liblzma*"
