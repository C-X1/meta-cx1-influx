DESCRIPTION = "github.com/shopspring/decimal"

GO_IMPORT = "github.com/shopspring/decimal"

inherit go

SRC_URI = "git://github.com/shopspring/decimal;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "e3482495ff4cba75613e4177ed79825c890058a9"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=d21d25475326cf7f1b36eef8c9789801"

FILES_${PN} += "${GOBIN_FINAL}/*"

