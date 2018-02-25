DESCRIPTION = "github.com/ugorji/go"

GO_IMPORT = "github.com/ugorji/go"

inherit go

SRC_URI = "git://github.com/ugorji/go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "708a42d246822952f38190a8d8c4e6b16a0e600c" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=a03c0693c900925da5789db4e72da142"

FILES_${PN} += "${GOBIN_FINAL}/*"

RDEPENDS_${PN}-dev += "bash"
