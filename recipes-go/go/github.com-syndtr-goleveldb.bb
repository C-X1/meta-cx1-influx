DESCRIPTION = "github.com/syndtr/goleveldb"

GO_IMPORT = "github.com/syndtr/goleveldb"

inherit go

SRC_URI = "git://github.com/syndtr/goleveldb;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "8c81ea47d4c41a385645e133e15510fc6a2a74b4" 
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6b6b03a3c410317c558abe499de9b5a7"

FILES_${PN} += "${GOBIN_FINAL}/*"


DEPENDS+="\
    github.com-onsi-ginkgo \
    github.com-onsi-gomega \
    github.com-golang-snappy \
"
