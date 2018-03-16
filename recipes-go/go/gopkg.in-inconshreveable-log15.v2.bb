DESCRIPTION = "gopkg.in/inconshreveable/log15.v2"

GO_IMPORT = "gopkg.in/inconshreveable/log15.v2"

inherit go

SRC_URI = "git://gopkg.in/inconshreveable/log15.v2;branch=v2;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "b105bd37f74e5d9dc7b6ad7806715c7a2b83fd3f" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b23cff9db13f093a4e6ff77105cbd8eb"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS += "\
    github.com-mattn-go-colorable \
"
