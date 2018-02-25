DESCRIPTION = "github.com/cespare/xxhash"

GO_IMPORT = "github.com/cespare/xxhash"

inherit go

SRC_URI = "git://github.com/cespare/xxhash;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "4a94f899c20bc44d4f5f807cb14529e72aca99d6"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9"

DEPENDS += "github.com-oneofone-xxhash github.com-spaolacci-murmur3"
FILES_${PN} += "${GOBIN_FINAL}/*"
