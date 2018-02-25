DESCRIPTION = "github.com/kr/pretty"

GO_IMPORT = "github.com/kr/pretty"

inherit go

SRC_URI = "git://github.com/kr/pretty;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "cfb55aafdaf3ec08f0db22699ab822c50091b1c4" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=9d305c2010c6891ee4f3cd42a562f78f"

DEPENDS += "github.com-kr-text"

FILES_${PN} += "${GOBIN_FINAL}/*"
