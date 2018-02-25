DESCRIPTION = "github.com/kr/text"

GO_IMPORT = "github.com/kr/text"

inherit go

SRC_URI = "git://github.com/kr/text;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "7cafcd837844e784b526369c9bce262804aebc60"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=449bfedd81a372635934cf9ce004c0cf"

DEPENDS += "github.com-kr-pty"

FILES_${PN} += "${GOBIN_FINAL}/*"
