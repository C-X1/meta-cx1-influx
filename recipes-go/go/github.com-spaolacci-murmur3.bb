DESCRIPTION = "github.com/spaolacci/murmur3"

GO_IMPORT = "github.com/spaolacci/murmur3"

inherit go

SRC_URI = "git://github.com/spaolacci/murmur3;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "f09979ecbc725b9e6d41a297405f65e7e8804acc"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=d6f737a1e81c08cd7e1720e8428f2ff6"

FILES_${PN} += "${GOBIN_FINAL}/*"
