DESCRIPTION = "github.com/bitly/go-hostpool"

GO_IMPORT = "github.com/bitly/go-hostpool"

inherit go

SRC_URI = "git://github.com/bitly/go-hostpool;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "a3a6125de9329587178a9792dc8f4bc98e620d2d"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6747d3f533dc3a43a1a26eaa57170557"
DEPENDS += "github.com-stretchr-testify"

FILES_${PN} += "${GOBIN_FINAL}/*"
