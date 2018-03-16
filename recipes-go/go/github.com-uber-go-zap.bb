DESCRIPTION = "github.com/uber-go/zap"
GO_IMPORT = "github.com/uber-go/zap"

inherit go

SRC_URI = "git://github.com/uber-go/zap;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "fbae0281ffd546fa6d1959fec6075ac5da7fb577"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=1caee86519456feda989f8a838102b50"


GO_INSTALL = "\
    ${GO_IMPORT} \
    "

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS += "\
    github.com-uber-go-atomic \
    "

RDEPENDS_${PN}-dev = "bash"
