DESCRIPTION = "github.com/denisenkom/go-mssqldb"

GO_IMPORT = "github.com/denisenkom/go-mssqldb"

DEPENDS += "golang.org-x-crypto"
inherit go

SRC_URI = "git://github.com/denisenkom/go-mssqldb;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "8e6115d5172422909579b49fd1fe0f7591416e4b" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=591778525c869cdde0ab5a1bf283cd81"

GO_INSTALL = "\
    ${GO_IMPORT} \
    "

FILES_${PN} += "${GOBIN_FINAL}/*"
