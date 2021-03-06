DESCRIPTION = "Power Management utility for OpenXT"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"
DEPENDS = "openxt-idl dbus en-tools libxcdbus libxenacpi openxt-rpcgen-native pciutils"

PV = "0+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = "git://${OPENXT_GIT_MIRROR}/xctools.git;protocol=${OPENXT_GIT_PROTOCOL};branch=${OPENXT_BRANCH}"

EXTRA_OECONF += "--with-idldir=${STAGING_IDLDIR}"

S = "${WORKDIR}/git/pmutil"

ASNEEDED = ""

inherit autotools openxt pkgconfig


