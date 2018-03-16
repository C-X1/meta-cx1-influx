DESCRIPTION = "github.com/soniah/gosnmp"

GO_IMPORT = "github.com/soniah/gosnmp"

inherit go

SRC_URI = "git://github.com/soniah/gosnmp;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "5ad50dc75ab389f8a1c9f8a67d3a1cd85f67ed15" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6fce31528a83987fac6b358da300076a"

GO_INSTALL="\
    ${GO_IMPORT} \
    "

FILES_${PN} += "${GOBIN_FINAL}/*"


RDEPENDS_${PN}-dev += "\
                             bash \
                             "