DESCRIPTION = "github.com/garyburd/redigo"

GO_IMPORT = "github.com/garyburd/redigo"

inherit go

SRC_URI = "git://github.com/garyburd/redigo;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
# Release 1.5.0
SRCREV = "d1ed5c67e5794de818ea85e6b522fda02623a484"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

FILES_${PN} += "${GOBIN_FINAL}/*"

GO_INSTALL = "\
    ${GO_IMPORT}/redis \
    "
RDEPENDS_${PN}-dev += "\
                             bash \
                             "
