DESCRIPTION = "github.com/rcrowley/go-metrics"

GO_IMPORT = "github.com/rcrowley/go-metrics"

inherit go

SRC_URI = "git://github.com/rcrowley/go-metrics;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "1f30fe9094a513ce4c700b9a54458bbb0c96996c" 
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=1bdf5d819f50f141366dabce3be1460f"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS +="\
    github.com-stathat-go \
"

RDEPENDS_${PN}-dev += "bash"
