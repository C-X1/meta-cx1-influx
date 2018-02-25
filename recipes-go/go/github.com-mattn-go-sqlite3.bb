DESCRIPTION = "github.com/mattn/go-sqlite3"

GO_IMPORT = "github.com/mattn/go-sqlite3"

inherit go

SRC_URI = "git://github.com/mattn/go-sqlite3;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
# v1.6.0
SRCREV = "6c771bb9887719704b210e87e934f08be014bdb1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=2b7590a6661bc1940f50329c495898c6"

FILES_${PN} += "${GOBIN_FINAL}/*"
