SUMMARY = "Package management tool"

SECTION = "ports-mgmt"
HOMEPAGE = "http://wiki.freebsd.org/pkgng"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

DEPENDS = "libtool tar xz zlib bzip2 liblzma"
DEPENDS_class-native = "libtool-native tar-native xz-native virtual/update-alternatives-native"

RDEPENDS_${PN} = "${VIRTUAL-RUNTIME_update-alternatives} xz"
RDEPENDS_${PN}_class-native = "xz-native"

SRC_URI = "http://files.etoilebsd.net/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = "6cf178ce356588cddcba60a2c53ef18f5aac2c87628e3d3924a54743573aee4d"

inherit autotools-brokensep


autotools_do_compile() {
    mkdir -p ${B}/external/libelf
    
    oe_runmake
}


BBCLASSEXTEND = "native"
