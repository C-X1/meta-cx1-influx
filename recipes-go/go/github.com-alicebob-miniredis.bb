DESCRIPTION = "github.com/alicebob/miniredis"

GO_IMPORT = "github.com/alicebob/miniredis"

inherit go

SRC_URI = "git://github.com/alicebob/miniredis;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
# Release 2.3.2
SRCREV = "9d52b1fc8da9c42dae29127fdc6f795ddcd4810f"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fb0ce8a70f87033b73d07cfbd2088ef1"

FILES_${PN} += "${GOBIN_FINAL}/*"

GO_INSTALL = "\
    ${GO_IMPORT} \
    "
DEPENDS += "github.com-alicebob-gopher-json github.com-garyburd-redigo-redis"

RDEPENDS_${PN}-dev += "\
                             bash \
                             "
