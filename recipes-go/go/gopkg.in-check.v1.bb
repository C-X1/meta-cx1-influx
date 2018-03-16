DESCRIPTION = "gopkg.in/check.v1"

GO_IMPORT = "gopkg.in/check.v1"

inherit go

SRC_URI = "git://gopkg.in/check.v1;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "20d25e2804050c1cd24a7eea1e7a6447dd0e74ec" 
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=598d6673548efc92a7d6dfb739add1ed"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    gopkg.in-tomb.v2 \
"
