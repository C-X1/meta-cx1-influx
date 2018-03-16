DESCRIPTION = "github.com/alicebob/gopher-json"

GO_IMPORT = "github.com/alicebob/gopher-json"

inherit go

SRC_URI = "git://github.com/alicebob/gopher-json;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "5a6b3ba71ee69b77cf64febf8b5a7526ca5eaef0"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=605b9ee741fb194674b08ff2532e52b1"

FILES_${PN} += "${GOBIN_FINAL}/*"

GO_INSTALL = "\
    ${GO_IMPORT} \
    "
DEPENDS += "github.com-yuin-gopher-lua"

RDEPENDS_${PN}-dev += "\
                             bash \
                             "
