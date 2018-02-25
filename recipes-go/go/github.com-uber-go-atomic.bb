DESCRIPTION = "github.com/uber-go/atomic"

GO_IMPORT = "github.com/uber-go/atomic"

inherit go

SRC_URI = "git://github.com/uber-go/atomic;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
# v1.3.1
SRCREV = "8474b86a5a6f79c443ce4b2992817ff32cf208b8"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=1caee86519456feda989f8a838102b50"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS += "github.com-stretchr-testify go.uber.org-atomic"

RDEPENDS_${PN}-dev += "bash"
