DESCRIPTION = "github.com/OneOfOne/xxhash"

GO_IMPORT = "github.com/OneOfOne/xxhash"

inherit go

SRC_URI = "git://github.com/OneOfOne/xxhash;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "4e9e81466dc37c9fd94ce9ecf42020ef54112203"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=7b8ee9b837e70f675fc861ec7e3af440"

FILES_${PN} += "${GOBIN_FINAL}/*"
