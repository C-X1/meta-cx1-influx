DESCRIPTION = "github.com/Shopify/toxiproxy"

GO_IMPORT = "github.com/Shopify/toxiproxy"

inherit go

SRC_URI = "git://github.com/Shopify/toxiproxy;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "a32143133e8cdad36feb1ad9a48ffefb7451b7d9"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3924460e44dd69d7dc81cd5fff4c202a"

FILES_${PN} += "${GOBIN_FINAL}/*"

