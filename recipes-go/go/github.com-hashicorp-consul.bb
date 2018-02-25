DESCRIPTION = "github.com/hashicorp/consul"

GO_IMPORT = "github.com/hashicorp/consul"

inherit go

SRC_URI = "git://github.com/hashicorp/consul;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "63d2fc68239b996096a1c55a0d4b400ea4c2583f" 
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b278a92d2c1509760384428817710378"

FILES_${PN} += "${GOBIN_FINAL}/*"

RDEPENDS_${PN}-dev += "bash"
